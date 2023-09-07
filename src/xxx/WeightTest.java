package xxx;

import java.util.Arrays;

public class WeightTest
{
    public static void main(String[] args) {
        int[] intArray = {24, 340, 0, 34, 12, 10, 20};

        Arrays.sort(intArray);

        System.out.println("intArray after sorting: " + Arrays.toString(intArray));
        
        int maxNum = intArray[intArray.length - 1];
        System.out.println("Maximum number = " + maxNum);
    }
}
