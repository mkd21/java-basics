
package exceptionhandling.uncheckedexception;

class UncheckedExceptionsExample extends RuntimeException
{
    public UncheckedExceptionsExample(){}

    public UncheckedExceptionsExample(String message)
    {
        super(message);
    }
}

public class uncheckedexceptions {
    public static void main(String[] args) {
        
        int i = 23;

        int j = 0;

        if( j == 0) throw new UncheckedExceptionsExample("cannot divide by 0");

    }
}


/*

    now we are extending RuntimeException class 

    compiler don't force to handle exceptions
    if anything unexpected happens then whole program will crash and we will need to fix that



*/