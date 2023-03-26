package UdemyPracticePackage;

public class UdemyPractice {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score <= 5000) {
//            System.out.println("Your score was less than or equal to 5000");
//        } else {
//            System.out.println("You got here");
//        }
//    }

        // if with and else if and else block

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("You got here");
//        }

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
//
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//        if (newGameOver) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }






        }


    }
