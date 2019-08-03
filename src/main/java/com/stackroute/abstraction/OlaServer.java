package com.stackroute.abstraction;

public class OlaServer {
    public static Cab bookCab(int choice)
    {
        Cab c1;
        if(choice==1)
        {
            c1=new Mini();
            return c1;
        }
        else if(choice==2){
            c1=new Micro();
            return c1;
        }
        else
        {
            c1=new Prime();
            return c1;
        }
    }
}
