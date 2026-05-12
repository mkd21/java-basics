


public class javaStrings 
{
    public static void main(String[] args) {
        
        String str = new String("hello strings");

        System.out.println(str);

        String str1 = "hello string normal version";

        System.out.println(str1);



        // lets have some experiment 

        String s1 = "mayank";

        String s2 = "mayank";

        System.out.println(s1 == s2);  // op will be true because in SCP they are referencing the same memory location


        // String methods in depth

        /*
            concat method
            returns a new string object because Strings are immutable.
            if we concat an empty string then java may retunrn the same object
        */

        // String st1 = "mayank";
        // String st2 = s1.concat("");

        // System.out.println(st1 == st2);


        


    }
}