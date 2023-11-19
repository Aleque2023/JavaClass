//Alejandro Quezada
//11/16/2023
//Module 6 Programming Assignment

import java.lang.Math;

public class Mod6 {
    public static void main(String[] args) {

        int numOne = 1;
        int y = 0;


        for(int start = 0; start < 7; ++start){
            int powerTwo = start;
            int test = start;
            for(int spaceOne = 15 ; spaceOne > start ; --spaceOne){
                System.out.print(" ");
            }


            for(;y <= start; ++y){
                System.out.print(numOne + " ");

                for(int powerOne = 1; powerOne <= start;++powerOne){
                    int ascend = (int) Math.pow(2,powerOne);
                    System.out.print(ascend + " "); 
                }


                for(int k = 1;k <= start; ++k){
                    int descend = (int) Math.pow(2, powerTwo) / 2;
                    --powerTwo;
                    System.out.print(descend + " ");
                    }

            }
        

            for(int spaceTwo = 10 ; spaceTwo > start ;){
                spaceTwo = spaceTwo -test;
                --spaceTwo;
                System.out.print(" ");
            }


        System.out.println("@");

        }
    }
}