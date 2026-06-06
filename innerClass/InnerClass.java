
package innerClass;

class Car
{

    Engine eng = new Engine();     // creating obj before class declaration is completely possible

    class Engine
    {
        void start() {
            System.out.println("Engine started");
        }
    }

    void startCar() 
    {
        eng.start();
    }
}

public class InnerClass {
    public static void main(String[] args) {
    
        Car m4 = new Car();

        m4.startCar();

    }    
}
