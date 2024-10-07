//File : Q15WeightTest.java

import java.util.Scanner;

public class Q15WeightTest{
    /*
        this code is a test for Q15Weight. this code allows user to insert
        the weight and convert it to kilogram

        the solution involves:
        1. scanner for input the weight
        2. create an objet (weight) using the input
        3. display the weight in pound and kilogram    
     */

    public static void main(String[] args){

        // scanner for taking input
        Scanner input = new Scanner(System.in);

        // input the wright in pounds
        System.out.print("Insert weight (pounds): ");
        double pounds = input.nextDouble();

        // create an object (weight) with using the input
        Q15Weight weight = new Q15Weight(pounds);

        // print out both the weight in pound and the converted version in kilograms

        System.out.println("Weight in pounds: " + weight.getPounds() + " lbs");
        System.out.printf("Weight in kilograms: %.2f kg\n", weight.getKilograms());
        //using %.2f to round the kilogram output to 2 decimal places (.00)

        input.close();

    }

}



