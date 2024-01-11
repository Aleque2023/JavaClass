//Alejandro Quezada
//12/10/2023
//Module 10 Programming Assignment

public class Mod10 {
    public static void main(String [] args){

        short array1[] = new short [5];
        int array2[] = new int [3];
        long array3[] = new long [8];
        double array4[] = new double[11];


        System.out.println("\n\n\t\tThis is the short datatype array");
        System.out.println("The average for array 1 is: " + Mod10.average(array1) / array1.length + "\n");

        System.out.println("\n\n\t\tThis is the int datatype array");
        System.out.println("The average for array 2 is: " + Mod10.average(array2) / array2.length + "\n");

        System.out.println("\n\n\t\tThis is the long datatype array");
        System.out.println("The average for array 3 is: " + Mod10.average(array3) / array3.length + "\n");

        System.out.println("\n\n\t\tThis is the double datatype array");
        System.out.println("The average for array 4 is: " + Mod10.average(array4) / array4.length + "\n"); 
    }

    public static short average(short [] array){
        short total = 0;
        for(short i = 0; i < array.length; ++i){
            System.out.println(array[i] = (short)(Math.random() * 100));
            total += array[i];
        }
        return total;
    }

    public static int average(int [] array){
        int total = 0;
        for(int i = 0; i < array.length; ++i){
            System.out.println(array[i] = (int)(Math.random() * 100));
            total += array[i];
        }
        return total;
    }

    public static long average(long [] array){
        long total = 0;
        for(int i = 0; i < array.length; ++i){
            System.out.println(array[i] = (long)(Math.random() * 100));
            total += array[i];
        }
        return total;
    }

    public static double average(double [] array){
        double total = 0;
        for(int i = 0; i < array.length; ++i){
            System.out.println(array[i] = (double)(Math.random() * 100));
            total += array[i];
        }
        return total;
    }
    
}
