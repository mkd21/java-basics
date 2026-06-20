
package Interface.LambdaExpression;

@FunctionalInterface
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

        v1.start();
        v1.stop();
    }    
}