 package classProgram;

import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		getSumFact(n);

	}
	public static void getSumFact(int n) {
		        int sum=0;
				int i=1;
				while(i<=n/2) {
					
					if(n%i==0) {
						System.out.print(i);
					  sum+=i;
					}
					
				i++;
				}
		
		System.out.println("The sum of all the factors of the number : "+sum);
	}
}
	