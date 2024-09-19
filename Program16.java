package classProgram;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getFactorial(n);
	}
 public static void getFactorial(int n) {
	 while(n>0) {
		 int rem = n%10;
		 int i = 1;
		 int fact = 1;
		 while(i<=rem) {
			 fact=fact*i;
		  i++;
		 }
		 System.out.println(rem+"! = "+fact);
	 n=n/10;
	 }
  }
}
