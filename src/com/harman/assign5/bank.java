package com.harman.assign5;

public interface bank{
    @SuppressWarnings("unused")//used to clear the warnings

    void getInterestRate();

    public static void main(String[] args) {
        System.out.println(" Interest rate of RBI is 7%");
    }
}
class SBI implements bank{
    @Override
    public void getInterestRate(){
        System.out.println("Interest rate of SBI is 7.5");
    }
}
class AXIS implements bank{
    @Override
    public void getInterestRate(){
        System.out.println("Interest rate of AXIS is 8");
    }
}

class ICICI implements bank{
    @Override
    public void getInterestRate(){
        System.out.println("Interest rate of ICICI is 8.5");
    }

}
class banking{


    public static void main(String[] args) {
        SBI ob_b1=new SBI();
        AXIS ob_b2=new AXIS();
        ICICI ob_b3=new ICICI();
        System.out.println("SBI =>");
        ob_b1.getInterestRate();
        System.out.println("AXIS =>");
        ob_b2.getInterestRate();
        System.out.println("ICICI =>");
        ob_b3.getInterestRate();

    }
}