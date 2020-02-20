import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int choice, num;


        System.out.println("Choose a method to execute:\n" +
                "1 for Hello.\n" +
                "2 for Odd or Even.\n" +
                "3 for Square.\n" +
                "4 for Triangle.\n" +
                "5 for Isosceles.\n" +
                "6 for Longest String.\n" +
                "7 for Equal Strings.\n" +
                "8 for Array Combination.\n" +
                "9 for Framed Text.");
        choice = sc.nextInt();

        if(choice == 1) {
            System.out.println("======Hello======");
            Hello.hello();
        }
        else if(choice == 2){
            System.out.println("Enter number: ");
            num = sc.nextInt();

            System.out.println("=======Odd or Even===");
            EvenOrOdd.evenOrOdd(num);
        }
        else if(choice == 3){
            System.out.println("Enter number to draw a square ");
            num = sc.nextInt();

            System.out.println("=======Square========");
            Square.square(num);
        }
        else if(choice == 4){
            System.out.println("Enter number to draw triangle: ");
            num = sc.nextInt();

            System.out.println("=======Triangle======");
            Triangle.triangle(num);
        }
        else if(choice == 5){
            System.out.println("Enter number to draw Isosceles: ");
            num = sc.nextInt();

            System.out.println("=======Isosceles======");
            Isosceles.isosceles(num);
        }
        else if(choice == 6){
            System.out.println("===Longest String====");
            LongestString.LongString();
        }
        else if(choice == 7){
            System.out.println("=====Equal Strings====");
            MultiLongString.MultiLongString();
        }
        else if(choice == 8){
            System.out.println("===Combined Array====");
            CombineArrays.CombineArrays();
        }
        else if(choice == 9){
            System.out.println("Enter number of words to enter.");
            int size = Integer.parseInt(sc.nextLine());
            String[] txt = new String[size];

            System.out.println("Enter " + size + " words");
            for(i = 0; i < txt.length; i++){
                txt[i] = sc.nextLine();
            }

            System.out.println("==========Framed Text===========");
            FrameText.frameText(txt);
        }
        else{
            System.out.println("Invalid selection made");
        }
    }
}
