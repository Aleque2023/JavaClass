//Alejandro Quezada
//10/30/2023
//Module 4 Programming Assignment
//The purpose of this program is to check the strings entered and see if either one is the substring of the other, or vice versa
import java.util.*;

public class Mod4{
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter in the first string: ");
        String oneString = userInput.nextLine();

        System.out.println("Please enter in the second string: ");
        String secondString = userInput.nextLine();

        int test1 = oneString.indexOf(secondString);
        int test2 = secondString.indexOf(oneString);

        if(test1 > -1) {
            System.out.println("The 2nd string is the substring of the 1st.");
            System.out.println(test1);
        }
        if(test2 > -1) {
            System.out.println("The 1st string is the substring of the 2nd.");
            System.out.println(test2);
        }
    }
}