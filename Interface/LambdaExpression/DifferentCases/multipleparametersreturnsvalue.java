package Interface.LambdaExpression.DifferentCases;

@FunctionalInterface
interface Calculator 
{
    int add(int num1 , int num2);  // default visiblity is public abstract
}

public class multipleparametersreturnsvalue {
    public static void main(String[] args) {
        
        Calculator calc = (a , b) -> a + b;

        int res = calc.add(4, 5);

        System.out.println(res);
    }   
}