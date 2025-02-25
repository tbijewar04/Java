import java.util.*;

class DaysCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day = ");
        int days = sc.nextInt();

        for (int i = days; i >= 0; i--) {
            if (i > 1) {
                System.out.println(i + " days remaining");
            } else if (i == 1) {
                System.out.println(i + " day remaining");
            } else {
                System.out.println(i + " days Assignment is Overdue");
            }
        }
    }
}

