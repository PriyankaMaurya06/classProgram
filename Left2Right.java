package classProgram;
import java.util.Scanner;

public class Left2Right {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		countDigit(n);
		printDigit(n);

	}
	
	public static void printDigit(int n) {
		int count=countDigit(n);
		while(count>0) {
			int digit= (n/(int)Math.pow(10,count-1))%10;
			System.out.print(digit+" ");
		count--;
		}
	}
	
	
	public static int countDigit(int n) {
		int count=0;

		while(n>0) {
			count++;
		n=n/10;
		}
		return count;
  }
}
