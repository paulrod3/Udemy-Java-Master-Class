package UdemyChallanges;

public class MethodChallenge1 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Paul" , highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim" , highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Vanessa" , highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Fernando" , highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Mia" , highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list");
    }
    public static int calculateHighScorePosition (int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return
        position = 4;

    }
}
