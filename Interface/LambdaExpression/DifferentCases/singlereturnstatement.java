
package Interface.LambdaExpression.DifferentCases;

@FunctionalInterface
interface Calculator
{
    // int add(int num1 , int num2);
    boolean calculate(int x);
}

public class singlereturnstatement {
 
    public static void main(String[] args) {
     
        // Calculator c1 = (a , b) -> a + b;

        // System.out.println( c1.add(5, 8) );

        Calculator c1 = (num) -> (num % 2) == 0;

        System.out.println( c1.calculate(3) );
    }
}