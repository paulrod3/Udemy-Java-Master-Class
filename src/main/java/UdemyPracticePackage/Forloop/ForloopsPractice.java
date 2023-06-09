package UdemyPracticePackage.Forloop;

public class ForloopsPractice {
    public static void main(String[] args) {

        for ( int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

        System.out.println("10,000 at 2% interest = " +
                calculateInterest(10000, 2));

        for (double rate = 7.5; rate <= 10; rate+=0.25){
            double interestAmount = calculateInterest(100, rate);
            if (interestAmount > 8.5) {
                break;

            }
            System.out.println("10,000 at " + rate + "% interest = $" + interestAmount);
        }

    }

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
