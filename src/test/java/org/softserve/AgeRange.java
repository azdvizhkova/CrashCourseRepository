package org.softserve;

public class AgeRange {

    public static String datingRange(int age) {
        int minAge;
        int maxAge;

        if ((1 <= age && age <= 100) && age > 14) {
            minAge = age / 2 + 7;
            maxAge = (age - 7) * 2;
        } else {
            minAge = (int) (age - 0.10 * age);
            maxAge = (int) (age + 0.10 * age);

        }
        return minAge + "-" + maxAge;

    }

   
}
