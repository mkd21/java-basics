
package Interface.InterfaceInheritance;


interface A 
{
    public abstract void m1();
    void m9();
}

interface B 
{
    public abstract void m4();
    public abstract void m6();
}

interface C extends B
{
    void m23();
}

class Implementor implements C 
{
    public void m4(){ System.out.println("m4 method"); }
    public void m1(){ System.out.println("m1 method"); }
    public void m6(){ System.out.println("m6 method"); }
    public void m9(){ System.out.println("m9 method"); }
    public void m23(){ System.out.println("m23 method"); }
}

public class interfaceInheritance {
    public static void main(String[] args) {
        
        Implementor imp = new Implementor();
        
    }
}
