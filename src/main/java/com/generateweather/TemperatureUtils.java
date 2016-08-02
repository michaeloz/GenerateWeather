/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

import static com.generateweather.Definitions.POLAR_LATTITUDE_CUTOFF;
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
public class TemperatureUtils {

    /**
     * This function simulates the temperature at a given point by 
     * 1) Firstly determining as a index between 0 and 1 how close the given lattitude is to from the nearest/furthest point on Earth to the sun (0 = closest, 1=furthest)
     * 2) By using the season and the index one of three base temperatures will be used :
     *      i) If we are "in the zone" ( less than lattitude 70) then the average min and max at the equator will be used (the assumption being that the closest/furthest point on Earth due to tilt
     *         will be the same or at least similar to the temperature fluctuations at the equator.
     *      ii) If we are "out of the zone" ( greater than or equal to lattitude 70) then we are going to use the average min and max of the relevant pole. This is necessary as the poles vary in the min and maxs and the distance index is
     *          changed to a polar Distance Index (distance from the pole regardless of season) as we are now measuring distance from the relevant pole.
     *      
     * 3) The basetemperature is adjust as a function of how close the measurementLatitude is to the point (baseTemperature * (1 - (distanceIndex - 0.001))) i.e. if index is 0 its the same lattitude
     *    so it will be the basetemperature. 
     * 4) The height as returned from the geographic map is converted into degrees C drop in temperature i.e. the higher you go the colder it gets
     * 5) The whole lot is added together an returned as the temperature based on that lattitude, height and season
     * 
     * @param measurementLatitude
     * @param height
     * @param seasion
     * @return temperature C
     */
    public static double temperature(double measurementLatitude, Double height, Seasion seasion) {
        // get an index between 0 and 1 indicating how far the measurementLatitude 
        double distanceIndex;
        boolean isPolar = abs(measurementLatitude) > POLAR_LATTITUDE_CUTOFF;
        if (isPolar) {
            distanceIndex = DistanceUtils.polarDistanceIndex(measurementLatitude);
        } else {
            distanceIndex = DistanceUtils.distanceIndex(measurementLatitude, seasion);
        }     
        // generate a random daily temperature variance
        int dailyVariance = HelperUtils.randInt(0, Definitions.DEGREES_C_DAILY_TEMPERATURE_VARIANCE);
        // that we either add to or subtract from the caculated temperature
        double sign = dailyVariance % 2 == 0 ? -1 : 1;
        // 
        boolean isSouthernHemisphere = measurementLatitude < 0;
        double baseTemperature = 0;
        switch (seasion) {
            case Summer:
                baseTemperature = !isPolar ? Definitions.MAXIMUM_TEMPERATURE_AVERAGE : (isSouthernHemisphere ? Definitions.MAXIMUM_SOUTH_POLE_TEMPERATURE_AVERAGE : Definitions.MAXIMUM_NORTH_POLE_TEMPERATURE_AVERAGE);
                break;
            case Winter:
                baseTemperature = !isPolar ? Definitions.MINIMUM_TEMPERATURE_AVERAGE : (isSouthernHemisphere ? Definitions.MINIMUM_SOUTH_POLE_TEMPERATURE_AVERAGE : Definitions.MINIMUM_NORTH_POLE_TEMPERATURE_AVERAGE);
                break;
            case Autumn:
            case Spring:
                baseTemperature = !isPolar ? Definitions.TRANSITION_TEMPERATURE_AVERAGE : (isSouthernHemisphere ? Definitions.TRANSITION_SOUTH_POLE_TEMPERATURE_AVERAGE : Definitions.TRANSITION_NORTH_POLE_TEMPERATURE_AVERAGE);
                break;
        }
        double temperature = (baseTemperature * (1 - (distanceIndex - 0.001))) + (dailyVariance * sign) + (HeightUtils.heightIndex(height) * Definitions.DEGREES_C_DROP_PER_1000_METERS);
        return temperature;
    }
    
}
