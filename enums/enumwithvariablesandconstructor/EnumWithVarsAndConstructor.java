
package enums.enumwithvariablesandconstructor;


enum Laptop 
{
    MACBOOK(2000),    // public static final Laptop MACBOOK = new Laptop(2000);
    THINKPAD(1500),
    DELL(1200),

    HP;  // if we dont have default constructor then it will throw error because every constant is having a value defined 

    private int price;

    Laptop()
    {
        price = 200;  // will be assigned to the constant having no value assigned 
    }

    Laptop(int price)
    {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}


public class EnumWithVarsAndConstructor {
    public static void main(String[] args) {
        
        Laptop l1 = Laptop.MACBOOK;

        System.out.println(l1.getPrice());

        // printing all the named constants value 

        // for(Laptop lap : Laptop.values())
        // {
        //     System.out.println(lap + " " + lap.getPrice());
        // }


        // let's set the values 

        Laptop l2 = Laptop.DELL;

        l2.setPrice(3400);  // setter method that we defined

        System.out.println(l2.getPrice());

    }
}

/*

    for enums specially , if we don't give any access modifier to the CONSTRUCTOR then by default its 

    private , so i cannot be called from outside Enum.

    with enums we dont need to explicitly create object , java does that for us 

    who calls the constuctor then?

    jave itself calls the constructor and assigns the values. (done during the initialisation of enum )

    we can have getters and setters as well 



*/