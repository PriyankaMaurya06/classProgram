package classProgram;
import java.util.Scanner;

public class doWhile1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char p;
		do {	
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("The factorial of "+n+"! is = "+getFact(n));
		System.out.println("Press Y/y to contiune or press any key to ends !! : ");
		 p = sc.next().charAt(0);
		}while(p=='Y' || p=='y');
		System.out.println("==========Program ends !! ============");
	}
	
	public static int getFact(int n) {
		int fact=1;
		int i = 1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
	return fact;
	}

}
