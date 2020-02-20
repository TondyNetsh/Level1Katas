public class Isosceles {
    public static void isosceles(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++)
                System.out.print(" ");
            for (int j = 0; j < (2 * i - 1); j++)
                System.out.print("#");
            System.out.println();
        }
    }
}
