import java.util.ArrayList;
import java.util.Scanner;

public class CombineArrays {
    public static void CombineArrays() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> combine = new ArrayList<Integer>();
        int[] array1 = new int[3];
        int[] array2 = new int[3];

        System.out.println("Enter array 1 elements.");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Enter array 2 elements.");
        for (int i = 0; i < array1.length; i++) {
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            combine.add(array1[i]);
            for (int j = 0; j < 1; j++) {
                combine.add(array2[i]);
            }
        }
        System.out.println("Combined Array: " + combine);
    }
}
