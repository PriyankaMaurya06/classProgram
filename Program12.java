package classProgram;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getAvg(n);
	}

	public static void getAvg(int n) {
		double sum = 0;
		int count=0;
		while(n>0) {
			int rem=n%10;
			sum+=rem;
		count++;
		n=n/10;
		}
		double avg = sum/count;
		System.out.println("The average value of all the digits is : "+avg);
	}
}
