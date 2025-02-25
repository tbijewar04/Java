import java.util.*;

class SquareReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number N: ");
        int N = sc.nextInt();

        if (N < 1 || N > 50) {
            System.out.println("Please enter a number between 1 and 50.");
            return;
        }

        for (int i = N; i >= 1; i--) {
            System.out.println(i * i);
        }
    }
}

