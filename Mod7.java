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
        boolean total = false;
        boolean total2 = false;
        boolean total3 = false;

        if(ruleCheck.length() >= 8){
            leng = true;
        } else {
            leng = false;
        }
        if(leng = true){
            total = true;
        } else if(leng = false){
            total = false;
        }


        for(int loop1 = 0; loop1 <= ruleCheck.length();++loop1){
            uCase = Character.isUpperCase(ruleCheck.charAt(loop1));
            if(uCase = true){
                break;
            }
        }
        if(uCase = true){
            total2 = true;
        } else if (uCase = false){
            total2 = false;
        }


        for(int loop2 = 0; loop2 <= ruleCheck.length();++loop2){
            lCase = Character.isLowerCase(ruleCheck.charAt(loop2));
            if(lCase = true){
                break;
            }
        }
        if(lCase = true){
            total3 = true;
        } else if(lCase = false){
            total3 = false;
        }


        if(total2 == true){
            System.out.println("Password meets all requirements!!!");
        } else{
            System.out.println("The password did not meet the requirement.");
        }
    }
}
