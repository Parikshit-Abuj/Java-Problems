//REVERSE A NUMBER
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int number;
		System.out.println("enter number:");
		number = s.nextInt();
		
		int answer = 0;
		while(number > 0){
			int lastDigit = number % 10;
			answer = answer*10 + lastDigit;
			number = number/10;
		}
		System.out.println(answer);
		s.close();
	}
}
