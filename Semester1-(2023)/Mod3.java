//Alejandro Quezada
//10/30/2023
//Module 3 Programming Assignment - Rock-Paper-Scissors
//The purpose of this program is for the user to play a game of Rock Paper Scissors with the computer.
import java.util.Random;
import java.util.Scanner;
//Note for myself: doing "import java.util.*;" will work the same as the imports above
public class Mod3 {
    public static void main(String[] args) {
        Scanner gameSelect = new Scanner(System.in);

        System.out.println("Please select a number: [1:Rock] [2:Paper] [3:Scissors] ");
        int userChoice = gameSelect.nextInt();

        Random rand = new Random();
        int computerChoice = rand.nextInt(1,4);

        System.out.println("The computer choose: " + computerChoice + "." + " The user choose: " + userChoice + ".");

        if(userChoice == computerChoice){
            System.out.println("It was a tie!!!");
        }
        else if((userChoice == 1 && computerChoice == 2) || (userChoice == 2 && computerChoice == 3) || (userChoice == 3 && computerChoice == 1)){
            System.out.println("You lost. :'(");
        }
        else if((userChoice == 2 && computerChoice == 1) || (userChoice == 3 && computerChoice == 2) || (userChoice == 1 && computerChoice == 3)){
            System.out.println("You won! :)");
        }
    }
}