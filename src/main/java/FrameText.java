import java.util.Scanner;

public class FrameText {
    public static void frameText(String[] words){
        int maxLength = 0, i;

        for(String txt : words){
            if (txt.length() > maxLength){
                maxLength = txt.length();
            }
        }
        for (i = 0; i <= maxLength + 1; i++){
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();

        for(i = 0; i < words.length;i++){
            System.out.print("* " + words[i]);
            for (int j = words[i].length(); j < maxLength; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
        for (i = 0; i < maxLength + 1; i++){
            System.out.print("*");
        }
        System.out.print("*");
        System.out.println();
    }
}

