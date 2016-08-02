/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Michael
 */
public class TemperatureUtilsTest {

    public TemperatureUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of temperature method, of class TemperatureUtils.
     */
    @Test
    public void testTemperature() {
        System.out.println("temperature");
        double measurementLatitude = -33.9357;
        Double height = (double) 0;
        Definitions.Seasion seasion = Definitions.Seasion.Summer;
        double expResult = 0.0;
     /*    TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Summer);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Winter);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Autumn);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Spring); */

         measurementLatitude = -90;
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Summer);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Winter);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Autumn);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Spring);         
        /*    measurementLatitude = 90;
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Summer);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Winter);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Autumn);
         TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Spring);           */
     /*     measurementLatitude = 29.3463;
        height = (double) 201;
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Summer);
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Winter);
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Autumn);
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Spring); */

    /*    measurementLatitude = 60.2544;
        height = (double) 0;
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Summer);
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Winter);
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Autumn);
        TemperatureUtils.temperature(measurementLatitude, height, Definitions.Seasion.Spring);         */
        
        //assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        ///fail("The test case is a prototype.");
//HelperUtils.getReading("SYD", (double) -33.9357, (double) 151.166, toDate("2016-08-01T22:05:13Z"), worldTopographyMap);        
    }

}
