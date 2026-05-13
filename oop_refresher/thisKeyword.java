

class Bank 
{
    private int Age;

    void setAge(int Age)
    {
        // Age = Age;  presidence will be given to local variable and hence the instance variable is not get any value
        //             and in java the defalt value of integer is 0

        this.Age = Age;   // "this" Keyword represents the current object which is calling this specific method
                          //  currently object b1 is calling this setAge method so this keyword will set the value of
                          //  Age for object b1  
    }

    int getAge()
    {
        return Age;
    }

}


public class thisKeyword {
    
    public static void main(String[] args) {
        
        Bank b1 = new Bank();
        b1.setAge(23);

        System.out.println( "age is" + " : " + b1.getAge() );

    }

}
