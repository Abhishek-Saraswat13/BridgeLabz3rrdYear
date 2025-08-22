import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle (cm): ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle (cm): ");
        double height = sc.nextDouble();

        double area_cm = 0.5 * base * height;
        double area_in = area_cm / (2.54 * 2.54);

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", area_in, area_cm);

        sc.close();
    }
}
