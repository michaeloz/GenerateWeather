/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

import com.generateweather.Definitions.Seasion;
import static com.generateweather.Definitions.Seasion.Autumn;
import static com.generateweather.Definitions.Seasion.Spring;
import static com.generateweather.Definitions.Seasion.Summer;
import static com.generateweather.Definitions.Seasion.Winter;
import static java.lang.Math.abs;

/**
 *
 * @author Michael
 */
public class DistanceUtils {

    /**
     * This function an index between 0 and 1 representing the closeness of the lattitude co-ordinate to the closest or furthest point to the sun 
     * @param measurementLatitude
     * @param seasion
     * @return an index between 0 and 1 representing the closeness of the lattitude co-ordinate to the closest or furthest point to the sun
     * given the season i.e. summer and winter have the biggest tilt while autumn and spring are transition periods where the earth
     * is moving between the extremes of summer and winter. 0 means the lattitude is the closest while 1 means the lattitude is the furthest
     */
    public static double distanceIndex(double measurementLatitude, Seasion seasion) {
        double absoluteLatitude = abs(measurementLatitude);
        double distanceIndex = 0;
        switch (seasion) {
            case Summer:
            case Winter:
                distanceIndex = (abs(Definitions.MAXIMUM_EARTH_TILT - absoluteLatitude) / 90);
                break;
            case Autumn:
            case Spring:
                distanceIndex = (abs(Definitions.MINIMUM_EARTH_TILT - absoluteLatitude) / 90);
                break;
        }
        return distanceIndex;
    }
    
    public static double polarDistanceIndex(double measurementLatitude) {
        double absoluteLatitude = abs(measurementLatitude);
        double distanceIndex = (abs(90 - absoluteLatitude) / 90);
        return distanceIndex;
    }    
    
    
}
