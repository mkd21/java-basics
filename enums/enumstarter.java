
package enums;

enum Status
{
    SUCCESS,
    PENDING,
    FAILURE,
}

enum Days 
{
    MONDAY,
    WEDNESDAY,
    SATURDAY
}


public class enumstarter
{
    public static void main(String[] args) {
        
        Status response = Status.SUCCESS;
       
        if(response == Status.SUCCESS)
        {
            System.out.println("request approved");
        }


        // Days d = Days.MONDAY;  valid 

        // Days d;
        // d = "Monday";  not valid 
        // d = 34; not valid

        // because we cannot assign int or string in type Days

        
    }
}


/*

    enums in java is a special type which is used when we know that a variable cannot have values other than 
    the predefined ones

    a named constant means when we give a meaningful name to a constant


    behind the scenes enums are converted into class 

*/