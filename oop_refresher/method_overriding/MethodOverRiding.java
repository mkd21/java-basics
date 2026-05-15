

package oop_refresher.method_overriding;

class A 
{
    public int add(int n1 , int n2)
    {
        return n1 + n2;
    }
}

class B extends A 
{
    
    public int add(int num1 , int num2)
    {
        return num1 + num2 + 1;
    }

    // public double add(double num1 , double num2 , int num3)   this is method overloading not overriding
    // {
    //     return num1 + num2 + num3;
    // }
}

public class MethodOverRiding {

    public static void main(String[] args) {
        
        B obj1 = new B();
        
        System.out.println( obj1.add(3,4) );
    }    
}   


/*
    method overriding is a feature in java where a child class can provide its own implementation of a method that
    is already defined in the parent class.

    same method signature which means 
    
    same method name
    same return type 
    same number of parameters 
    Same parameter data types
    same parameter order 

    for more refer to chatgpt java project section 

*/