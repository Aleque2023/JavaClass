//Alejandro Quezada
//11/9/2023
//Module 5 Programming Assignment
//The purpose of this program is to use while loops to display 

public class Mod5{
    public static void main(String [] args){

        double total = 0;
        double counter = 3;

        while(counter < 100){
            total += 1/counter;
        }
        System.out.println(total);
    }
}