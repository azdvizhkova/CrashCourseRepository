package org.softserve;

public class Dinglemouse {

    public static Dinglemouse INST = new Dinglemouse();

    private static int ONE_HUNDRED = 100;

    private static int value = ONE_HUNDRED;


    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

}

