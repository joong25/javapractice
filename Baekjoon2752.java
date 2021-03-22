
/**
 * Baekjoon2752
 */
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon2752 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        int[] array = { A, B, C };

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}