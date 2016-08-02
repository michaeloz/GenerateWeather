/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

/**
 *
 * @author Michael
 */
public class PresureUtils {

    /**
     * This function simulates presure based upon height
     * @param height
     * @return an adjusted hpa reading based on adjusting a base sea level presure with the height and a random fluctuation
     */
    public static Double presure(Double height) {
        return Definitions.SEA_LEVEL_HPA - (HeightUtils.heightIndex(height) * Definitions.HPA_DROP_PER_1000_METERS) + HelperUtils.randInt(0, 100);
    }
    
}
