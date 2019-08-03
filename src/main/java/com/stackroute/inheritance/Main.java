package com.stackroute.inheritance;
//Main class to implement single Inheritance
public class Main {
    public static void main(String[] args){
        //Create object of subclass to access superclass properties
        SubclassSingleInheritance ref1=new SubclassSingleInheritance();
        System.out.println(ref1.y1);
        System.out.println(ref1.v1);
        ref1.sample();
        //Multi-level inheritance
        MultiLevel m1=new MultiLevel();//indicates that if we create object of superclass then we could only access properties of superclass
        m1.sendMsg();
        Subclass1MultiLevel m2=new Subclass1MultiLevel();//indicates that if we create a object of subclass then we could access the properties of both subclass1 and superclass
        m2.sendMsg();
        m2.sendVoiceMsg();
        Subclass2Multilevel m3=new Subclass2Multilevel();//indicates that if we create a object of subclass2 then we could access the properties of subclass2,subclass1 and superclass
        m3.sendMsg();
        m3.sendVoiceMsg();
        m3.videoCall();
        //Heirarchial inheritance
        Savings s1=new Savings();//Account is the superclass of Savings class
        s1.createAccount();
        s1.showSavings();
        Loans l1=new Loans();//Account is the superclass of Loans class as well
        l1.createAccount();
        l1.pendingLoan();
        //Hybrid Inheritence
        HybridSubClass1 h1=new HybridSubClass1();
        h1.subclass1();//create object of subclass to access properties of two subclasses and a superclass
    }

}
