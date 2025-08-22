import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter integer b: ");
        int b = sc.nextInt();
        System.out.print("Enter integer c: ");
        int c = sc.nextInt();

        // Operations
        int result1 = a + b * c;    // b*c first, then +a
        int result2 = a * b + c;    // a*b first, then +c
        int result3 = c + a / b;    // a/b first (integer division), then +c
        int result4 = a % b + c;    // a%b first, then +c

        // Output
        System.out.println("The results of Int Operations are " 
                + result1 + ", " + result2 + ", " + result3 + ", and " + result4);

        sc.close();
    }
}
