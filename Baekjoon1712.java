import java.util.Scanner;

public class Baekjoon1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // A�� �������=fixed cost , B�� �������=each cost , C�� ����
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();

        long count = 0;
        if (B >= C) {
            System.out.println(-1);
        } else {
            count = (A / (C - B));
            System.out.println(count + 1);
        }
    }
}
