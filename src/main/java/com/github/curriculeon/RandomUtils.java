package com.github.curriculeon;

import java.awt.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/**
 * Created by Leon on 2/4/2017.
 */
public final class RandomUtils {
   // private static volatile Random random = new Random();
    private static volatile ThreadLocalRandom random= ThreadLocalRandom.current();


    private RandomUtils() {
        /** This class is uninstantiable */
    }

    /**
     * @return true with the likelihood of specified percentage
     */
    public static Boolean createBoolean(float percentage) {
      // return random.nextBoolean(percentage);
        return false;
    }

    /**
     * @return a random character between the specified min and max character range
     */
    public static Character createCharacter(char min, char max) {
        return (char) random.nextInt(min, max);
    }

    /**
     * @return a random double between the specified min and max numeric range
     */
    public static Float createFloat(float min, float max) {
       // return random.
        return (float) random.nextInt((int)min,(int) max);
    }

    /**
     * @return a random float between the specified min and max numeric range
     */
    public static Double createDouble(double min, double max) {
        return random.nextDouble(min, max);
      //  return null;
    }

    /**
     * @return a random integer between the specified min and max numeric range
     */
    public static Integer createInteger(int min, int max) {
        return random.nextInt(min, max);
        // return null;
    }

    /**
     * @return a random long between the specified min and max numeric range
     */
    public static Long createLong(long min, long max) {
        return random.nextLong(min, max);
    }

    /**
     * @return a random string of the specified length containing characters in the specified range
     */
    public static String createString(char min, char max, int stringLength) {
        StringBuilder results = new StringBuilder();
        for(int i =0;i<stringLength;i++){
            results.append(createCharacter(min, max));
        }
       // System.out.println("testing: " + results.);
        return results.toString();
    }

    /**
     * @return an array of random string objects of the specified length containing characters in the specified range
     */
    public static String[] createStrings(char min, char max, int stringLength, int stringCount) {
        String[]results = new String[stringCount];
        for(int i =0; i<stringCount;i++){
            results[i] = createString(min, max, stringLength);
        }
        return results;

    }

    /**
     * @param minYear minimum year-value to be generated
     * @param maxYear maximum year-value to be generated
     * @return a random Date value within the specified min and max year
     */
    public static Date createDate(Number minYear, Number maxYear) {
//        Calendar calendar = Calendar.getInstance();
//        int randomYear = ThreadLocalRandom.current().nextInt(minYear.intValue(), maxYear.intValue() + 1);
//
//        int randomMonth = ThreadLocalRandom.current().nextInt(0, 12); // Months are 0-11 in Calendar
//        calendar.set(randomYear, randomMonth, 1); // Set to the first day of the month to avoid invalid days
//        int randomDay = ThreadLocalRandom.current().nextInt(1, calendar.getActualMaximum(Calendar.DAY_OF_MONTH) + 1);
//
//        int randomHour = ThreadLocalRandom.current().nextInt(0, 24);
//        int randomMinute = ThreadLocalRandom.current().nextInt(0, 60);
//        int randomSecond = ThreadLocalRandom.current().nextInt(0, 60);
//
//        calendar.set(randomYear, randomMonth, randomDay, randomHour, randomMinute, randomSecond);
//
//        return calendar.getTime();
        return null;
    }


    /**
     * @param minDate minimum Date to be returned
     * @param maxDate minimum Date to be returned
     * @return random date between the specified `minDate` and `maxDate`
     */
    public static Date createDate(Date minDate, Date maxDate) {
        long minTime = minDate.getTime();
        long maxTime = maxDate.getTime();

        long randomTime = random.nextLong(minTime, maxTime+1);

        return new Date(randomTime);
    }

    /**
     * @param array     an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(AnyType[] array) {
       // System.out.println();
        return array[random.nextInt(array.length)];
    }

    /**
     * @param list      an array to select a random element from
     * @param <AnyType> any type
     * @return a randomly selected element from the specified array
     */
    public static <AnyType> AnyType selectElement(List<AnyType> list) {
        return list.get(random.nextInt(list.size()));
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