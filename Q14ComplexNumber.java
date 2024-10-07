// File: Q14ComplexNumber.java

public class Q14ComplexNumber{
    
    /*
        this code consist of real and imaginary number. it performs
        addition, substraction, and multiplication of complex number

        the solution involves:
        1. storing the real and imaginary numbers
        2. a function / method to perform calculations
        3. return the complex number
     */

    // used for storing real number and imaginary number
    private double real;
    private double imaginary;

    // initialize the real and imaginary number
    public Q14ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // getter to return real and imaginary number
    public double Real() {
        return real;
    }

    public double Imaginary() {
        return imaginary;
    }

    // function to add two complex numbers
    public Q14ComplexNumber add(Q14ComplexNumber other){
        double new_real = this.real + other.real;
        double new_imaginary = this.imaginary + other.imaginary;
        return new Q14ComplexNumber(new_real, new_imaginary);
    }

    // function to subtract two complex numbers
    public Q14ComplexNumber subtract(Q14ComplexNumber other){
        double new_real = this.real - other.real;
        double new_imaginary = this.imaginary - other.imaginary;
        return new Q14ComplexNumber(new_real, new_imaginary);
    }

    // function to multiply two complex numbers
    public Q14ComplexNumber multiply(Q14ComplexNumber other){
        double new_real = this.real * other.real - this.imaginary * other.imaginary;
        double new_imaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Q14ComplexNumber(new_real, new_imaginary);
    }

    // convert the complex number to a string in the form "a + bi"
    public String toString(){
        return real + " + " + imaginary + "i";
    }
}
