package classProgram;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		getReverse(n);

	}
	public static void getReverse(int n) {
		int n1=n;
		int a = 0;
		while(n>0) {
			int rem=n%10;
			 a=a*10+rem;
		n=n/10;
		}
		if(a==n1)
		     System.out.println("Yes, it is a pallindrome");
		else
			 System.out.println("No, it is not a pallindrome");
	}
}
