// File: Q16FractionTest.java

import java.util.Scanner;

public class Q16FractionTest{
    /*
        this code is a test for Q16Fraction

        the solution involves:
        1. scanner for the user input
        2. create 2 fractions using the user given input
        3. print out the 2 fractions, sum, and the product
     */

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // input for first fraction
        System.out.print("insert first numerator: ");
        int numerator1 = input.nextInt();
        System.out.print("insert first denominator: ");
        int denominator1 = input.nextInt();

        // input for second fraction
        System.out.print("insert second nominator: ");
        int numerator2 = input.nextInt();
        System.out.print("insert second denominator: ");
        int denominator2 = input.nextInt();

        // create two fractions with input values
        Q16Fraction f1 = new Q16Fraction(numerator1, denominator1);
        Q16Fraction f2 = new Q16Fraction(numerator2, denominator2);
        
        // print out the fractions
        System.out.println("f1: " + f1); 
        System.out.println("f2: " + f2); 
        
        // print out the getProduct of f2 and f1
        Q16Fraction getProduct = f2.getProduct(f1);
        System.out.println("getProduct: " + getProduct); 
        
        // print out the getSum of f2 and f1
        Q16Fraction getSum = f2.getSum(f1);
        System.out.println("getSum: " + getSum); 

        input.close(); 
    }
}
