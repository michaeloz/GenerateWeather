/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

/**
 *
 * @author Michael
 */
public class ConditionUtils {

    /**
     * This function returns the condition string for the reading
     * @param temperature
     * @return a string representing the weather condition randomly generated. The only condition that is weather dependent is snow i.e. if its not less than 0 it can't snow 
     */
    public static String condition(Double temperature) {
        String condition = Definitions.OVERCAST;
        int randomIndex = HelperUtils.randInt(0, 100);
        if (temperature < 0) {
            switch (randomIndex % 3) {
                case 0:
                    condition = Definitions.SNOW;
                    break;
                case 1:
                    condition = Definitions.SUNNY;
                    break;
                case 2:
                    condition = Definitions.OVERCAST;
                    break;
            }
        } else {
            switch (randomIndex % 3) {
                case 0:
                    condition = Definitions.RAIN;
                    break;
                case 1:
                    condition = Definitions.SUNNY;
                    break;
                case 2:
                    condition = Definitions.OVERCAST;
                    break;
            }
        }
        return condition;
    }
    
}
