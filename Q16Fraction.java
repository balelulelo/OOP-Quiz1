// File : Q16Fraction.java

public class Q16Fraction {
    /* 
        this code represent a fraction and the method / function to perform the operations

        the solution involves:
        1. store the numerator and denominator
        2. ensure the denominator is not zero
        3. provide method / function to get numerator, denominator, and simplifying
        4. calculating the sum and the product
    
    */
    // store the numerator and denominator
    private int num;
    private int den;
    
    // Constructor to initialize the fraction
    public Q16Fraction(int num, int den) {
        // Handle the case where the denominator is zero
        if (den == 0) {
            throw new IllegalArgumentException("Invalid amount (denominator can't be zero!)");
        }
        this.num = num;
        this.den = den;
        simplify();
    }
    
    // getter to get the numerator
    public int getNumerator() {
        return this.num;
    }
    // getter to get the denominator
    public int getDenominator() {
        return this.den;
    }
    
    // function to convert the fraction to a string
    public String toString() {
        return num + "/" + den;
    }
    
    // function to simplify the fraction
    private void simplify() {
        int GCD = GCD(this.num, this.den);
        this.num /= GCD;
        this.den /= GCD;
    }
    
    // function to find the Greatest Common Divisor (GCD)
    public int GCD(int x, int y){
        if (y == 0) {
            return x;
        }
        return GCD(y, x % y);
    }

    // function to get the getSum of 2 fractions
    public Q16Fraction getSum(Q16Fraction other){
        int newnum = this.num * other.den + other.num * this.den;
        int newden = this.den * other.den;
        return new Q16Fraction(newnum, newden);
    }
    
    // function to get the getProduct of 2 fractions
    public Q16Fraction getProduct(Q16Fraction other){
        int newnum = this.num * other.num;
        int newden = this.den * other.den;
        return new Q16Fraction(newnum, newden);
    }
}
