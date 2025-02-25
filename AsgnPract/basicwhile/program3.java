import java.util.*;

class DivisibleByFourOrSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range from: ");
        int start = sc.nextInt();

        System.out.println("Enter Range to: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 4 == 0 || i % 7 == 0) {
                System.out.println(i);
                
            }
        }
       
    }
}

