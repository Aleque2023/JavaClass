//Alejandro Quezada
//11/16/2023
//Module 6 Programming Assignment

import java.lang.Math;

public class Mod6 {
    public static void main(String[] args) {
        int d = 0;
        int x = 1;
        int y = 0;
        int counter2 = 64;

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
                
                for(int z = 6; z >= 2;--z){
                    System.out.print(" " + (counter2 /(int) Math.pow(2,z)));
                }
                
                
            }


            for(int b = 7 ; b > a ; --b){
                System.out.print(" ");
            }

        System.out.println("@");

        }
    }
}