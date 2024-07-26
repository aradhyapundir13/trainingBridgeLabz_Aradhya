package TrainingDay2;
import java.util.Scanner;

public class Assignment22 {
    public static void main(String[] args) {
        int sum = 0;
        float average;
        Scanner fb = new Scanner(System.in);
        System.out.println("Enter Number Of Elements in array");
        int a= fb.nextInt();
        int[] arr1 = new int[a];
        System.out.println("Enter elements in the array");
        for (int i = 0; i <= a; i++ ) {
            arr1[i] = fb.nextInt();
            sum = sum + arr1[i];
            System.out.println("sum of integers:" +sum);
         average = sum/a;
        System.out.println("average of integers:"+average);
        }
    }
}
