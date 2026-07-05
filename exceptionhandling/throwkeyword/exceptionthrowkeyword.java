package exceptionhandling.throwkeyword;


public class exceptionthrowkeyword {
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        // try
        // {
        //     System.out.println( 12 / i);
        // }
        // catch(ArithmeticException e)
        // {
        //     System.out.println("please select valid numbers");
        // }

        // above code will not throw the exception and we will get 0 , but what if we don't want 0 ?

        
        try 
        {
            j = 17 / i;

            if(j == 0) throw new ArithmeticException("because 0 is not allowed to be shown");
        }
        catch(ArithmeticException e)
        {
            j = 17 / 1;
            System.out.println("default value shown " + e);
        }


        System.out.println( j );
    }
}



/*

    what if there is a case where we intentionally want to throw an an exception ?

    in that case we will use throw keyword to intentionally thro error and catch block will catch the error


*/