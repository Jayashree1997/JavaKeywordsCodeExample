package com.stackroute.encapsulation;

public class Account {

    private int acntNo = 1234;
    private double bal;

    public void setBal(int amt) {
        if (amt > 0) {
            bal = bal + amt;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public double getBal(int pin) {
        if (pin == 5312) {
            return bal;
        } else {
            return -777;
        }
    }


    public int getacntNo(int pin) {
        if (pin == 5312) {
            return acntNo;
        }

        return 0;
    }

}
