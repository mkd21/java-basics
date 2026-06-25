package Interface.LambdaExpression.DifferentCases;


@FunctionalInterface
interface Calculator 
{
    int add(int a , int b);
}


public class multiplestatementwithreturn {
    
    public static void main(String[] args) {
        
        Calculator calc = (num1 , num2) -> {

            System.out.println("adding...");
            return num1 + num2;
        };

        System.out.println( calc.add(9, 6) );
    }

}

/*

    if body contains more than 1 statement we need to write return statement 
    and curly braces are also required

*/