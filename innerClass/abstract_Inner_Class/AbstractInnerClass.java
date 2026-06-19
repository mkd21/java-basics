

package innerClass.abstract_Inner_Class;

abstract class A 
{
    public abstract void Method1();
}

// we can create a class and extend class A to implent the method

// but for 1 method why to create a class , if we can use anonymous class to implement this


public class AbstractInnerClass {
    public static void main(String[] args) {
        
        A obj1 = new A() {

            public void Method1()
            {
                System.out.println("implemeted in anonymous class");
            }

        };

        obj1.Method1();
    }
}
