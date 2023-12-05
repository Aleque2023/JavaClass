//Alejandro Quezada
//11/30/2023
//Module 9 Programming Assignment

import java.math.*;
import java.util.*;

public class Mod10DIs {
    public static void main(String [] aStrings) {
    
        List list = new ArrayList ();
        Set set = new HashSet ();
        Integer intObject;
        for(int i = 0; i < 100; ++i){
             intObject = ((int) (Math.random() * 10 + 1));
             list.add(intObject);
             set.add(intObject);
        }
        System.out.println("List size = " + list.size()); 
        System.out.println("Set size = " + set.size()); 

}   
    }
    