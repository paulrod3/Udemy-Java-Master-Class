package SampleCodingExercises_Udemy;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(6500);

    }
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid");
        }else {
            int megabytes = kiloBytes / 1024;
            int kiloRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB" + " = " + megabytes + " MB and "
                    + kiloRemainder + " KB");


        }
    }
}
