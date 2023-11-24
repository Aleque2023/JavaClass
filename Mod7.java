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
        boolean uCase = false;
        boolean lCase = false;
        boolean leng = false;
        double total = 0;

        if(ruleCheck.length() >= 8){
            leng = true;
        } else {
            leng = false;
        }

        if(leng = true){
            total += 1;
        } else if(leng = false){
            total = total -100;
        }


        for(int loop1 = 0; loop1 <= ruleCheck.length();++loop1){
            uCase = Character.isUpperCase(ruleCheck.charAt(loop1));
            if(uCase = true){
                break;
            }
        }
        if(uCase = true){
            total += 1;
        } else if (uCase = false){
            total = total - 100;
        }


        for(int loop2 = 0; loop2 <= ruleCheck.length();++loop2){
            lCase = Character.isLowerCase(ruleCheck.charAt(loop2));
            if(lCase = true){
                break;
            }
        }
        if(lCase = true){
            total += 1;
        } else if(lCase = false){
            total = total - 100;
        }

        if(total > 0){
            System.out.println("Password meets all requirements!!!");
        } else{
            System.out.println("The password did not meet the requirement.");
        }
    }
}
