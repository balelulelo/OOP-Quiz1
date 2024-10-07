// FIle: Q15Weight.java

public class Q15Weight{

    /*
        this code converts weight in pound to kilograms and retrieve both weight

        the solution involves:
        1. storing the weight in pound
        2. return the weight in pound and convert to kilogram
     */

    //store the weight in pounds
    private double pounds;

    // initialize the weight in pounds
    public Q15Weight(double pounds){
        this.pounds = pounds;

    }
    // function to return the weight in pound
    public double getPounds(){
        return this.pounds;
    }

    // function to return the weight in Kg
    // pound * 0,45 (1 pound  = 0,45 kg)
    public double getKilograms(){
        double kg = 0.453592;
        
        return pounds * kg;
    }

}
