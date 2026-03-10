// PALINDROME NUMBER
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num;
        int reversednum = 0;
        int temp;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;  // Store original number

        while (temp > 0) {
            int remainder = temp % 10;
            reversednum = reversednum * 10 + remainder;
            temp = temp / 10;
        }

        if (num == reversednum) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }

        sc.close();
    }
}