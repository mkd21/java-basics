
package exceptionhandling;

public class exceptionhandlingbasic {
    public static void main(String[] args) {
        
        int i = 10;
        int j = 0;

        try 
        {
            System.out.println( i / j);
        }
        catch(Exception e)    // its the parent class for all the exceptions classes
        {
            System.out.println("error is " + e);
        }

        System.out.println("reached here..");
    }    
}
