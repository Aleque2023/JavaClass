//Alejandro Quezada
//11/16/2023
//Module 6 Programming Assignment

import java.lang.Math;

public class Mod6 {
    public static void main(String[] args) {

        int numOne = 1;
        int loopOne = 0;


        for(int start = 0; start < 7; ++start){
            int powerTwo = start;

            for(int spaceOne = 15 ; spaceOne > start ; --spaceOne){
                System.out.print(" ");
            }


            for(;loopOne <= start; ++loopOne){
                System.out.print(numOne + " ");

                for(int powerOne = 1; powerOne <= start;++powerOne){
                    int ascend = (int) Math.pow(2,powerOne);
                    System.out.print(ascend + " "); 
                }


                for(int loopTwo = 1;loopTwo <= start; ++loopTwo){
                    int descend = (int) Math.pow(2, powerTwo) / 2;
                    --powerTwo;
                    System.out.print(descend + " ");
                    }

            }
        

            for(int spaceTwo = 9 ; spaceTwo >= start ;--spaceTwo){
                for(int loopThree = 6; loopThree >= 0;){
                System.out.print(" ");
                loopThree -= 3;
                }
            }

            
        System.out.println("@");

        }
    }
}
