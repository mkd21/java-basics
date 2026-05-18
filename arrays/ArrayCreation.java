
package arrays;
 
class ArrayCreation {
    public static void main(String[] args) {
        
        // if we have values available 

        // int arr [] = {5 , 3 , 9 , 10};

        // System.out.println(arr);  // will give array address
        // System.out.println(arr[2]);

        int arr[] = new int[5];   // array of size 5 is created and each index have 0 as the value by default

        System.out.print("[ ");
        for(int i = 0; i < 5; i++)
        {
            System.out.print( arr[i] + " ");
        }
        System.out.print(" ]");


        
    }
}
