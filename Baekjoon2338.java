
/**
 * Baekjoon2338
 */
import java.util.Scanner;
import java.math.BigInteger;

public class Baekjoon2338 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();

        System.out.println(A.add(B));
        System.out.println(A.subtract(B));
        System.out.println(A.multiply(B));

    }
}