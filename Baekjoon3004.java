import java.util.Scanner;

public class Baekjoon3004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        if (A % 2 == 0) {
            System.out.println((A / 2 + 1) * (A / 2 + 1));
        } else {
            System.out.println((A / 2 + 1) * ((A - A / 2) + 1));
        }
    }
}
