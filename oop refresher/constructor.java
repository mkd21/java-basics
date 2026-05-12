
class Human 
{
    private String Name;
    private int age;


    public Human()
    {
        Name = "Mayank Deep";
        age = 26;
    }

    void getDetails()
    {
        System.out.println(Name + " : " + age);
    }
    
}


public class constructor {
    
    public static void main(String[] args) {
        
        Human h1 = new Human();
        h1.getDetails();

    }

}

/*
    if we make a constructor private then we will get error while we try to create objects

    what internally happens is

    when an object is created then compiler internally creates a constructor (if not creted manually)
    if we create a constructor and make it private so during object creation complier cannot create constructor
    which is mandatory for object creation and hence we get error


    one more important thing 

    the constructor created by compiler is called default constructor

    and 

    any constructor with zero parameters 
    class A
    {
        A()
        {
            System.out.println("hello");
        }
    }

    this is not a default constructor it's called user-defined no-arg constructor.

*/