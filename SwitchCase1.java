package classProgram;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		System.out.println("Enter the Operation : ");
		char operation=sc.next().charAt(0);
		switch(operation)
		{
		case '+' :
			System.out.println(a+"+"+b+"= "+(a+b));
			break;
		case '-' :
			System.out.println(a+"-"+b+"= "+(a-b));
			break;
		case '*' :
			System.out.println(a+"*"+b+"= "+(a*b));
			break;
		case '/' :
			System.out.println(a+"/"+b+"= "+(a/b));
			break;
		case '%' :
			System.out.println(a+"%"+b+"= "+(a%b));
			break;
		default :
			System.out.println("This is invalid operation");
		}
		System.out.println("----This program ends----");
	}

}
