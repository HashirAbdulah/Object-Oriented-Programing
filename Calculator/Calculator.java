package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Enter Value");
        int num1 , num2 , resultAdd , resultDiff , resultDivison , resultMul;
         Scanner input = new Scanner(System.in);
        num1 = input.nextInt();
        num2 = input.nextInt();
        resultAdd = num1+num2;
        resultDiff = num1 - num2;
        resultDivison = num1 / num2;
        resultMul = num1 * num2;
        System.out.println("Addition = " + resultAdd);
        System.out.println("Multiplication = " + resultMul);
        System.out.println("Division = " + resultDivison);
        System.out.println("Substraction = " + resultDiff);      
    }
    
}
