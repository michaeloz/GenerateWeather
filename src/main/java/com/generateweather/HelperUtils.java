/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author Michael
 */
public class HelperUtils {

    /**
     * This function reads the supplied geographic map into a buffer for height determination
     * @return the read image
     * @throws IOException
     */
    public static BufferedImage loadWorldTopographyMap() throws IOException {
        return ImageIO.read(Generate.class.getClassLoader().getResourceAsStream("gebco_08_rev_elev_21600x10800.png"));
    }

    /**
     * This function is a utility to print out the contents of a image oixel
     * @param pixel
     */
    public static void printPixelARGB(int pixel) {
        int alpha = (pixel >> 24) & 255;
        int red = (pixel >> 16) & 255;
        int green = (pixel >> 8) & 255;
        int blue = (pixel) & 255;
        System.out.println("argb: " + alpha + ", " + red + ", " + green + ", " + blue);
    }

    /**
     * This function formats and prints the given information to the console/stdout
     * @param ATACode
     * @param measurementLatitude
     * @param measurementLongitude
     * @param measurementDate
     * @param temperature
     * @param pressure
     * @param humidity
     * @param condition
     */
    public static void writeToConsole(String ATACode,Double measurementLatitude, Double measurementLongitude, Date measurementDate, Double temperature, Double pressure, int humidity, String condition) {        
        String delimiter = "|";
        String latLongDelimeter = ",";
        LocalDateTime localDate = measurementDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String text = localDate.format(formatter);
        DecimalFormat latLongFormat = new DecimalFormat("+#,##0.0000;-#");
        DecimalFormat temperatureFormat = new DecimalFormat("+#,##0.00;-#");
        DecimalFormat presureFormat = new DecimalFormat("#.#");
        String output = "";
        output = output.concat(ATACode)
                .concat(delimiter).concat(latLongFormat.format(measurementLatitude))
                .concat(latLongDelimeter).concat(latLongFormat.format(measurementLongitude))
                .concat(delimiter).concat(text).concat(delimiter)
                .concat(condition).concat(delimiter).concat(temperatureFormat.format(temperature))
                .concat(delimiter).concat(presureFormat.format(pressure)).concat(delimiter).concat(Integer.toString(humidity));
        System.out.println(output);        
        
    }

    /**
     * This function takes a timezone string and converts it to a Java Date 
     * @param dateToConvert
     * @return
     * @throws ParseException
     */
    public static Date toDate(String dateToConvert) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = formatter.parse(dateToConvert);
        return date;
    }

    /**
     * This function orchestrates the function calls required to get a reading for a given geographical point and prints the result to the console/stdout 
     * @param ATACode
     * @param measurementLatitude
     * @param measurementLongitude
     * @param measurementDate
     * @param image
     */
    public static void getReading(String ATACode, Double measurementLatitude, Double measurementLongitude, Date measurementDate, BufferedImage image) {
        Double height = HeightUtils.height(image, measurementLatitude, measurementLongitude);
        Double temperature = TemperatureUtils.temperature(measurementLatitude, height, SeasonUtils.season(measurementLatitude, measurementDate));
        Double pressure = PresureUtils.presure(height);
        int humidity = HumidityUtils.humidity();
        String condition = ConditionUtils.condition(temperature);;
        HelperUtils.writeToConsole(ATACode, measurementLatitude,  measurementLongitude, measurementDate, temperature, pressure, humidity, condition);
    }

    /**
     * This function generates a psuedo random number between the min and max supplied
     * @param min
     * @param max
     * @return number in the supplied range
     */
    public static int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
}
