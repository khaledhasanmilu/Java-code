import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int x;
        System.out.print("Enter any number:");
        x = m.nextInt();
        m.close();
        System.out.println("The Squre is:" +x*x);
        System.out.println("The Cube is:" +x*x*x);


    }
}
