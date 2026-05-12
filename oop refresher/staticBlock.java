
class Mobile 
{

    String Brand;
    int Price;
    static String Product;

    /*
    
    static 
    {
        Product = "SmartPhone";
    }

    cannot initialise the value of a non static variable inside a static block

    */
    
    static 
    {
        Product = "SmartPhone";
        System.out.println("Static block executed");
    }
}

public class staticBlock {
    public static void main(String[] args) {
        
        System.out.println("static block called by using static variable in main block " + Mobile.Product);

        // Mobile m1 = new Mobile();

    }
}

/*

    Static block is executed only once 

    Why do we use a static block to initialize static variables?

    Because sometimes we want static variables to be initialized automatically
    as soon as the class gets initialized by the JVM.

    Although we can initialize a static variable manually using:

    Mobile.Product = "SmartPhone";

    this requires us to explicitly write that line somewhere
    (such as inside main()).

    If that line is forgotten or skipped, then the static variable
    will keep its default value.

    Examples of default values:
    - int    → 0
    - String → null
    - boolean → false

    To avoid this dependency on manual initialization,
    we use static blocks.

    A static block executes automatically once when the class
    gets initialized, ensuring the static variable is properly initialized.


    A class can be initialized by the JVM in multiple ways:

    1. Creating an object of the class
    2. Accessing a static variable/member
    3. Calling a static method
    4. Using Class.forName()

*/