package PerScholas;

import java.util.Scanner;

import java.util.Arrays;
import java.util.Scanner;

public class JavaClassPerScholas {
    public static void main(String[] args) {

        // generate random # between 1 and 1000
        //System.out.println((int) (Math.random()*1001) );

        // for loop
//        for (int i = 0; i < 6; i++) {
//            System.out.println(i + " Java is fun!");
//
//        }
//        System.out.println("That be all!");
//
//
//        int sum = 0;
//        int n = 1000;
//        //for loop
//        for (int i = 0; i <= n; ++i) {
//            // body inside for loop
//            sum += i;     // sum = sum + i
//        }
//        System.out.println("Sum = " + sum);

//        int[] values = new int[5];
//        System.out.println(Arrays.toString(values));
//
//        for (int i = 1; i < values.length; i++) {
//            values[i] = i;
//
//        }
//
//        for (int myInt : values) {
//            System.out.println(myInt);
//        }
//
//        String[] myStrings = {"sang", "robert"};
//
//        for (String myString : myStrings) {
//            System.out.println(myString);
//
//        }
//
//        //for loop
//
//        int[] numbers = {3, 9, 11, 2};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(i);
//        }
//        // Enhanced for loop
//        int[] myNumbers = {3, 9, 11, 2};
//
//        for (int myNumber : myNumbers) {
//            System.out.println(myNumber);
//        }

        // Example 1: Access Array Elements;
        int[] age = {12, 4, 5, 2, 5};

        System.out.println("Example 1: Accessing elements of an array; ");
        System.out.println("Element 1: " + age[0]);
        System.out.println("Element 2: " + age [1]);
        System.out.println("Element 3: " + age [2]);
        System.out.println("Element 4: " + age [3]);
        System.out.println("Element 5: " + age [4] + "\n");

        //  Example 2: Using for Loop
        System.out.println("Example 2: Using a for loop: ");
        int[]age2 = {12, 4, 5};

        System.out.println("Using for loop");
        for(int i = 0; i < age2.length; i++) {
            System.out.println(age2[i] + "\n");
        }

        //Enhanced for loop
        System.out.println("Example 3: Using and enhance for loop: ");
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida"};
        for (String name : names) {
            System.out.println(name + "\n");
        }

        // Compute the Sum and Average of Array Elements

        System.out.println("Compute the Sum and Average of Array Elements: ");
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average + "\n");

        // Mean and Standard deviation
        System.out.println("Mean and standard deviation: ");

        //Declare variables

        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum1 = 0;
        int sumSq = 0;
        double mean, stdDev;

        // Compute sum and square-sum using loop

        for (int i = 0; i < marks.length; ++i) {
            sum1 += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double)sum1 / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

        // Print results
        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);


        //Example 6: Insert an Element at the end of an Array in Java

        System.out.println(("Insert an Element at the end of an Array in Java"));





    }
}





