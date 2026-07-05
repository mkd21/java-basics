
package exceptionhandling.specificexceptions;



public class errorsspecifcexceptions {
    public static void main(String[] args) {
        
        int a = 12;
        int b = 0;

        int [] arr = new int[5];

        String str = null;

        try 
        {
            // System.out.println( a / b );

            // System.out.println(arr [3]);
            System.out.println( arr[5] );

            System.out.println(str.length());
        }
        catch(ArithmeticException e)
        {
            System.out.println("check the inputs " + e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("limit exceeded, " + e);
        }
        catch(NullPointerException e)
        {
            System.out.println("please provide a valid string " + e);
        }
        catch(Exception e)  // parent class , this catches all the exceptions
        {
            System.out.println("catches all execptions " + e);
        }
    }
}