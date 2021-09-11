package org.softserve;

public class Dinglemouse {


    private static int ONE_HUNDRED = 100;

    private int value;


    private Dinglemouse() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

    public static int getOneHundred() {
        return ONE_HUNDRED;
    }

    public static void setOneHundred(int oneHundred) {
        ONE_HUNDRED = oneHundred;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    static Dinglemouse INST = new Dinglemouse();
    


}

