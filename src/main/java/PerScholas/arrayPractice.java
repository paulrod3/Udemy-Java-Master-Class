package PerScholas;

import java.util.Arrays;

public class arrayPractice {
    public static void main(String[] args) {

        int [] sourceArray = {1, 10, 10, 4, 5, 6,};
        int [] TargetArray = new int [sourceArray.length];

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array; " + Arrays.toString(TargetArray));

        System.arraycopy(sourceArray, 0,
                TargetArray, 0, 5);

        System.out.println("Source Array: " + Arrays.toString(sourceArray));
        System.out.println("Target Array; " + Arrays.toString(TargetArray));

    }
}
