package classProgram;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getBig(n);
	}

	public static void getBig(int n) {
		int big=n%10;
		while(n>0) {
			int rem = n%10;
			if(rem>big) {
				big=rem;
			}
		n=n/10;
		}
	 System.out.println("The biggest number is : "+big);
	
	}
	
}
