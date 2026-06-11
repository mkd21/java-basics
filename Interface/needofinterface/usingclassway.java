
package needofinterface;

abstract class Computer 
{
    abstract public void code();
}

class Laptop extends Computer
{
    public void code()
    {
        System.out.println("coding on laptop");
    }
}

class Desktop extends Computer
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

public class usingclassway {
    public static void main(String[] args) {
        
        Dev dev = new Dev();

        Computer lap = new Laptop();
        dev.devApp(lap);

        Computer desk = new Desktop();
        dev.devApp(desk);

    }
}