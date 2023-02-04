
import java.util.Scanner;


    public class Lesson3 {
        public static void main(String[] args) {
            longestWord("hello", "hi", "mama");

        }

        public static void longestWord(String word1, String word2, String word3) {
            if (word1.length() > word2.length() && word1.length() > word3.length()) {
                System.out.println("Переше слово найдовше");
            } else if (word2.length() > word1.length() && word2.length() > word3.length()) {
                System.out.println("Друге слово найдовше");
            } else if (word3.length() > word1.length() && word3.length() > word2.length()) {
                System.out.println("Третє слово найдовше");
            } else {
                System.out.println("Деякі слова мають однакову довжину");
            }
        }

    }
