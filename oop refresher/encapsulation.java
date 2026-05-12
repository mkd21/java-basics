
class BankDetails 
{

    String customerName;
    private int accountNumber; 


    void setAccountNumber(int accNumber)
    {
        accountNumber = accNumber;
    }

    int getAccountNumber()
    {
        return accountNumber;
    }

}


public class encapsulation {

    public static void main(String[] args) {
        
        BankDetails bd1 = new BankDetails();
        bd1.customerName = "Mayank Deep";

        // bd1.accountNumber = 12993;  cannot be accessed as it is private variable 

        // to set the value or to read that value we will need getter and setter method 

        bd1.setAccountNumber(19982106);   // setter method will help to set the value in controlled manner 

        System.out.println( "account number of " + bd1.customerName + " is " + bd1.getAccountNumber() );  
        // getter method will help us to read the values of a private variable


    }
    
}



/*

    Encapsulation is the process of bundling the variables and methods of a class together while restricting 
    direct access to the internal state using access modifiers.


*/