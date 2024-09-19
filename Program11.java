package classProgram;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		sum(n);
	}
	public static void sum(int n) {
	    int sum=0;
		while(n>0) {
			int rem = n%10;
			sum+=rem;
		n=n/10;	
		}
	System.out.println("The sum of number is : "+sum);	
  }
}
