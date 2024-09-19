package classProgram;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getFactorialSum(n);

	}
	public static void getFactorialSum(int n) {
		int sum=0;
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
		 System.out.println("Total Factorial sum is : "+sum); 
	  }
}
