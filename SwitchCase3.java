package classProgram;

import java.util.Scanner;

public class SwitchCase3 {
	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
          char a;
          
	do {
	
		System.out.println("Press 1==> to find Factorial");
		System.out.println("Press 2==> to find Power");
		System.out.println("Press 3==> to reverse a number");
		System.out.println("Press 4==> to check Pallindrome");
		System.out.println("Press 5==> to check Prime");
		int choice= sc.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("You have selected Factorial");
			
			System.out.println("Enter the number");
			int n1 = sc.nextInt();
			long fact=1;
			for(int i=1; i<=n1 ; i++ )
			{
				fact=fact*i;
			}
			System.out.println(n1+"! = "+fact);
			break;
		case 2 :
			System.out.println("You have selected Power");
			System.out.println("Enter the base number");
			int b = sc.nextInt();
			System.out.println("Enter the exponent number");
			int x = sc.nextInt();
			System.out.println(b+" raise to the power "+x+" is "+power(b,x));
			break;
		case 3 :
			System.out.println("You have selected Reverse");
			System.out.println("Enter the number");
			int rev = sc.nextInt();
			int r=reverse(rev);
			System.out.println("The reverse of the number is :"+r);
			break;
		case 4 :
			System.out.println("You have selected pallindrome");
			System.out.println("Enter the number");
			int p = sc.nextInt();
			int rv =reverse(p);
			if(p==rv)
				System.out.println("The number is pallindrome");
			else
				System.out.println("The number is not a pallindrome");
			break;
		case 5:
			System.out.println("You have selected Prime");
			System.out.println("Enter the number");
			int pr = sc.nextInt();
			if(getPrime(pr))
			      System.out.println(pr+" is a Prime Number.");
			else
				System.out.println(pr+" is not a Prime Number.");
			break;
		default:
			System.out.println("This is not a valid choice");
		}
		
	System.out.println("press Y/y to continue else press any other key : ");
	a =sc.next().charAt(0);
		}while(a=='Y' || a=='y');
		     System.out.println("!!!!!!!!!!Thank you!!!!!!!!!!!!");
	
		}
	
		 public static int power(int b , int x)
		 {
			 int pow=1;
			 for(int i=0 ; i<x ;i++ )
			 {
				  pow =pow*b;
			 }
			 return pow;
			 
		 }
		 
		 public static int reverse(int n)
		 {
			 int rev = 0;
			 while(n>0)
			 {
				 int rem = n%10;
				 rev = rev*10+rem;
			  n=n/10;
				 
			 }
			 return rev;
		 }
		 
		 public static boolean getPrime(int n)
		 {
			 int i=2;
			 while(i<Math.sqrt(n)) 
			 {
					if(n%i==0) 
						 return false;
					
				i++;
		     }
		 return true;
		 }
	
} 

