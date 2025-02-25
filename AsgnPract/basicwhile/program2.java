

import java.util.*;

class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Range from: ");
        int start = sc.nextInt();

        System.out.println("Enter Range to: ");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 5 == 0) {
                System.out.println(i);

            }
        }
        
    }
}

