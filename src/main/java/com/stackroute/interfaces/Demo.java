package com.stackroute.interfaces;
//Class demo implements both Run1 and Run2
public class Demo implements Run1,Run2 {
    @Override
    //overriding methods of both the interfaces here
    public void click(){
        System.out.println("Overriding click()");
    }
    @Override
    public void view(){
        System.out.println("Overriding view()");
    }
}
