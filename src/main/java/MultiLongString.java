import java.util.ArrayList;
import java.util.Scanner;

public class MultiLongString {
    public static void MultiLongString() {
        Scanner sc = new Scanner(System.in);
        int maxLength = 0;
        System.out.println("How many words do you want to enter");
        int size = Integer.parseInt(sc.nextLine());
        String[] strings = new String[size];


        int i = 0;
        System.out.println("Enter "+ size + " strings");
        for (i = 1; i <= 5; i++) {
            strings[i] = sc.nextLine();
        }

        String longestString = strings[0];
        for (String LongString : strings) {
            if (longestString.length() < strings.length) {
                longestString = strings[i];
            }
        }

        for (i = 0; i < strings.length; i++) {
            if (longestString.length() < strings[i].length()) {
                System.out.println(strings[i]);
            }
        }
    }
}
