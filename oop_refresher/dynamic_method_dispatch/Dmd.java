
package oop_refresher.dynamic_method_dispatch;


class A 
{
    public void show()
    {
        System.out.println("in A show");
    }
}

class B extends A
{
    public void show()
    {
        System.out.println("in B show");
    }
}

class C extends A
{
    public void show()
    {
        System.out.println("in C show");
    }
}


public class Dmd {
    
    public static void main(String[] args) {
        
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();


    }

}

/*
    example of runtime polymorphism alos know as dynamic method dispatch 


    what is the type of object does not matter , what really matters is the object
    which will decide which method to call or what will be the behaviour of the object 


    lets assume 

    in class c we dont have a show() method but we are calling it 

    A obj = new A();

    obj = new C();
    obj.show();

    in this case show() method of class A will be executed, because class c extends class A , simple inheritance rule

    
*/