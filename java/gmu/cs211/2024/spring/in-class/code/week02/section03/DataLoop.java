// DO NOT SUBMIT CODE WITH IMPORTS, IT WILL DEDUCT POINTS DURING GRADING.
// THIS IMPORT HIS HELPFUL TO DEBUG YOUR PROGRAM STATE
import java.util.Arrays;
public class DataLoop{
    public static void main(String[] args){
        System.out.println("Program start");
        int[] array = {7,49,350-7, 4, 6, 7, 0, 99, 100};

        System.out.println("array.length:" +array.length);

        for(int i =1; i<array.length; i++){
            int value = array[i];
            array[i-1] = value;
            System.out.println("array value:"+i+" :" +value);
        }

        System.out.println("array' :" +Arrays.toString(array));
        System.out.println("Program end");
    }
}