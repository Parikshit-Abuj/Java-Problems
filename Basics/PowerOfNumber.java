//using for loop
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int base = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= power; i++) {
            result = result * base;
        }

        System.out.println("Answer = " + result);
    }
}

//using math.pow
import java.util.Scanner;

public class PowerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int base = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        double result = Math.pow(base, power);

        System.out.println("Answer = " + result);
    }
}
