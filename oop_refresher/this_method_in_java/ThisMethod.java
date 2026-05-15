
package oop_refresher.this_method_in_java;

class A
{
    public A()
    {
        System.out.println("in A constructor");
    }

    public A(int n)
    {
        System.out.println("in A parameterised constructor");
    }
}


class B extends A
{
    public B()
    {
        super(); // will call the constructor of super class (parent class)
        System.out.println("in B constructor");
    }

    public B(int n)
    {
        this();  // will call the constructor of the same class
        System.out.println("in B parameterised constructor");
    }
}


public class ThisMethod {
    public static void main(String[] args) {

        B obj1 = new B(5);

    }
}

/*
    this() method is used to call the constructor of the same class 

    let's say,



*/