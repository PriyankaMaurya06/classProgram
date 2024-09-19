package classProgram;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getnum(n);

	}

	public static void getnum(int n) {
		int a = n;
		double sum = 0;
		int count=0;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
			count++;
		n=n/10;	
		}
		double avg = sum/count;
		System.out.println("The Average is : "+avg);
		
		int count1=0;
		System.out.print("The number of digits which are greater than average value are :- ");
		while(a>0) {
			int rem = a%10;
			if(rem>avg) {
				System.out.print(rem+" , ");
				count1++;
			}
		a=a/10;	
		}
		System.out.println("\nThe number of digit are : "+count1);
	}

}
