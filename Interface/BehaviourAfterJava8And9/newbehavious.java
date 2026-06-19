
package Interface.BehaviourAfterJava8And9;


interface Vehicle
{
    // introduction of constants 
    public static final int TOP_SPEED = 200;

    void start();      // abstract method , present since beginning 

    default void stop()
    {
        helper();
        System.out.println("Vehicle stopped");
    }

    static void serviceInfo() {
        System.out.println("Service every 6 months");
    }

    private void helper(){
        System.out.println("Checking systems...");
    }
}

class Car implements Vehicle
{
    @Override
    public void start()
    {
        System.out.println("car started");
    }
}


public class newbehavious {
    public static void main(String[] args) {
        
        Car BMW = new Car();

        BMW.start();
        BMW.stop();

        Vehicle.serviceInfo();

        System.out.println(Vehicle.TOP_SPEED);
    }
}

/*

    * introduction of default methods 

    if we don't implement the default method then also it completely work (although it can be implemented )


    * static methods were introduced 

    * private methods were introduced

    

*/