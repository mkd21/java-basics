
package exceptionhandling.checkedexception;


class CheckedExceptionExample extends Exception
{
    public CheckedExceptionExample(){
        super();
    }

    public CheckedExceptionExample(String message)
    {
        super(message);
    }
}

public class checkedexceptions {
    public static void main(String[] args) {
        
        int i = 34;

        int j = 0;

        try 
        {
            j = 12 / 34;
            if( j == 0) 
            {
                // throw new CheckedExceptionExample(); 
                throw new CheckedExceptionExample("default value shows if value becomes 0");
            }
        }
        catch(CheckedExceptionExample e)
        {
            System.out.println("value of j is " + e);
        }

        System.out.println("value of j is " +j);
    }
}



/*



    why it is called checked exception? and why it is extending the Exception class?

    because exceptions like this can be catched at compile time if not handles properly. compiler
    throws compilation errors if we proceed without handling the exceptions.

    


    throw new CheckedExceptionExample();  

    if no arguement is provided then also it will work becasue java 
    internally calls default constructor which contains super keyword as we already know

    if we write any arguement we need to write the parameterised constructor
    just like we do with the classes and  objects they are also same na




*/