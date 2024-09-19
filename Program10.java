package classProgram;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		getNum(n);

	}
	
	public static void getNum(int n) {
		
		
		int sum=0;
	while(n>0) 
	{
		 int rem=n%10;
		 sum=sum*10+rem;
		
		    
		n=n/10;	
		
	}
		 System.out.println("right to left : "+sum);
    int sum1=0;
	while(sum>0)
	{
		int rem1=sum%10;
		sum1=sum1*10+rem1;
		
		sum=sum/10;
		
	}
	System.out.println("left to right : "+sum1);
		 
	}
	
	}
	
	


