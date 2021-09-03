package org.softserve;

public class Clock {

    public static int past(int h, int m, int s) {
        boolean isHour = 0 <= h && h <= 23;
        boolean isMinune = 0 <= m && m <= 59;
        boolean isSecond = 0 <= s && s <= 59;

        return isHour && isMinune && isSecond ? (h * 60 * 60 + m * 60 + s) * 1000 : 0;

    }
}
