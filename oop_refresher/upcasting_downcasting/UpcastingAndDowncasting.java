

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


        // upcasting example 
        // object is of child class but its upcasted to parent class 
        // even if we don't mention this , this happens internally

        Parent obj1 = (Parent) new Child();
        obj1.show_Parent();

        // but then also we cannot access child class method 

        // to do that we will need to downcast it 

        // downcasting example 
        // here reference is of child class and we have explicitly downcasted the obj1 to child class object
        // now we are refering to child class and object is also of child class , so method called

        Child obj2 = (Child) obj1;

        obj2.show_Child();

    }
    
}


/*

    same concept like typcasting , like we do 

    double pi = 3.14;

    int newpi = (int) pi;

    System.out.println(newpi);

*/