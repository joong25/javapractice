import java.util.Scanner;

public class Baekjoon2558 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A > 0 & B < 10) {
            System.out.println(A + B);
        }
    }
}
