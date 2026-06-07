

interface Payment 
{
    void pay();
}


class UPI implements Payment
{
    public void pay()
    {
        System.out.println("payment done via UPI");
    }
}

class CreditCard implements Payment
{
    public void pay()
    {
        System.out.println("payment done via credit card");
    }
}

public class Interface 
{
    public static void main(String args[])
    {
        UPI upi = new UPI();
        upi.pay();

        Payment p1 = new UPI();
        p1.pay();
    }
}


/*

    an interface in java is a contract whichh tells the class what methods it should provide but not 
    necessarily how these methods must be implemented

    its like 

    interface defines "what to do" and class defines "how to do it" 

    points to remember 

    * we cannot create an object of interface (means we cannot instantiate the interface just like abstract class)

    * methods are abstract and public by default inside the interface

    * variables inside interface are public static final (question on static variable)

    * Multiple inheritance through interfaces


    
*/