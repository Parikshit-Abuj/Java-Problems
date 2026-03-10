import java.util.Scanner;

class BinaryToDecimal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary number: ");
        int num = sc.nextInt();

        int decimal = 0, i = 0;

        while(num != 0)
        {
            int r = num % 10;
            decimal = decimal + r * (int)Math.pow(2, i);
            num = num / 10;
            i++;
        }

        System.out.println("Decimal = " + decimal);
    }
}
