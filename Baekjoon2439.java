import java.util.Scanner;

public class Baekjoon2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = i; j < x - 1; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
