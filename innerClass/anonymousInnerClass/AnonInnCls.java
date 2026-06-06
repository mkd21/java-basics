
package innerClass.anonymousInnerClass;

class A 
{
    public void show()
    {
        System.out.println("in A class Show");
    }
}

public class AnonInnCls {
    public static void main(String[] args) {
        
        A obj1 = new A(){
            
            public void show()
            {
                System.out.println("in anonymous class show ");
            }

        };

        obj1.show();

    }
}


/*
    here compiler creates a class for us when we use anonymous class

    what happpens behind the scene

    class AnonymousClass extends A 
    {
        public void show()
        {
            System.out.println("in anonymous inner class");
        }
    }
    
    so object may seem like
    A obj1 = new A()  which might feel like its an object of class A 

    but that's not the case 

    A obj1 = new AnonymousClass()

*/ 