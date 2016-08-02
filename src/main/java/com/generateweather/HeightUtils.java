/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

import java.awt.image.BufferedImage;

/**
 *
 * @author Michael
 */
public class HeightUtils {

    /**
     * This function converts imageIntensity (representing height) to an index that is used for simulating temperature drops due to height
     * @param imageIntensity
     * @return
     */
    public static double heightIndex(double imageIntensity) {
        return imageIntensity / 70;
    }

    /**
     * This function converts a measurementLatitude, measurementLongitude into a pixel co-ordinate and reads the 
     * associated pixel and returns the red value of the pixel - representing height - 0 is low, 255 is high
     * @param image
     * @param measurementLatitude
     * @param measurementLongitude
     * @return returns the red value of the read pixel 
     */
    public static double height(BufferedImage image, Double measurementLatitude, Double measurementLongitude) {
        int w = image.getWidth();
        int h = image.getHeight();
        int zeroLat = h / 2;
        int zeroLong = w / 2;
        Double degreeXPerPixel = (double) w / 360;
        Double degreeYPerPixel = (double) h / 180;
        int y = zeroLat + ((int) Math.round(measurementLatitude * degreeYPerPixel * -1));
        int x = zeroLong + ((int) Math.round(measurementLongitude * degreeXPerPixel));
        int pixel = image.getRGB(x, y);
        return (pixel >> 16) & 255;
    }
    
}
