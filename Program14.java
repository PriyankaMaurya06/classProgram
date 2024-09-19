package classProgram;
import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		getSum(n);

	}
    public static void getSum(int n) {
    	int sum = 0;
	while(n>0) {
		int rem = n%10;
		if(rem%2==1) {
			sum+=rem;
		}
	
		n=n/10;
	}
	System.out.println("The sum of all odd digits of the number is  "+sum);
   }
}
