import java.util.*;

class CubeOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.print((i * i * i) + " ");
        }
	 System.out.println();
    }
}
