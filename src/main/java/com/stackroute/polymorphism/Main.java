package com.stackroute.polymorphism;

public class Main {
    public static void main(String[] args){
        //acheiving compile time polymorphism using method overloading
        GraphSheet g1=new GraphSheet();
        g1.drawPoint();
        g1.drawPoint(2,3);
        g1.drawPoint('X',4);
        g1.drawPoint(3,'Y');

        //achieving run-time polymorphism using method overriding and upcasting
        SuperClass ref1=new SubClass();//ref1 is upcasted reference
        ref1.count();
    }
}
