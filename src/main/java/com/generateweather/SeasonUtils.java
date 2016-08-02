/*
 * (C) 2016 KimMic International Pty. Ltd. All rights reserved
 */
package com.generateweather;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author Michael
 */
public class SeasonUtils {

    /**
     * This function determines the season based upon the lattitude and time-of-year
     * @param measurementLatitude
     * @param measurementDate
     * @return Seasion
     */
    public static Definitions.Seasion season(double measurementLatitude, Date measurementDate) {
        LocalDate localDate = measurementDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int monthNumber = localDate.getMonth().getValue();
        boolean isSouthernHemisphere = measurementLatitude < 0;
        Definitions.Seasion seasion = null;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                seasion = isSouthernHemisphere ? Definitions.Seasion.Summer : Definitions.Seasion.Winter;
                break;
            case 3:
            case 4:
            case 5:
                seasion = isSouthernHemisphere ? Definitions.Seasion.Autumn : Definitions.Seasion.Spring;
                break;
            case 6:
            case 7:
            case 8:
                seasion = isSouthernHemisphere ? Definitions.Seasion.Winter : Definitions.Seasion.Summer;
                break;
            case 9:
            case 10:
            case 11:
                seasion = isSouthernHemisphere ? Definitions.Seasion.Spring : Definitions.Seasion.Autumn;
                break;
        }
        return seasion;
    }
    
}
