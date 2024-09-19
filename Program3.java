package classProgram;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter number : ");
			int n = sc.nextInt();
			getNum(n);
		}
		
	public static void getNum(int n) {
		while(n>0) {
			int rem = n%10;
			if(rem<5) {
				System.out.println(rem);
			}
		n=n/10;
		}

	}

}
