package classProgram;

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getStrongNumber(n);
		

	}
	public static void getStrongNumber(int n) {
		int sum=0;
		int a=n;
		 while(n>0) {
			 int rem = n%10;
			 int i = 1; 
			 int fact = 1;
			 while(i<=rem) {
				 fact=fact*i;
			  i++; 
			 }
			 System.out.println(rem+"! = "+fact);
			  sum = sum+fact;
		 n=n/10;
		 }
		 
		 if(a==sum) 
			 System.out.println("The number is a strong number");
		 else
			 System.out.println("The number is not a strong number");
	  }

}
