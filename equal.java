import java.util.Scanner;

public class equal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First Number:");
        int a = s.nextInt();
        System.out.print("Enter Second Number:");
        int b = s.nextInt();
        System.out.print("Enter Third Number:");
        int c = s.nextInt();
        System.out.print( "All are Equal: "+ (a == b && b == c && c == a));
        System.out.print(  "\nTwo are Equal: "+ (a == b || b == c || c == a));
        s.close();
    }
}
