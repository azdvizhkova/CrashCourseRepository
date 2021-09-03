package org.softserve;

public class CenturyYear {

    public static int century(int number) {
        // your code goes here
        String yearText = String.valueOf(number);
        // Write your code here
        if (yearText.matches("\\d+00$")) {
            return Integer.parseInt(yearText.substring(0, getCenturyLength(String.valueOf(number))));
        } else if (String.valueOf(number).length() != 2) {
            return Integer.parseInt(yearText.substring(0, getCenturyLength(String.valueOf(number)))) + 1;
        } else {
            return 1;
        }
    }

    private static int getCenturyLength(String year) {
        return year.length() - 2;
    }
}
