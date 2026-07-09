
package exceptionhandling.customexceptions;


class NewException extends Exception
{
    NewException(String message){
        super(message);
    }
}

public class customexception {  
    public static void main(String[] args) {
        
        int i = 20;
        int j = 0;

        try {
            
            j = 18 / i;
            if(j == 0){
                j = 1;
                throw new NewException("result is zero, so default value will be shown");
            }
                
        } 
        catch(NewException e)
        {
            System.out.println(e);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("something went wrong");
        }

        System.out.println(j);
        
    }
}


/*

    we can create our own exception by extending the Exception class or RuntimeException class

    but there is a little catch on their usage selection 

    like which class to extend when ???

    --> when we want checked exception then we extend Exception class

    --> when we want unchecked exception then we extend RuntimeException



    customClass -> Exception -> Throwable  -> Object

    we need to send super 

*/