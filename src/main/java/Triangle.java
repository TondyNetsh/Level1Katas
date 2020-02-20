public class Triangle {
    public static void triangle(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (j <= i) {
                    System.out.print("# ");
                }
            }
            System.out.println("");
        }
    }
}
