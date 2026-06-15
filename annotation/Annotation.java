
package annotation;


class A 
{
    void thisIsToShowTheUsecaseOfAnotation()
    {
        System.out.println("in A class");
    }
}

class B extends A
{
    @Override
    void thisIsToShowTheUsecaseOfAnotation()
    {
        System.out.println("in B class");
    }
}

public class Annotation {
    public static void main(String[] args) {
        
        B obj1 = new B();

        obj1.thisIsToShowTheUsecaseOfAnotation();

    }
}


/*

    my intention was to override the method but there was some issue in the names and we got no errors as such

    in order to keep a track on naming of methods 

    annotation are the meta data which provide information about our code to the compiler 


*/