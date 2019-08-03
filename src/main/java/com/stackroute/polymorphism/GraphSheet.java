package com.stackroute.polymorphism;
//example of compile time polymorphism
//compile time polymorphism could be achieved using method overloading
public class GraphSheet {
    public void drawPoint(){
        System.out.println("drawing point at 0,0");
    }
    //overloading drawPoint method by adding arguments
    public int drawPoint(int x,int y){
        System.out.println("drawing point at " + x + ","+y);
        return 10;
    }
    //overloading drawpoint method by changing datatype of the argument
    protected void drawPoint(char cord,int value)
    {
        System.out.println("drawing point on "+cord+ "at" +value);
    }
    //overloading drawpoint method by changing order of arguments
    public static void drawPoint(int value,char cord)
    {
        System.out.println("drawing point on"+ cord + "at" +value);
    }
}

