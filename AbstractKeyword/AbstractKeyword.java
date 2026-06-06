
package AbstractKeyword;

abstract class Car 
{
    abstract void drive();

    static int x = 10;

    void playMusic()
    {
        System.out.println("playing music");
    }
}

class BMW extends Car
{
    // must be implemented in sub class (if sub class is non static)
    void drive()
    {
        System.out.println("car is moving");
    }

}

public class AbstractKeyword {
    
    public static void main(String[] args) {
        
        // astract class cannot be instantiated directly
        // Car c1 = new Car();

        BMW m3 = new BMW();
        m3.drive();

        // or 

        Car c1 = new BMW();
        c1.drive();
        

        // System.out.println(Car.x);   // but a static class can be initialized by using static variable or method

    }
}



/*

    * abstract keyword in java is used to create abstract method and abstract class 

    * abstract method is only declared and actual implementaion is done by the subclass

    * abstract class acts as a base class , cannot be instantiated directly

    * abstract method can only be declared inside abstract class or interface


    
*/