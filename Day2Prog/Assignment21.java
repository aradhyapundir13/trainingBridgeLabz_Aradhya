package TrainingDay2;
import java.util.Scanner;
public class Assignment21 {
    public static void main(String[] args) {
        Scanner am = new Scanner(System.in);
        System.out.println("enter number of elements in an array");
        int b = am.nextInt();
        int[] arr = new int[b];
        System.out.println("enter elements of array");
        for (int i = 0 ; i <=b ; i ++){
        arr [i]= am.nextInt();
            System.out.println("array display:" + arr[i]+ " ");
        }
    }
}
