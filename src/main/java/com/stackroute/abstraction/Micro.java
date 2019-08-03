package com.stackroute.abstraction;

public class Micro implements Cab {
    @Override
    public void showCabDetails() {
        System.out.println("this is micro cab");
        System.out.println("Minimum charge is 45rs");
    }
}
