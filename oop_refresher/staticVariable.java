
class Mobile 
{
    String Brand;
    int Price;
    static String Name;


    void show()
    {
        System.out.println(Brand + " : " + Price + " : " + Name);
    }

}


public class staticVariable {

    public static void main(String[] args) {
        
        Mobile.Name = "Smartphone";    // this will work because static variable belong to class not to an object 

        Mobile m1 = new Mobile();

        // Mobile.Name = "Smartphone";    // class name is recommended to set the value of a static variable

        m1.Brand = "Apple";
        m1.Price = 1400;
        m1.show();


        Mobile m2 = new Mobile();
        m2.Brand = "Samsung";
        m2.Price = 1000;
        m2.show();

    }

}
