

class Human 
{

    public Human()
    {
        System.out.println("defult constructor called");
    }

    public void show()
    {
        System.out.println("show method called");
    }

}


public class anonymousObject {
    
    public static void main(String[] args) {
        
        new Human(); // here object is created because weknow (new) keyword and constructor is used to create object .
                       // it is called anonymous object because it has no name (no reference variable to store its address)

        // we call call methods also using this anonymous object 

        // new Human().show();
        
    }
    
}
