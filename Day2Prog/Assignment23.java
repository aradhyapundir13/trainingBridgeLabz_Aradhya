package TrainingDay2;
import java.util.Scanner;
public class Assignment23 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        Scanner hey = new Scanner(System.in);
        System.out.println("enter number of elements in an array");
        int y = hey.nextInt();
        int[] we = new int[y];
        System.out.println("enter elements of an array");
        for (int i = 0; i <= y; i++) {
            we[i] = hey.nextInt();
            if (we[i] / 2 == 0) {
                even++;
            } else {
                odd++;
            }
            System.out.println("number of even:" +even);
            System.out.println("number of odds:" +odd);
        }

    }
}
