package com.stackroute.abstraction;

public class Prime implements Cab{
    @Override
    public void showCabDetails(){
        System.out.println("this is prime cab");
        System.out.println("Minimum charge is 45rs");
    }
}
