package classProgram;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter number : ");
	       int n = sc.nextInt();
	       getEven(n);

	}
	public static void getEven(int n) {
		while(n>0) {
			int rem = n%10;
			if( rem%2==0)
			     System.out.println(rem);	
		n=n/10;	   
		}   
	}

}
