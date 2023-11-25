//Alejandro Quezada
//11/21/2023
//Module 7 Programming Assignment


import java.util.*;


public class Mod7 {
    public static void main(String [] args){

        Scanner uInput = new Scanner(System.in);

        System.out.println("Please input a password with the following requirements.\n8+ Characters\nContains Letters & Numbers\nOne uppercase and one lowercase character\n");
        String uPassword = uInput.nextLine();
        uInput.close();
        
        Mod7.rules(uPassword);
    }

    public static void rules(String ruleCheck){
        int total2 = 0;
        int leng = ruleCheck.length();

        if(leng >= 8){
        boolean uCase = false;
        boolean lCase = false;
        try{
        for(int loop1 = 0; loop1 <= leng;++loop1){
            char upper = ruleCheck.charAt(loop1);
            if(Character.isUpperCase(upper)){
                total2 += 1;
                System.out.println(total2);
                break;
            }

        }
        }
        finally{
            System.out.println("");
        }

        try{
        System.out.println(total2);
        for(int loop2 = 0; loop2 <= leng;++loop2){
            char lower = ruleCheck.charAt(loop2);
            if(Character.isLowerCase(lower)){
                total2 += 1;
                System.out.println(total2);
                break;
            }

        }
        }
        finally{
            System.out.println("");
        }

        if(total2 == 2){
            System.out.println("Password meets all requirements!!!");
        } else{
            System.out.println("The password did not meet the requirement.");
        }
        } else {
            System.out.println(("Does not meet length requirements."));
        }
    }
}
