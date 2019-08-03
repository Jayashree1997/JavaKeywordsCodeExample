package com.stackroute.abstraction;

public class Client {
    public static void main(String[] args)
    {
        Cab ref1=OlaServer.bookCab(1);
        ref1.showCabDetails();
        Cab ref2=OlaServer.bookCab(2);
        ref2.showCabDetails();
        Cab ref3=OlaServer.bookCab(3);
        ref3.showCabDetails();
    }
}
