package classProgram;

import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		getSum(n);

	}
	public static void getSum(int n) {
		int i=1;
		int sum = 0;
				while(i<=n/2) {
					if(n%i==0) {
					  sum+=i;
					}
					
				i++;
		}
		if(sum==n)
			System.out.println("It is a perfect number");
		else
			System.out.println("It is not a perfect number");
	}

}
