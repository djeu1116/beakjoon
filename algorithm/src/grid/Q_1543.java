package grid;
import java.util.Scanner;

public class Q_1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String word = sc.nextLine();

        int docIndex = 0;
        int wordIndex = 0;
        int count = 0;

        for (; docIndex < document.length(); docIndex++) {
            boolean isTrue = true;
            wordIndex = 0;
            for (; wordIndex < word.length(); wordIndex++) {
                if (docIndex + wordIndex >= document.length() || document.charAt(docIndex + wordIndex) != word.charAt(wordIndex)) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                count++;
                docIndex += word.length() - 1;
            }
        }
        System.out.println(count);
    }
}
