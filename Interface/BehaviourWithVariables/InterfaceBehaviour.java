
package Interface.BehaviourWithVariables;

interface Test 
{
    int x = 34;  // static final (by default)  also the values its holding is compile time constant

    // int res = Helper.getValue();  // the value this variable will hold is not compile time constant

    // Helper h1;
    // h1 = new Helper(); 
    // assigning values like we did above is not valid 

    Helper h1 = new Helper(); // behind the scene compiler treats them like public static final

    int res = h1.getValue();  // behind the scene compiler treats them like public static final
}

class Helper 
{
    int getValue()
    {
        System.out.println("initializing interface field");
        return 23;
    }
}

public class InterfaceBehaviour {
    public static void main(String[] args) {
        
        System.out.println(Test.res);

    }
}

/*

    we know that variables are static final inside the interface by default 

    and when the variable is final then compiler inlines the value 
    which means that compiler may do something like

    System.out.println(Test.x); with 
    System.out.println(34);

    when variable is compile time constant like(34 , "hello" , true , false etc) then interface is not initialised
    as compiler inlines the values

    but when the variable is not compile time constant then the interface is initialised

*/