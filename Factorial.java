package TSI.lv;

import java.util.*;

class FactorialExample {
    public static void main(String args[]) {
        int i, fact = 1;
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter a number ");
        int number= sc.nextInt();

        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
