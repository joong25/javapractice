
/**
 * Baekjoon2475
 */
import java.util.Scanner;

public class Baekjoon2475 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int E = scan.nextInt();
        int[] array = { A, B, C, D, E };

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total = total + (int) (Math.pow(array[i], 2));
        }

        int answer = total % 10;

        System.out.println(answer);
    }
}