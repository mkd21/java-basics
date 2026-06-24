
package Interface.LambdaExpression.DifferentCases;

@FunctionalInterface
interface RandomNumber 
{
    public abstract int generate();
}

public class noparameterreturnsvalue {
    public static void main(String[] args) {
        
        RandomNumber rn1 = () -> 100;

        int num = rn1.generate();

        System.out.println(num);
    }
}
