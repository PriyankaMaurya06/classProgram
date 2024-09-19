package classProgram;

import java.util.Scanner;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int m = sc.nextInt();
		System.out.println("Enter the ending number : ");
		int n = sc.nextInt();
		int count=0;
		for(int i=m ; i<=n ; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			   count++;		
			}
		}
		System.out.println("\nTotal such numbers are :"+count);
	}
	
	
  public static boolean isPrime(int n) 
  {
	  if(n<2)
		   return false;
	  for(int i=2 ; i<=Math.sqrt(n) ; i++)
	  {
		  if(n%i==0)
			   return false;
	  }
	return true;
  }
}
