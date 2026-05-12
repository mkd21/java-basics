
package inheritance.multi_level_inheritance;

class SimpleCalc 
{
     public int add(int a , int b)
    {
        return a + b;
    }

    public int subtraction(int a , int b)
    {
        return a > b ? a - b : b - a ;
    }
}

public class SimpleCalculator {
   
    public static void main(String[] args) {
    
       ScientificCalculator sc1 = new ScientificCalculator();   // this object will contains all the properties of 3 classes

        System.out.println( sc1.add(4, 3)  );

        System.out.println( sc1.power(2) );   
        
    }

}