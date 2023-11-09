//Alejandro Quezada
//11/9/2023
//Module 5 Programming Assignment
//The purpose of this program is to use while loops to display 

public class Mod5{
    public static void main(String [] args){

        double total1 = 0;
        double counter1 = 3;
        double total2 = 0;
        double counter2 = 99;

        while(counter1 < 100){
            double output1 = 1/counter1;
            total1 = total1 + output1;
            System.out.println(output1);
            ++counter1;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        while(counter2 > 2){
            double output2 = 1/counter2;
            total2 = total2 + output2;
            System.out.println(output2);
            --counter2;
        }
        System.out.println("");
        System.out.println("The total for smaller to larger order is: " + total1);
        System.out.println("");
        System.out.println("The total for larger to smaller order is: " + total2);


    }
}