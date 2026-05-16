

package oop_refresher.final_keyword;

class Features 
{
    public final void featureCredit()
    {
        System.out.println("this feature was developed by Mayank Deep");
    }
}

class Device extends Features
{
    public void featureCredit()
    {
        System.out.println("this feature was creaded by Ahmed");
    }
}

public class FinalKeyword 
{
    public static void main(String[] args) {
        
        /*  
            final keyword with variable makes it behave like constant , which means that once we have
            assigned a value then it cannot be updated.
        */ 

        // final double pi = 3.14;
        // pi = 31.54;

        // System.out.println(pi);


        // final keyword when used with class makes the class inheritable 

        // final keyword when used with a method prevents it form getting overridden 
        // not overloading because only name remains the same with overloading rest things must differ


        Device dv1 = new Device();
        dv1.featureCredit();

    }
}