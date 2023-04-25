package JavaProjects;

import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You are in a dark room. There is a door to your left " +
                "and a door to your right.");
        System.out.print("Which way do you want to go? (left/right): ");
        String direction = input.nextLine();

        if (direction.equalsIgnoreCase("left")) {
            System.out.println("You enter a room with a chest in the middle. " +
                    "Do you want to open it? (yes/no)");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("You find a key inside the chest. " +
                        "You can use it to open the door to the right.");
            } else {
                System.out.println("You leave the chest untouched " +
                        "and go back to the previous room.");
            }

            System.out.print("Which way do you want to go now? (left/right): ");
            direction = input.nextLine();

            if (direction.equalsIgnoreCase("right")) {
                System.out.println("You use the key to open the door to the " +
                        "right and exit the room. Congratulations, you escaped!");
            } else {
                System.out.println("You decide not to go that way and stay " +
                        "in the room. The game is over.");
            }

        } else if (direction.equalsIgnoreCase("right")) {
            System.out.println("You enter a room with a monster inside. " +
                    "It attacks you and you die. The game is over.");
        } else {
            System.out.println("Invalid input. The game is over.");
        }
    }
}
