
import java.util.*;
public class StringSorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names : ");
        int n = sc.nextInt();
        sc.nextLine();
        String names[] = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + " : ");
            names[i] = sc.nextLine();
        }
        Arrays.sort(names);
        for(String name:names)
        
    }
}
