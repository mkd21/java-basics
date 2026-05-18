
package arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        
        int arr [] [] = new int [3] [4];
        
        // filling values 
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr [i] [j] = (int) (Math.random() * 10);
            }
        }

        // printing values 
        for(int i = 0; i < arr.length ; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print( arr[i][j] + " ");
            }

            System.out.println();
        }


        System.out.println();
    

        // doing the same thing using enhanced for loop also known as (for-each loop)

        for(int[] n : arr )
        {
            for( int m : n )
            {
                System.out.print(m + " ");
            }

            System.out.println();
        }

        // here n is not a normal variable it contains whole array of each row 
        // m contains each element of the array that n carries

        
    }
}