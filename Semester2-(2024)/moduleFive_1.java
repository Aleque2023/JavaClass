//Alejandro Quezada
//2/4/2024
//Module 5 Programming Assignment

import java.util.*;

public class moduleFive_1 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("The Hobbit");
        myList.add("Castlevania");
        myList.add("Tom and Jerry");
        myList.add("Suits");
        myList.add("Mr. Robot");
        myList.add("Dune");
        myList.add("Game of Thrones");
        myList.add("Regular Show");
        myList.add("Adventure Time");
        myList.add("Rick and Morty");
        
        for (String string : myList) {
            System.out.println(string);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWhich one would you like to see from the ArrayList? (1-10) ");

        try {
            int selected = scan.nextInt();
            selected = selected - 1;

            String selectedString = myList.get(selected);
            System.out.println("You chose: " + selectedString);
        } catch (InputMismatchException | IndexOutOfBoundsException e) {
            System.out.println("Exception Thrown: The Value You Entered Is Out Of Bounds.");
        } finally {
            scan.close();
        }
    }
}
