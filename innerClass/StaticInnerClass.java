
package innerClass;


class Outer 
{
    static class Inner
    {
        void display()
        {
            System.out.println("inner method");
        }
    }
}


public class StaticInnerClass {
    public static void main(String[] args) {
        
        // if we make inner class static then we dont need outer class object to use it , just like the static variable or methods

        Outer.Inner innerObj = new Outer.Inner();

        innerObj.display();
    }
}