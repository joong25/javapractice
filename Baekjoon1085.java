import java.util.Scanner;
import java.util.Arrays;

//최소값 메소드 사용 
public class Baekjoon1085 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int dis1 = x;
        int dis2 = y;
        int dis3 = w - x;
        int dis4 = h - y;

        int arr[] = { dis1, dis2, dis3, dis4 };
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println(min);
        //sdfsdfsdsd
    }
}
