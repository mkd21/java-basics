
// import tools.AdvanceCalc;
// import tools.Calc;

// or we can do something like 

import tools.*;   // all the files inside the tools folder will be imported

// import java.lang.*; 


public class Executor {
    
    public static void main(String[] args) {
    
        Calc obj1 = new Calc();
        obj1.show();

        AdvanceCalc obj2 = new AdvanceCalc();
        obj2.show();
        
        System.out.println("what's up champ");

        /*

            System it is a class in java which belongs to java.lang package 
            but to use this we don't need to import java.lang.*;

            why?

            because it is present in every file even if we don't mention 
            
        */ 
    }
}