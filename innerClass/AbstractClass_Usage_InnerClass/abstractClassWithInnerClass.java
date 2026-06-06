
package innerClass.AbstractClass_Usage_InnerClass;


abstract class Car 
{
    abstract public void engine();
    abstract public void horn();
}

// class Brand extends Car {}  we could have implemented the method in subclass basically method overriding but , just
// to implement a method we will need to create a whole new class so java gives us property in which we can 
// implement the method of an abstract class 

public class abstractClassWithInnerClass {
    public static void main(String[] args) {
        
        Car c1 = new Car() {
            public void engine()
            {
                System.out.println("implementaion is done in anonymous inner class");
            }

            public void horn()
            {
                System.out.println("horn method implemented in anonymous inner class");
            }
        };

        c1.engine();
        c1.horn();
    }    
}
