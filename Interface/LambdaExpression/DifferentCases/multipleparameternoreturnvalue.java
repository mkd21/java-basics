
package Interface.LambdaExpression.DifferentCases;

interface Employee 
{
    public abstract void details(String name , int age);
}

public class multipleparameternoreturnvalue {
    public static void main(String[] args) {
        
        Employee emp1 = (name , age) -> {
            System.out.println("Employee name is " + name);
            System.out.println("Employee age is " + age);
        };

        emp1.details("Mayank Deep", 26);
    }
}