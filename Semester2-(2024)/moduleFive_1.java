//Alejandro Quezada
//2/4/2024
//Module 5 Programming Assignment

import java.util.ArrayList;

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
    }
}
