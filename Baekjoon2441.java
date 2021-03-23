import java.util.Scanner;

public class Baekjoon2440 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < x; j++) {
                System.out.print("*");
            }
            if (i != x - 1) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
