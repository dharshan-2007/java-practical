
import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an number : ");
        int num = sc.nextInt();
        System.out.println("Prime numbers upto " + num + " are,");
        for (int i = 2; i <= num; i++) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                System.out.print(i + "  ");
            }
        }
    }
}
