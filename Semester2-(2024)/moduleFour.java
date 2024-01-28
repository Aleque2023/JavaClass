//Alejandro Quezada
//1/28/2024
//Module 4 Programming Assignment

import java.util.*;

public class moduleFour {
    public static void main(String[] args) {
        ArrayList<Integer> uList = AlejandroArrayListTest.numInput();
        Integer maxNum = AlejandroArrayListTest.max(uList);
        System.out.println("Highest value is: " + maxNum);
    }
}

class AlejandroArrayListTest {
    public static Integer max(ArrayList list) {
        if (list.isEmpty()) {
            return 0;
        }

        Integer maxNum = list.get(0);
        for (Integer value : list) {
            if (value > maxNum) {
                maxNum = value;
            }
        }
        return maxNum;
    }

    public static ArrayList<Integer> numInput() {
        ArrayList<Integer> num = new ArrayList<Integer>();

        Scanner userInput = new Scanner(System.in);
        Integer numAdd;
        do {
            System.out.println("Enter a number, or enter 0 to exit: ");
            numAdd = userInput.nextInt();
            num.add(numAdd);
        } while (numAdd != 0);

        return num;
    }

}