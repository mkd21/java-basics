
package Interface.FunctionalInterface;


@FunctionalInterface
interface Vehicle
{
    // constant , by default its public static final
    int TOP_SPEED = 200;

    // abstract method 
    void drive(); // this is abstract method and should be only one in whole interface to make it functional interface

    // default method
    default void start()
    {
        System.out.println("Starting...");
        log();
    }

    // static method 
    static void stop()
    {
        System.out.println("Stopping...");
    }

    private void log()
    {   
        System.out.println("Logging..");
        maxSpeed();
    }

    private static void maxSpeed()
    {
        System.out.println(TOP_SPEED);
    }
}


public class functionalinterface {
    public static void main(String[] args) {
        
        Vehicle v1 = new Vehicle() {
            public void drive()
            {
                System.out.println("Driving...");
            }
        };

        v1.drive();
        v1.start();

        Vehicle.stop();

    }    
}


/*

    to reduce the code we will use lambda expressions with functional interface

*/