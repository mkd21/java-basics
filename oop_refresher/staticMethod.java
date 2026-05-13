

class Employee 
{
 
    int Salary;
    String Name;

    public void employeeSalary()
    {
        System.out.println("salary of " + Name + " is " +  Salary);
    }

    public static int calculateBonus(int salary)
    {
        return salary * 10 / 100;
    }

}

public class staticMethod {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        e1.Name = "Mayank";
        e1.Salary = 120000;

        System.out.println( Employee.calculateBonus(e1.Salary)  );

    }    
}


/*

    static methods are used when behaviour belongs to class itself rather than an object

    here calculateBonus is not dependent on state of any oject 

    we can say that it is using data of object e1 but there is a difference between

    using an object data 
    AND
    being tied to an object 

    here 
    calculateBonus() method don't know about what is the name of the employee or anything else it just cares about 
    the integer value that it will receive and do processing according to that 


    even if we try to use salary (which is an instance variable) inside static method it will throw an error 

    because instance variables are dependent on objects. 

    different object different value of instance variables;

*/