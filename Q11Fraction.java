// File: Q11Fraction.java

public class Q11Fraction{
    /**
         * This class represents two fractions and provides methods to perform 
         * arithmetic operations on them, specifically addition and multiplication.
         * 
         * The solution involves:
         * 1. Storing the numerators and denominators of the two fractions.
         * 2. Implementing methods to add and multiply the fractions by 
         *    calculating the resulting numerator and denominator.
         * 3. Simplifying the result using the Greatest Common Divisor (GCD).
         * 4. Returning the simplified fraction as a string.
         */

    int num1, den1, num2, den2; 
    
    // function to save the numbers for the fraction
    public Q11Fraction(int num1, int den1, int num2, int den2) {
        this.num1 = num1;
        this.den1 = den1;
        this.num2 = num2;
        this.den2 = den2;
    }
    
    // function to do addition
    public String addition(){
        int Num = (num1 * den2) + (num2 * den1);
        int Den = den1 * den2;
        return simplify(Num, Den);
    }
    
    // function to do multiplication
    public String multiplication(){
        int Num = num1 * num2;
        int Den = den1 * den2;
        return simplify(Num, Den);
    }
    
    // function to find the Greatest Common Divisor (GCD) of the fraction
    public int GCD(int x, int y){
        if (y == 0) {
            return x;
        }
        return GCD(y, x % y);
    }

    // function to simplify the fraction
    public String simplify(int Num, int Den){
        int GCD = GCD(Num, Den);
        Num /= GCD;
        Den /= GCD;
        return Num + "/" + Den;
    }

    public static void main(String[] args){
        
        // test the class with the given input in the quiz :

        Q11Fraction q1 = new Q11Fraction(1, 2, 1, 3);
        System.out.println("1/2 + 1/3 = " + q1.addition()); 
        
        Q11Fraction q2 = new Q11Fraction(1, 3, 3, 4);
        System.out.println("1/3 + 3/4 = " + q2.addition()); 
       
        Q11Fraction q3 = new Q11Fraction(1, 2, 2, 3);
        System.out.println("1/2 * 2/3 = " + q3.multiplication()); 
    
        Q11Fraction q4 = new Q11Fraction(1, 4, 2, 3);
        System.out.println("1/4 * 2/3 = " + q4.multiplication()); 
    
    }
}
