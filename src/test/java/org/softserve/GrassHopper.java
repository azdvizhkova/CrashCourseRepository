package org.softserve;

public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);

        if (c > 0)
            return (c + " is above freezing temperature");
        else
            return (c + " is freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        float celsius = (temperature - 32) * 5 / 9F;
        return celsius;
    }


}
