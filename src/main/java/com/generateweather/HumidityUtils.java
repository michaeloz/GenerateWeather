/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

/**
 *
 * @author Michael
 */
public class HumidityUtils {

    /**
     * This function simulates humidity
     * @return a value between 0 and 100 representing hummidity
     */
    public static int humidity() {
        return HelperUtils.randInt(0, 100);
    }
    
}
