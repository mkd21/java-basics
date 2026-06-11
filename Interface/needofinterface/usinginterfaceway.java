
package needofinterface;

interface Computer 
{
    void code();  // by default methods are abstract public
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("coding on laptop");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("coding on desktop");
    }
}

class Dev 
{
    public void devApp(Computer comp)
    {
        comp.code();
    }
}

public class usinginterfaceway {
    public static void main(String[] args) {
        
        Dev dev = new Dev();

        Computer lap = new Laptop();
        dev.devApp(lap);

        Computer desk = new Desktop();
        dev.devApp(desk);

    }
}