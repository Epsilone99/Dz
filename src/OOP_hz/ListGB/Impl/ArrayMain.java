package OOP_hz.ListGB.Impl;

import OOP_hz.ListGB.GBList;

public class ArrayMain {
    public static void main(String[] args) {
        GBList<Double> arr = new GBArrayList<>();
        arr.add(1.2);
        arr.add(1.3);
        arr.add(1.4);
        arr.add(1.5);
        arr.add(1.6);
        arr.add(1.7);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
    }
}
