//Alejandro Quezada
//1/21/2024
//Module 3 Programming Assignment

import java.util.*;

public class moduleThree {
    public static void main(String [] args) {
        integer code1 = new integer(11);
        integer code2 = new integer(7);
        integer code3 = new integer(11);

        System.out.println("Non static methods");
        System.out.println(code1.isEven());
        System.out.println(code2.isOdd());
        System.out.println(code3.isPrime());

        System.out.println("\nStatic (int)");
        System.out.println(integer.isEven(25));
        System.out.println(integer.isOdd(3));
        System.out.println(integer.isPrime(23));

        System.out.println("\nStatic (Integer)");
        System.out.println(integer.isEven(Integer.valueOf(55)));
        System.out.println(integer.isOdd(Integer.valueOf(34)));
        System.out.println(integer.isPrime(Integer.valueOf(5)));

        System.out.println("\nEquals methods");
        System.out.println(code1.equals(7));
        System.out.println(code1.equals(11));

        System.out.println(code1.equals(code2.getAlejandroInteger()));
        System.out.println(code1.equals(code3.getAlejandroInteger()));

        System.out.println(code1.equals(Integer.valueOf(7)));
        System.out.println(code1.equals(Integer.valueOf(11)));
    }
}

class integer{
    private int AlejandroInteger;

    public integer(int start) {
        this.AlejandroInteger = start;
    }

    public int getAlejandroInteger() {
        return AlejandroInteger;
    }

    public void setAlejandro(int AlejandroInteger) {
        this.AlejandroInteger = AlejandroInteger;
    }

    public boolean isEven() {
        return AlejandroInteger % 2 == 0;
    }

    public boolean isOdd() {
        return AlejandroInteger % 2 != 0;
    }

    public boolean isPrime() {
        if (AlejandroInteger<= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(AlejandroInteger); i++) {
            if (AlejandroInteger % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static boolean isEven(int statNum) {
        return statNum % 2 == 0;
    }

    public static boolean isOdd(int statNum) {
        return statNum % 2 != 0;
    }

    public static boolean isPrime(int statNum) {
        if (statNum<= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(statNum); i++) {
            if (statNum % i == 0) {
                return false;
            }
        }
        return true;
    }



    public static boolean isEven(Integer statNum) {
        return statNum % 2 == 0;
    }

    public static boolean isOdd(Integer statNum) {
        return statNum % 2 != 0;
    }

    public static boolean isPrime(Integer statNum) {
        if (statNum<= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(statNum); i++) {
            if (statNum % i == 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(int eq) {
        return this.AlejandroInteger == eq;
    }

    public boolean equals(Integer eq) {
        return eq != null && eq.equals(this.AlejandroInteger);
    }
}