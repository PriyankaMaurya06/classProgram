package classProgram;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		getSum(n);

	}

	public static void getSum(int n) {
    	int sum = 0;
    	System.out.println("The Squares of each digit :-");
	while(n>0) {
		int rem = n%10;
	    sum+=rem*rem;
	    		System.out.println(rem+" => "+rem*rem);
	n=n/10;
	}
	System.out.println("The sum of all odd digits of the number is  "+sum);
   }
}
