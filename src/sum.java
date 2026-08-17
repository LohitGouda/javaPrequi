import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum +i*i;
        }

        System.out.println("The factorialof first n numbers is: " + sum);
    }
}