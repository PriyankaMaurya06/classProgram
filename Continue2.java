package classProgram;

import java.util.Scanner;

public class Continue2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int m = sc.nextInt();
		System.out.println("Enter the ending number : ");
		int n = sc.nextInt();
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		System.out.println("Enter p : ");
		int p = sc.nextInt();
		printNumber(m,n,k,p);

	}
	public static void printNumber(int m,int n,int k,int p) {
		int count = 0;
		for(int i=m; i<=n; i++)
		{
			int j = i;
			while(j>0)
			{
				int rem = j%10;
				if(rem==k || rem==p)
					break;
				
				j=j/10;
			
				}
			
			if(j==0)
				System.out.println(i);
			count++;
		
	 }
		System.out.println("Total such numbers are : "+count);
	
	}

}


