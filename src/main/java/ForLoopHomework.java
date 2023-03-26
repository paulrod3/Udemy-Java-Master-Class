import java.util.Scanner;

public class ForLoopHomework {
    public static void main(String[] args) {
        System.out.println("Please type in a word: ");
        Scanner scanner = new Scanner(System.in); {
          String input = scanner.nextLine();

          length(input);
          forLoopPadding(input);
          whileLoopPadding(input);
          doWhileLoopPadding(input);

        }

    }

    public static void length(String input) {
      int length = input.length();
        System.out.println(length);
    }

    public static void forLoopPadding(String input) {
        String result = "";
        for(int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                result += input.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static void whileLoopPadding (String input) {
        String whileResult = "";
        int i =0;
        while (i < input.length()) {
            for (int j = 0; j < input.length(); j++) {
                whileResult += input.charAt(i);
            }
            i++;

        }
        System.out.println(whileResult);

    }

    public static void doWhileLoopPadding (String input) {
        String doWhileResult = "";
        int i = 0;
        do {
            doWhileResult+= (String.valueOf(input.charAt(i)).repeat(input.length()));
            i++;
        }
         while (i < input.length());
        System.out.println(doWhileResult);

        }
}
