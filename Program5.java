package classProgram;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int big=getBig(n);
		int small=getSmall(n);
		int diff = big-small;
		System.out.println("The biggest number is : "+big);
		System.out.println("The smallest number is : "+small);
		System.out.println("The difference of biggest and smallest is : "+diff);

	}
	public static int getBig(int n)
	 {
		int big=n%10;
		
		while(n>0) {
			int rem = n%10;
			if(rem>big) {
				big=rem;
			}
		n=n/10;
		}
		return big;
	}
	
	public static int getSmall(int n) {
    int small=n%10;
	while(n>0) {
		int rem = n%10;
		if(rem<small)
		 {
			small=rem;
		}
	n=n/10;
	}
	return small;
}
	
}
