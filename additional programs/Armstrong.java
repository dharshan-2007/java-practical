import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = n, sum = 0;
        while (temp > 0) {
            int r = temp % 10;
            sum += r * r * r;
            temp /= 10;
        }
        System.out.println((sum == n) ? "Armstrong" : "Not Armstrong");
    }
}
