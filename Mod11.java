//Alejandro Quezada
//12/10/2023
//Module 11 Programming Assignment

public class Mod11 {
    public static void main(String [] args){

        double [][] array1 = new double [5][7];
        int [][] array2 = new int [2][6];

        for(int x = 0; x < array1.length; ++x){
            for(int y = 0; y < array1[x].length; ++y){
                array1[x][y] = (int)(Math.random() * 100);
                System.out.println("[ " + x + " ] " + "[ " + y + " ] = " + array1[x][y]);
            }
        }
        int[] endOne = Mod11.locateLargest(array1);
        System.out.println("The location of the largest element in the 1st array is: [" + endOne[0] + "][" + endOne[1] + "]");

        int[] endThree = Mod11.locateSmallest(array1);
        System.out.println("The location of the smallest element in the 1st array is: [" + endThree[0] + "][" + endThree[1] + "]\n\n");


        for(int a = 0; a < array2.length; ++a){
            for(int b = 0; b < array2[a].length; ++b){
                array2[a][b] = (int)(Math.random() * 100);
                System.out.println("[ " + a + " ] " + "[ " + b + " ] = " + array2[a][b]);
            }
        }
        int[] endTwo = Mod11.locateLargest(array2);
        System.out.println("The location of the largest element in the 2nd array is: [" + endTwo[0] + "][" + endTwo[1] + "]");

        int[] endFour = Mod11.locateSmallest(array2);
        System.out.println("The location of the smallest element in the 2nd array is: [" + endFour[0] + "][" + endFour[1] + "]\n\n");
    }

    public static int [] locateLargest(double [][] arrayParam){
        int h1 = 0;
        int h2 = 0;
        for(int x = 0; x < arrayParam.length; ++x){
            for(int y = 0; y < arrayParam[x].length; ++y){
                if(arrayParam[x][y] > arrayParam[h1][h2]){
                    h1 = x;
                    h2 = y;
                }
            }
        }
        int[] highest = {h1,h2};
        return highest;
    }
 
    public static int [] locateLargest(int [][] arrayParam){
        int h3 = 0;
        int h4 = 0;
        for(int x = 0; x < arrayParam.length; ++x){
            for(int y = 0; y < arrayParam[x].length; ++y){
                if(arrayParam[x][y] > arrayParam[h3][h4]){
                    h3 = x;
                    h4 = y;
                }
            }
        }
        int[] highest = {h3,h4};
        return highest;
    }

    public static int [] locateSmallest(double [][] arrayParam){
        int tempX = arrayParam.length - 1;
        int tempY = arrayParam[tempX].length - 1;
        for(int x = 0; x < arrayParam.length; ++x){
            for(int y = 0; y < arrayParam[x].length; ++y){
                if(arrayParam[x][y] < arrayParam[tempX][tempY]){
                    tempX = x;
                    tempY = y;
                }
            }
        }
        int[] lowest1 = {tempX,tempY};
        return lowest1;
    }

    public static int [] locateSmallest(int [][] arrayParam){
        int tempX = arrayParam.length - 1;
        int tempY = arrayParam[tempX].length - 1;
        for(int x = 0; x < arrayParam.length; ++x){
            for(int y = 0; y < arrayParam[x].length; ++y){
                if(arrayParam[x][y] < arrayParam[tempX][tempY]){
                    tempX = x;
                    tempY = y;
                }
            }
        }
        int[] lowest2 = {tempX,tempY};
        return lowest2;
    }
}
