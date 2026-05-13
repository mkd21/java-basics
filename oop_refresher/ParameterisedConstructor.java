
package oop_refresher;

class Human 
{

    private String Name;
    private int age;

    public Human()
    {
        System.out.println("user-defined no-arg constructor called");
    }

    public Human(String Name , int age)
    {
        this.Name = Name;
        this.age = age;
    }
    
    public Human(String Name)
    {
        this.Name = Name;
    }

    public Human(int age)
    {
        this.age = age;
    }

    void getDtails()
    {
        System.out.println(Name + " : " + age);
    }

}


public class ParameterisedConstructor {
    public static void main(String[] args) {
        
        // Human h1 = new Human();

        // Human h2 = new Human("Mayank");
        // h2.getDtails();

        // Human h3 = new Human(27);
        // h3.getDtails();

        Human h4 = new Human("komu" , 25);
        h4.getDtails();

    }    
}
