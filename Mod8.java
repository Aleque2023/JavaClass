//Alejandro Quezada
//11/29/2023
//Module 8 Programming Assignment

import java.math.*;
import java.util.*;


public class Mod8 {
    public static void main(String [] args){
        
        System.out.println("Car 1");
        System.out.println("\nThe standard service charge is: $" + Mod8.yearlyService());
        System.out.println("The standard service charge and oil change fee is: $" + Mod8.yearlyService(35));
        System.out.println("The total for the standard service charge, oil change fee, and tire rotation charge is: $" + Mod8.yearlyService(35,65.55));
        System.out.println("Including the coupon, the grand total for all three services is: $" + (double) Math.round((Mod8.yearlyService(35,65.55,174.33)))/ 100);

        System.out.println("\n\nCar 2");
        System.out.println("\nThe standard service charge is: $" + Mod8.yearlyService());
        System.out.println("The standard service charge and oil change fee is: $" + Mod8.yearlyService(47));
        System.out.println("The total for the standard service charge, oil change fee, and tire rotation charge is: $" + Mod8.yearlyService(47,82.99));
        System.out.println("Including the coupon, the grand total for all three services is: $" + (double) Math.round((Mod8.yearlyService(47,82.99,277.77)))/ 100);
    }

    public static float yearlyService(){
        return 900;
    }

    public static int yearlyService(int oil){
        return oil + 900;
    }

    public static double yearlyService(double oil, double tire){
        return oil + tire + 900;
    }

    public static double yearlyService(double oil, double tire, double coupon){
        return (oil + tire + 900 - coupon) * 100;
    }
}
