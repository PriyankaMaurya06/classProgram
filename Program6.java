package classProgram;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		countDigits(n);
	}
   public static void countDigits(int n) {
	   int count = 0;
	   while(n>0) {
		   int rem = n%10;
		   count++;
		   n=n/10;
	   }
	   System.out.println("the number of digits are : "+count);
   }
}
