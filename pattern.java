import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.print("Enter the number - ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" * ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
