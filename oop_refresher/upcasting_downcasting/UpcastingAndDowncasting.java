

package oop_refresher.upcasting_downcasting;


class Parent 
{
    void show_Parent()
    {
        System.out.println("parent class show method");
    }
}


class Child extends Parent 
{
    void show_Child()
    {
        System.out.println("child class show method");
    }
}


public class UpcastingAndDowncasting {
 
    public static void main(String[] args) {
        
        // reference of parent but the object of child. 
        // Parent obj = new Child();
        // obj.show_Parent();    --> can access the parent class method 
        // obj.show_Child();     --> cannot access child class method 


        

    }
    
}


/*

    same concept like typcasting , like we do 

    double pi = 3.14;

    int newpi = (int) pi;

    System.out.println(newpi);

*/