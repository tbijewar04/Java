import java.util.*;

class SumInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Range from: ");
        int start = sc.nextInt();

        System.out.print("Enter Range to: ");
        int end = sc.nextInt();

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("Output: " + sum);
    }
}

