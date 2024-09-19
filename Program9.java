package classProgram;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getCount(n);

	}
	public static void getCount(int n) {
		int count = 0;
		while(n>0) {
			int rem =n%10;
			if(rem==0) {
				count++;
			}
			n=n/10;
		}
	System.out.println("The numbers of 0's are : "+count);
	}
}
