
package arrays;


class Students 
{
    String name;
    int age;
    int marks;

}

public class ArrayOfObject {
    public static void main(String[] args) {
        

        Students s1 = new Students();
        s1.name = "Mayank Deep";
        s1.age = 28;
        s1.marks = 97;

        Students s2 = new Students();
        s2.name = "Golu";
        s2.age = 31;
        s2.marks = 98;

        Students s3 = new Students();
        s3.name = "Komu";
        s3.age = 26;
        s3.marks = 98;

        Students s4 = new Students();
        s4.name = "Monu";
        s4.age = 26;
        s4.marks = 92;


        // System.out.println(s2);
        /*  it will print something like in this 

        syntax(ClassName@hexadecimalHashCode) 
        arrays.Students@7852e922 

        hexadecimal hashcode is not the address of the object but the representaion of that object
        java never exposes the actual address like c/c++

        it happens because every calss in java inherits a default method called toString() from Object class

        when we do System.out.println(s2); java internally calls s2.toString()

        */

        /*
            now i want to store them in an array but i cannot store them in normal arrays like

            int [] arr = new int[4];  because it is created to store the integer data type

            so we will need to create an array of object
         */ 


        Students [] studDetails = new Students[4];

        studDetails[0] = s1;
        studDetails[1] = s2;
        studDetails[2] = s3;
        studDetails[3] = s4;


        // for(int i = 0; i < studDetails.length; i++)
        // {
        //     System.out.println("Name is " + studDetails[i].name + " age is " + studDetails[i].age + " marks is " + studDetails[i].marks);
        // }        

        // for( Students stud : studDetails)
        // {
        //     System.out.println("Name is " + stud.name + " age is " + stud.age + " marks is " + stud.marks);
        // }

    }
}
