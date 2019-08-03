package com.stackroute.encapsulation;
public class Main {
    public static void main(String[] args)
    {
        Account a1=new Account();
        a1.setBal(5000);
        a1.setBal(-2000);
        double b1=a1.getBal(5312);
        System.out.println(b1);
        b1=a1.getBal(1213);
        System.out.println(b1);
        int x1=a1.getacntNo(5312);
        System.out.println(x1);
        int x2=a1.getacntNo(3214);
        System.out.println(x2);
    }
}
