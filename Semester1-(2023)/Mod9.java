//Alejandro Quezada
//11/30/2023
//Module 9 Programming Assignment

import java.math.*;
import java.util.*;

public class Mod9 {
    public static void main(String [] aStrings) {
    
        Random rand = new Random();
        int arrayLen = 20;
        int array1[] = null;
        array1 = new int [arrayLen];
        int high = 0;
        int low = 101;
        double total = 0;
        double average = 0;

        System.out.println("");

        for(int i = 0; i < array1.length; ++i){
            array1[i] = rand.nextInt(1,51);
            System.out.println("Array[" + i + "] = " + array1[i]);
            
            if(array1[i] > high){
                high = array1[i];
            }

            if(array1[i] < low){
                low = array1[i];
            }

            total += array1[i];
        }
        
        System.out.println("");

        average = (double) total/20;
        System.out.println("The highest value entered is: " + high);
        System.out.println("The lowest value entered is: " + low);
        System.out.println("The average of the numbers entered is: " + average);
        System.out.println("The sum of the values entered into the array is: " + total);

}   
    }
    
