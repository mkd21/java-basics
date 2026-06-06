
package innerClass;


class Outer 
{

    class Inner 
    {
        void innerClassMethod()
        {
            System.out.println("inner class method executed");
        }
    }
}


public class InnerClsObjBinding {
    public static void main(String[] args) {
        
        // a non static inner class object is always binded with outer class object
        
        Outer outerObj = new Outer();

        // now we can use outer object to create the inner class object 

        Outer.Inner innerObj = outerObj.new Inner();

        innerObj.innerClassMethod();
    }
}