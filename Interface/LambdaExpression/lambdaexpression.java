
package Interface.LambdaExpression;

@FunctionalInterface //. will check if we follow the rule of functional interface or not
interface Vehicle 
{
    void start();

    default void stop()
    {
        System.out.println("stopped");
    }
}

public class lambdaexpression {
    public static void main(String[] args) {
        
        Vehicle v1 = () -> {
            System.out.println("starting...");
        };

        v1.start();  // will call the start method,implemented using lambda expression

        v1.stop();
    }    
}