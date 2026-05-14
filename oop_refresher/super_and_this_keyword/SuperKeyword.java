

package oop_refresher.super_and_this_keyword;


class A extends Object
{
    public A()
    {
        super();
        System.out.println("in A constructor");
    }

    public A(int num)
    {
        super();
        System.out.println("in A parameterised constructor");
    }
}

class B extends A
{
    public B()
    {
        //super();  // present even if not written explicitly
        super(85);  // now this will call parameterised constructor of super class
        System.out.println("in B constructor");
    }

    public B(int n)
    {
        super(n); // present even if not written explicitly
        System.out.println("in B parameterised constructor");
    }
}

class SuperKeyword 
{
    public static void main(String[] args) {

        // B objb = new B();  will execute the default constructor of class A and B respectively

        // B objb = new B(5); will call default constructor of class A and parameterised constructor of B respectively

        // B objb = new B(90);

        // what if i create a default object but i want to execute the parameterised constructor of class A 

        // B objb = new B();

    }
}


/*

    in java every constructor have a method called super()

    it's duty is to call the super class constructor.


    if super() is default then it will call the default constructor of super class 

    if super(int n , double b) is parameterised then it will call parameterised constructor of super class



    now why we have added super() in parent class A ?

    because every class in java extends Object class , even if we don't mention 


*/