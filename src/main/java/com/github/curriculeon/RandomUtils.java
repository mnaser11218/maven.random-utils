package com.github.curriculeon;

import java.awt.*;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by Leon on 2/4/2017.
 */
public final class RandomUtils {
    private static volatile Random random = new Random();

    private RandomUtils() {
        /** This class is uninstantiable */
    }

    /**
     * @return true with the likelihood of specified percentage
     */
    public static Boolean createBoolean(float percentage) {
        return null;
    }

    /**
     * @return a random character between the specified min and max character range
     */
    public static Character createCharacter(char min, char max) {
        return null;
    }

    /**
     * @return a random double between the specified min and max numeric range
     */
    public static Float createFloat(float min, float max) {
        return null;
    }

    /**
     * @return a random float between the specified min and max numeric range
     */
    public static Double createDouble(double min, double max) {
        return null;
    }

    /**
     * @return a random integer between the specified min and max numeric range
     */
    public static Integer createInteger(int min, int max) {
        return null;
    }

    /**
     * @return a random long between the specified min and max numeric range
     */
    public static Long createLong(long min, long max) {
        return null;
    }

    /**
     * @return a random string of the specified length containing characters in the specified range
     */
    public static String createString(char min, char max, int stringLength) {
        return null;
    }

    /**
     * @return an array of random string objects of the specified length containing characters in the specified range
     */
    public static String[] createStrings(char min, char max, int stringLength, int stringCount) {
        return null;
    }

    /**
     * @param minYear minimum year-value to be generated
     * @param maxYear maximum year-value to be generated
     * @return a random Date value within the specified min and max year
     */
    public static Date createDate(Number minYear, Number maxYear) {
        return null;
    }

    /**
     * @param minDate minimum Date to be returned
     * @param maxDate minimum Date to be returned
     * @return random date between the specified `minDate` and `maxDate`
     */
    public static Date createDate(Date minDate, Date maxDate) {
        return null;
    }

    /**
     * @param array     an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(AnyType[] array) {
        return null;
    }

    /**
     * @param list      an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(List<AnyType> list) {
        return null;
    }

    /**
     * @return specified string value with random upper and lower casing assigned to each character
     */
    public static String shuffleCasing(String str) {
        return null;
    }

    /**
     * @return shuffles the specified string array
     */
    public static <AnyType> AnyType[] shuffleArray(AnyType[] array) {
        return null;
    }

    /**
     * @return a random color with the specified maximum rgb values
     */
    public static Color createColor(int maxRed, int maxGreen, int maxBlue) {
        return null;
    }
}