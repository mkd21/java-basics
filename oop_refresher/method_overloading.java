

/* 
    method overlaoding is a concept in which we can create multiple methods of same name inside the same class 
    the only difference is that they should have 

    --> different number of parameters
    --> different types of parameters 
    --> order of the parameters should also be different 


    return type don't matter in this case 
*/

class MethodOverloading 
{
    // normal method 
    public void add(int a , int b)
    {
        System.out.println("Sum of " + a + " and " +  b + " is " + (a + b) );
    }

    // method with same name but different number parameter 
    public int add(int a , int b , int c)
    {
        return a + b + c;
    }

    // method with same number of paramter but their type is different 
    public double add(int a , double b)
    {
        return a + b;
    }

    // here we have same return type as of first method and same number of parameters but the only difference is type of parameter
    public void add(double a , int b)
    {
        System.out.println("sum of " + a + " and " + b + " is " + (a + b) );
    }
}

public class method_overloading {

    public static void main(String arg[])
    {
        // creating an object of type MethodOverloading (class)

        MethodOverloading m1 = new MethodOverloading();

        m1.add(1, 2);

        System.out.println( m1.add(2, 3 , 5) );
        System.out.println(m1.add(2, 4.5) );
        
        m1.add(1.3, 5);
    }
    
}