package classProgram;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		char a = sc.next().charAt(0);
		switch(a)
		{
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println("This is a vowel character");
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println("This is a numeric character");
			break;
		
		default:
			System.out.println("This is invalid character");

	}
		System.out.println("------Program ends---------");
	}
}
