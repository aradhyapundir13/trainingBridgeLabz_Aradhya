package Training;
import java.util.Scanner;
public class CompareStrings {
    public static void main(String[] args) {
        Scanner gm = new Scanner(System.in);
        System.out.println("enter String 1");
        String str1 = gm.next();
        System.out.println("enter String 1");
        String str2 = gm.next();
        if (str1.equals(str2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}
