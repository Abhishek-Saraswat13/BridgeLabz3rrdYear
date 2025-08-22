import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                    " of two number " + num1 + " and " + num2);
        } else {
            System.out.println("Division by zero is not allowed!");
        }

        sc.close();
    }
}
