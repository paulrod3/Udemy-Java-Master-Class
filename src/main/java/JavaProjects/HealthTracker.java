package JavaProjects;

import java.util.Scanner;

public class HealthTracker {
    private String name;
    private int age;
    private double weight;
    private double height;
    private double bmi;
    private double calorieIntake;
    private Scanner input;

    public HealthTracker(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI();
        this.calorieIntake = calculateCalorieIntake();
        this.input = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("Welcome to HealthTracker, " + name + "!");
            System.out.println("What would you like to do?");
            System.out.println("1. View BMI");
            System.out.println("2. View recommended calorie intake");
            System.out.println("3. Update weight");
            System.out.println("4. Exit");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your BMI is: " + bmi);

                    if (bmi < 18.5) {
                        System.out.println("You are underweight.");
                    } else if (bmi < 25) {
                        System.out.println("You are at a healthy weight.");
                    } else if (bmi < 30) {
                        System.out.println("You are overweight.");
                    } else {
                        System.out.println("You are obese.");
                    }
                    break;
                case 2:
                    System.out.println("Your recommended calorie intake is: " + calorieIntake);
                    if (calorieIntake > 2000) {
                        System.out.println("To lose weight, aim to eat 500-1000 calories " +
                                "less per day than your recommended intake.");
                    } else {
                        System.out.println("To gain muscle, aim to eat 500-1000 calories " +
                                "more per day than your recommended intake, " +
                                "and make sure to include plenty of protein in your diet.");
                    }
                    break;
                case 3:
                    System.out.print("Enter your new weight in pounds: ");
                    weight = input.nextDouble();
                    bmi = calculateBMI();
                    calorieIntake = calculateCalorieIntake();
                    System.out.println("Weight updated.");
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting HealthTracker...");
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    break;
            }
        }
    }

    private double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    private double calculateCalorieIntake() {
        return 10 * weight + 6.25 * height - 5 * age + 5;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        HealthTracker tracker = new HealthTracker(name, age, weight, height);
        tracker.run();
    }
}
