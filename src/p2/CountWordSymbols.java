package p2;
 /*
    1. Напишіть метод, який знаходить найдовше слово серед трьох, використовуючи if/else
 */
public class CountWordSymbols {
    public static void main(String[] args) {

        String word1 = "exhausted";
        int len1 = word1.length();

        String word2 = "miss";
        int len2 = word2.length();

        String word3 = "miscellaneous";
        int len3 = word3.length();

        if (len1 > len2 && len1 > len3) {
            System.out.println("word1 " + word1 + " with letters length " + len1 + " is the largest");
        } else if (len2 > len1 && len2 > len3) {
            System.out.println("word2 " + word2 + " with letters length " + len2 + " is the largest");
        } else if (len3 > len1 && len3 > len2)
            System.out.println("word3 " + word3 + " with letters length " + len3 + " is the largest");
    }
}