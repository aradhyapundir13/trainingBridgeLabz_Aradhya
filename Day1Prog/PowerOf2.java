package Training;

public class PowerOf2 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        for(int i=0;i<=a;i++)
        {
            System.out.println(Math.pow(2,i));
        }
    }
}