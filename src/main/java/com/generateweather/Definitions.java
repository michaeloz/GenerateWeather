/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

/**
 *
 * @author Michael
 */
public class Definitions {

    /**
     *
     */
    public static enum Seasion {

        Summer,
        Autumn,
        Winter,
        Spring
    }

    /**
     *
     */
    public final static double MAXIMUM_EARTH_TILT = (double) 23.5;

    /**
     *
     */
    public final static double MINIMUM_EARTH_TILT = (double) 0;

    /**
     *
     */
    public final static int DEGREES_C_DAILY_TEMPERATURE_VARIANCE = (int) 5;

    /**
     *
     */
    
     public final static double POLAR_LATTITUDE_CUTOFF = (double)  70;

    /**
     *
     */
    public final static double POLAR_DISTANCE_INDEX_CUTOFF_WINTER = (double) 0.4;

    /**
     *
     */
    public final static double POLAR_DISTANCE_INDEX_CUTOFF_TRANSITION = (double) 0.45;

    /**
     *
     */
    public final static double MAXIMUM_NORTH_POLE_TEMPERATURE_AVERAGE = (double) 0;

    /**
     *
     */
    public final static double TRANSITION_NORTH_POLE_TEMPERATURE_AVERAGE = (double) -20;

    /**
     *
     */
    public final static double MINIMUM_NORTH_POLE_TEMPERATURE_AVERAGE = (double) -40;

    /**
     *
     */
    public final static double MAXIMUM_SOUTH_POLE_TEMPERATURE_AVERAGE = (double) -28.2;

    /**
     *
     */
    public final static double TRANSITION_SOUTH_POLE_TEMPERATURE_AVERAGE = (double) -44.1;

    /**
     *
     */
    public final static double MINIMUM_SOUTH_POLE_TEMPERATURE_AVERAGE = (double) -60;

    /**
     *
     */
    public final static double MAXIMUM_TEMPERATURE_AVERAGE = (double) 30;

    /**
     *
     */
    public final static double TRANSITION_TEMPERATURE_AVERAGE = (double) 22.5;

    /**
     *
     */
    public final static double MINIMUM_TEMPERATURE_AVERAGE = (double) 15;

    /**
     *
     */
    public final static double DEGREES_C_DROP_PER_1000_METERS = (double) -5;

    /**
     *
     */
    public final static double SEA_LEVEL_HPA = (double) 1014;

    /**
     *
     */
    public final static double HPA_DROP_PER_1000_METERS = (double) 80;

    /**
     *
     */
    public final static String SNOW = "SNOW";

    /**
     *
     */
    public final static String RAIN = "RAIN";

    /**
     *
     */
    public final static String SUNNY = "SUNNY";

    /**
     *
     */
    public final static String OVERCAST = "OVERCAST";

}
