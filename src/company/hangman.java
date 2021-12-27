package company;
import java.util.Scanner;

public class hangman {

    public static class Hangman {

        private static String[] words = {"kotlin", "javascript", "java", "python" };
        private static String word = words[(int) (Math.random() * words.length)];
        private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
        private static int count = 0;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (count < 7 && asterisk.contains("*")) {
                System.out.println("Guess any letter in the word");
                System.out.println(asterisk);
                String guess = sc.next();
                hang(guess);
            }
            sc.close();
        }

        public static void hang(String guess) {
            String newasterisk = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newasterisk += guess.charAt(0);
                } else if (asterisk.charAt(i) != '*') {
                    newasterisk += word.charAt(i);
                } else {
                    newasterisk += "*";
                }
            }

            if (asterisk.equals(newasterisk)) {
                count++;
                TryAg();
            } else {
                asterisk = newasterisk;
            }
            if (asterisk.equals(word)) {
                System.out.println("You survived!)  ");
            }
        }

        public static void TryAg() {
            if (count == 1) {
                System.out.println("Wrong guess, try again");
            }
            if (count == 2) {
                System.out.println("Wrong guess, try again");
            }
            if (count == 3) {
                System.out.println("Wrong guess, try again");
            }
            if (count == 4) {
                System.out.println("Wrong guess, try again");
            }
            if (count == 5) {
            }
            if (count == 6) {
                System.out.println("Wrong guess, try again");
            }
            if (count == 7) {
                System.out.println("You lost! The word was " + word);
            }
        }
    }
}
