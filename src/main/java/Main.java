import java.util.Scanner;
/**
 * * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int sum = 0;

        for (int a = 0; a <= n; a++) {
            sum += a;
        }
        System.out.println(sum);
    }
}
