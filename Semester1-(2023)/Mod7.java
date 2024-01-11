//Alejandro Quezada
//11/25/2023
//Module 7 Programming Assignment - Creating a password checker program


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
        int total = 0;
        int leng = ruleCheck.length();

        if(leng >= 8){  


            try{
                for(int loop1 = 0; loop1 <= leng; ++loop1){
                    char upper = ruleCheck.charAt(loop1);
                    if(Character.isUpperCase(upper)){
                        total += 1;
                        break;
                    }
                }
            } catch(Exception e){

            }


            try{
                for(int loop2 = 0; loop2 <= leng; ++loop2){
                    char lower = ruleCheck.charAt(loop2);
                    if(Character.isLowerCase(lower)){
                        total += 1;
                        break;
                    }
                }
            } catch (Exception e){   

            }

        
            try{
                for(int loop3 = 0; loop3 <= leng; ++loop3){
                    char ch = ruleCheck.charAt(loop3);
                    if(Character.isAlphabetic(ch)){
                        total += 1;
                        break;
                    }
                }
            } catch (Exception e){

            }


            try{
                for(int loop4 = 0; loop4 <= leng; ++loop4){
                    char num = ruleCheck.charAt(loop4);
                    if(Character.isDigit(num)){
                        total += 1;
                        break;
                    }
                }
            } catch (Exception e){

            }


            if(total == 4){
                System.out.println("Password meets all requirements!!!");
            } else {
                System.out.println("The password did not meet the requirement.");
            }
        } else {
            System.out.println(("Does not meet length requirements."));
        }
    }
}
