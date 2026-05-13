

class Calculator
{
    public int add(int val1 , int val2)
    {
        return val1 + val2;
    }
}


public class class_refresher {

    public static void main(String[] args) {
        
        int num1 = 3;
        int num2 = 6;

        Calculator calc = new Calculator();    // created a refrence variable named "calc" which is of type Calculator
                                              

        System.out.print(calc.add(num1 , num2) );

    }
}


/*
    new keyword tell JVM to create object and 
    Calculator() is the type of object that JVM needs to create 

    basically JVM says ok , i will create a new object but also give me the blueprint of the object.

*/  
