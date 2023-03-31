package SampleCodingExercises_Udemy;

public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(50);


    }
    public static long toMilesPerHour  (double kilometersPerHour) {
        if (kilometersPerHour < 0 ){
            return -1;
        }
        return Math.round(kilometersPerHour/1.609);
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }else {
            long mph = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h" + " = " + mph + " mi/h");
        }

    }
}
