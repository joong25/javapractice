import java.util.Scanner;

public class Baekjoon2010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int total = 0;
        for (int i = 0; i < n; i++) {
            int k = scan.nextInt();
            if (i == n - 1) {
                total = total + k;
            } else {
                total = total + k - 1;
            }
        }
        System.out.println(total);

    }
}
