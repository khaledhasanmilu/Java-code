import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = s.nextInt();
        System.out.print("Enter Second Number:");
        int b = s.nextInt();
        System.out.print( "Is this True/False: "+ (a < 50 && a < b ));
        s.close();
    }
}
