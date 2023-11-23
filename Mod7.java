//Alejandro Quezada
//11/21/2023
//Module 7 Programming Assignment

import java.util.*;

public class Mod7 {
    public static void main(String [] args){

        Scanner uInput = new Scanner(System.in);

        System.out.println("Please input a password with the following requirements.\n8+ Characters\nContains Letters & Numbers\nOne uppercase and one lowercase character\n");
        String uPassword = uInput.nextLine();
        
        Mod7.rules(uPassword);
    }

    public static void rules(String ruleCheck){
        if(ruleCheck.length() >= 8){
            for(int loop1 = 0; loop1 <= ruleCheck.length();++loop1){
                Boolean uCase = Character.isUpperCase(ruleCheck.charAt(loop1));
                Boolean lCase = Character.isLowerCase(ruleCheck.charAt(loop1));

                if(uCase == true && lCase == true){
                System.out.println("Password meets all requirements!!!");
                }
            }
        }
        else{
            System.out.println("The password did not meet the requirement.");
        }
    }
}
