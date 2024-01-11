//Alejandro Quezada
//10/29/2023
//Module 2 Programming Assignment
import java.util.Scanner;
public class Mod2 {
    public static void main(String[] args) {
        Scanner uPrompt = new Scanner(System.in);

        System.out.println("Enter in the amount of water (kg): ");
        double amountWater = uPrompt.nextDouble();
        System.out.println("Enter in the initial temperature of water: ");
        double intialTemp = uPrompt.nextDouble();
        System.out.println("Enter the final temperature of the water: ");
        double finalTemp = uPrompt.nextDouble();
        double Q = amountWater * (finalTemp - intialTemp) * 4184;

        System.out.println("The total amount of energy needed to heat the water is: " + Q + " Joules.");
    }
}