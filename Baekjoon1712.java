import java.util.Scanner;

public class Baekjoon1712 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // A는 고정비용=fixed cost , B는 가변비용=each cost , C는 가격
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
