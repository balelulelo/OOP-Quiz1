// FIle: Q14ComplexNumberTest.java

import java.util.Scanner;

public class Q14ComplexNumberTest {

    /*
        this code is a test for Q14ComplexNumber. it allows user to input their
        complex number and perform calculations

        the solution involves:
        1. scanner for user input
        2. make 2 complex number with the input
        3. perform addition, substraction, and multiplication
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input the first complex number
        System.out.print("insert the first real number: ");
        double real1 = scanner.nextDouble();
        System.out.print("insert the first imaginary number: ");
        double imaginary1 = scanner.nextDouble();

        // input the second complex number
        System.out.print("insert the second real number ");
        double real2 = scanner.nextDouble();
        System.out.print("insert the second imaginary number: ");
        double imaginary2 = scanner.nextDouble();

        // make 2 complex number with the input
        Q14ComplexNumber num1 = new Q14ComplexNumber(real1, imaginary1);
        Q14ComplexNumber num2 = new Q14ComplexNumber(real2, imaginary2);

        // function to sum complex number
        Q14ComplexNumber sum = num1.add(num2);
        System.out.println("sum: " + sum);

        // function to subtract complex number
        Q14ComplexNumber difference = num1.subtract(num2);
        System.out.println("difference: " + difference);

        // function to multiply complex scanner
        Q14ComplexNumber product = num1.multiply(num2);
        System.out.println("product: " + product);

        scanner.close(); 
    }
}
