import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int number;
        String name;

        // System.out.print("Enter any number:");

        System.out.print("Enter your name:");

        name = input.nextLine();
        input.close();
        System.out.println("Your name is:" + name);
    }

}
