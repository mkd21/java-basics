
package abstractkeyword;

abstract class Car 
{
    abstract void drive();  // can contain abstract method 

    static int x = 10;  // can nontain static variable 

    int y = 34;   // can contain instance variable 


    void playMusic() // concrete method
    {
        System.out.println("playing music");
    }

    int minPrice;


    Car(){}  // default constructor 

    // // can contain constructors as well
    Car(int minPrice)
    {
        this.minPrice = minPrice;
    }

    abstract void getPrice();
}

class BMW extends Car
{
    // not a correct design 

    // BMW(int price) 
    // {
    //     minPrice = price;
    // }


    // this is correct design pattern to follow
    BMW(int price)
    {
        super(price);
    }

    // must be implemented in sub class (if sub class is non static)
    void drive()
    {
        System.out.println("car is moving");
    }

    void getPrice()
    {
        System.out.println("minimum price is " + minPrice);
    }

}

public class AbstractKeyword {
    
    public static void main(String[] args) {
        
        // astract class cannot be instantiated directly
        // Car c1 = new Car();

        BMW m3 = new BMW(5000000);
        m3.drive();
        m3.getPrice();

        // or 

        Car c1 = new BMW(45000000);
        c1.drive();
        c1.getPrice();

        // System.out.println(Car.x);   // but a static class can be initialized by using static variable or method
    }
}



/*

    * abstract keyword in java is used to create abstract method and abstract class 

    * abstract method is only declared and actual implementaion is done by the subclass

    * abstract class acts as a base class , cannot be instantiated directly

    * abstract method can only be declared inside abstract class or interface


    
*/