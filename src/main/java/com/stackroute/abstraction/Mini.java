package com.stackroute.abstraction;

public class Mini implements Cab{
    @Override
    public void showCabDetails(){
        System.out.println("this is mini cab");
        System.out.println("Minimum charge is 40rs");
    }
}
