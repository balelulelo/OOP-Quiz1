//File: Q12Time.java

public class Q12Time{
    /**
     * this method computes the angle between the hour hand and the minute hand
     * of a traditional analog clock for given hours and minutes.
     * 
     * The hour on the clock (0-24)
     * The minutes on the clock (0-59)
     * The angle between the hour and minute hand in degrees, normalized between 0 and 359.
     */
    public static double calc_angle(int hours, int minutes) {
        
        // calculate the minute and hour hand angle

        double angle_minute = minutes * 6; 
        double hour_angle = (hours * 30) + (minutes * 0.5); 

        // calculate the difference in angle
        double angle = hour_angle - angle_minute;

        // normalize the angle to be between 0 and 360 degrees
        if (angle < 0 ) {
            // the angle has to be positive
            angle += 360; 
        }

        return angle; 
    }

    public static void main(String[] args) {

        // test the input given in the problem

        System.out.println("Angle at 9:00 = " + calc_angle(9, 0) + "°");
        System.out.println("Angle at 3:00 = " + calc_angle(3, 0) + "°");
        System.out.println("Angle at 18:00 = " + calc_angle(18, 0) + "°");
        System.out.println("Angle at 1:00 = " + calc_angle(1, 0) + "°");
        System.out.println("Angle at 2:30 = " + calc_angle(2, 30) + "°");
        System.out.println("Angle at 4:41 = " + calc_angle(4, 41) + "°");
    }
}
