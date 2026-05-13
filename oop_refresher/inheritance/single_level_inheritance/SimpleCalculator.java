
package inheritance.single_level_inheritance;

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
    
        AdvanceCalculator advc1 = new AdvanceCalculator();

        System.out.println( advc1.multiplication(3 , 6) );
        System.out.println( advc1.division(21, 5)  );
        
    }

}

