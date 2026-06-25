
package Interface.LambdaExpression.DifferentCases;

@FunctionalInterface
interface Square 
{
    public abstract int square(int num);
}


public class oneparameterreturnsvalue {
    public static void main(String[] args) {

        Square sq = x -> x * x; 

        System.out.println( sq.square(2) );
    }    
}