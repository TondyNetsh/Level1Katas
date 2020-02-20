import java.util.ArrayList;
import java.util.Scanner;

public class LongestString {
    public static void LongString() {
        String longString = "";
        int maxLength = 0;
        ArrayList<String> strings = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        int i = 0;
        System.out.println("Enter five strings");
        for (i = 1; i <= 5; i++) {
            String names = sc.nextLine();
            strings.add(names);
        }

        for (String LongString : strings) {
            if (LongString.length() > maxLength) {
                maxLength = LongString.length();
                longString = LongString;
            }
        }
        System.out.print("Longest String: " + longString);
    }
}
