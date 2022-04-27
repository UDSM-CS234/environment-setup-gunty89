package com.company;

public class Main {

    public static void main(String[] args) {
        double acc = -9.81;
        double time = 10;
        double v = 0;
        double x = 0;

        double position;
        position =  (0.5*acc*time*time) + (v*time) + x;

        System.out.println("The position of the object is" + position);
    }
}
