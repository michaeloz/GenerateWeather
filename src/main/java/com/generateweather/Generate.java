/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

import static com.generateweather.HelperUtils.toDate;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.ParseException;

/**
 *
 * @author Michael
 */
public class Generate {

    /**
     *
     * @param args
     * @throws IOException
     * @throws ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {

        // load the map so we can determine height dynamically
        BufferedImage worldTopographyMap = HelperUtils.loadWorldTopographyMap();
        /*
         SYD Latitude : -33.9357	Longitude : 151.166 // sydney
         HBA Latitude : -42.8361	Longitude : 147.51  // hobart
         DRW Latitude : -12.4147	Longitude : 130.877 // darwin
         YVR Latitude : 49.1936	Longitude : -123.181 // vancover 
         LAX Latitude : 33.9435	Longitude : -118.409 // Los Angles
         JFK Latitude : 40.6444	Longitude : -73.7827 // John F Kennedy
         LHR Latitude : 51.4706	Longitude : -0.461941 // London Heathrow
         HEM Latitude : 60.2544	Longitude : 25.0465 // Helsinki
         PHB Latitude : -2.9	Longitude : -41.7667 //  Parnaiba Brazil
         RKZ Latitude : 29.3463	Longitude : 89.3006 // Tibeten airport
         */

        //System.out.println("Winter/Summer");
        HelperUtils.getReading("SYD", (double) -33.9357, (double) 151.166, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HBA", (double) -42.8361, (double) 147.51, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("DRW", (double) -12.4147, (double) 130.877, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("YVR", (double) 49.1936, (double) -123.181, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LAX", (double) 33.9435, (double) -118.409, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("JFK", (double) 40.6444, (double) -73.7827, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LHR", (double) 51.4706, (double) -0.461941, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HEM", (double) 60.2544, (double) 25.0465, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("PHB", (double) -2.9, (double) -41.7667, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("RKZ", (double) 29.3463, (double) 89.3006, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);

        //System.out.println("Summer/Winter");
        HelperUtils.getReading("SYD", (double) -33.9357, (double) 151.166, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HBA", (double) -42.8361, (double) 147.51, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("DRW", (double) -12.4147, (double) 130.877, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("YVR", (double) 49.1936, (double) -123.181, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LAX", (double) 33.9435, (double) -118.409, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("JFK", (double) 40.6444, (double) -73.7827, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LHR", (double) 51.4706, (double) -0.461941, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HEM", (double) 60.2544, (double) 25.0465, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("PHB", (double) -2.9, (double) -41.7667, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("RKZ", (double) 29.3463, (double) 89.3006, toDate("2016-01-01T22:05:13Z"), worldTopographyMap);

        //System.out.println("Spring/Autumn");
        HelperUtils.getReading("SYD", (double) -33.9357, (double) 151.166, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HBA", (double) -42.8361, (double) 147.51, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("DRW", (double) -12.4147, (double) 130.877, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("YVR", (double) 49.1936, (double) -123.181, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LAX", (double) 33.9435, (double) -118.409, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("JFK", (double) 40.6444, (double) -73.7827, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LHR", (double) 51.4706, (double) -0.461941, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HEM", (double) 60.2544, (double) 25.0465, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("PHB", (double) -2.9, (double) -41.7667, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("RKZ", (double) 29.3463, (double) 89.3006, toDate("2016-03-01T22:05:13Z"), worldTopographyMap);

        //System.out.println("Autumn/Spring");
        HelperUtils.getReading("SYD", (double) -33.9357, (double) 151.166, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HBA", (double) -42.8361, (double) 147.51, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("DRW", (double) -12.4147, (double) 130.877, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("YVR", (double) 49.1936, (double) -123.181, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LAX", (double) 33.9435, (double) -118.409, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("JFK", (double) 40.6444, (double) -73.7827, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("LHR", (double) 51.4706, (double) -0.461941, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("HEM", (double) 60.2544, (double) 25.0465, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("PHB", (double) -2.9, (double) -41.7667, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);
        HelperUtils.getReading("RKZ", (double) 29.3463, (double) 89.3006, toDate("2016-11-01T22:05:13Z"), worldTopographyMap);

    }
}
