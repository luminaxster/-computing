// DO NOT SUBMIT CODE WITH IMPORTS, IT WILL DEDUCT POINTS DURING GRADING.
// THIS IMPORT HIS HELPFUL TO DEBUG YOUR PROGRAM STATE
import java.util.Arrays;
public class DataLoop {
    public static void main(String[] args){
        System.out.println("Program start");
        int x = 7;
        System.out.println("the value of x is "+x);
        int[] array = {};
        System.out.println("the value of array is "+Arrays.toString(array));
        array = new int[5];
        System.out.println("the value of array is "+Arrays.toString(array));
        array[0] = x;
        System.out.println("the value of array is "+Arrays.toString(array));
        
        int[][] matrix = new int[3][4];
        matrix[0][0]=1; // in-place replacement of [][]
        System.out.println("the value of matrix is "+Arrays.deepToString(matrix));
        matrix[0] = new int[7]; // in-place replacement of []
        // but now matrix[0] with [7, 0, 0, 0, 0] is gone =(
        // at least matrix[0] has a new size [0, 0, 0, 0, 0, 0, 0]   =)
        // What can a human do to to first move the original values to the new array?
        // Iterate over the current array reference before replacing the array reference. 
        
        //Faster exploration of your array scructures
        System.out.println("the value of matrix is "+Arrays.deepToString(matrix));
        
        // What does deepToString do?
        // The API renders the text content of arrays, even if deeply nested
        // It covers 1D arrays like Arrays.toString {1, 7}, and 2D+ like {{1}, {7}}
        // A similar-ishhhhh behavior of deepTostring on int[][]
        String arrayText= "[";
        for(int[] _array: matrix){
            arrayText=arrayText+ "[";
            for(int value: _array){
                arrayText=arrayText+ value+", ";
            }
            // same as arrayText=arrayText+ "]";
            arrayText+= "]";
        }
        arrayText= arrayText+"]";
        //Notice the last comma being not checked (for simplicity)
        System.out.println("the value-ish of matrix is "+arrayText);
        System.out.println("Program end");
    }
     
}
