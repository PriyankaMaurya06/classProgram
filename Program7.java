package classProgram;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getCountOfOdd(n);
	}
	
	public static void getCountOfOdd(int n) {
		int count = 0;
		while(n>0) {
			int rem = n%10;
		    if(rem%2!=0) {
				System.out.print(rem+"  ");
				count++;
			}
			n=n/10;
		}
		System.out.println("\nThe number of odd digits are : "+count);
	}

}
