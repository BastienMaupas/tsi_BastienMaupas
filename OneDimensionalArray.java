package TSI.lv;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArray {

    public static void main(String[] args ) {

        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a number ");
        int x = sc.nextInt();

        Scanner sca= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a number ");
        int y= sca.nextInt();

        int max = 0;
        int min = 100;
        int a;
        double sum = 0;
        double average;

        Random rand = new Random();
        int[][] tableau = new int [x][y];
        for (int i = 0; i<x; i++ ) {
            tableau[i][i] = rand.nextInt(100);

        for (int j = 0; j<y; j++) {
            tableau[i][j] = rand.nextInt(100);
            sum = sum + tableau[i][j];

            System.out.print(tableau[i][j]+" ");

            a = tableau[i][j];
            if (a > max){
                max = a;
            }
            if (a<min){
                min = a;
            }

        }
        System.out.println();

        }
        System.out.println("The maximum is " + max);
        System.out.println("The minimum is " + min);
        average = sum/(x*y);
        System.out.println("The average is " + average);
    }
}

