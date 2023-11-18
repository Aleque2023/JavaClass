//Alejandro Quezada
//11/16/2023
//Module 6 Programming Assignment

import java.lang.Math;

public class Mod6 {
    public static void main(String[] args) {

        int x = 1;
        int y = 0;

        for(int a = 0; a < 7; ++a){

            for(int b1 = 7 ; b1 > a ; --b1){
                System.out.print(" ");
            }


            for(;y <= a; ++y){
                System.out.print(x + " ");

                for(int counter1 = 1; counter1 <= a;++counter1){
                    int counter = (int) Math.pow(2,counter1);
                    System.out.print(counter + " "); 
                }
                int f = 1;
                int e = 64;
                int counter3 = 7;

                for(int counter2 = 1; counter2 <= a; ++counter2){
                    --counter3;
                    System.out.print(counter3 + " ");
                }
                
                
            }


            for(int b = 7 ; b > a ; --b){
                System.out.print(" ");
            }

        System.out.println("@");

        }
    }
}