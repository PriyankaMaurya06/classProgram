package classProgram;
import java.util.Scanner;																																																									

public class ATM_Machine {
	
	static double bal=1000;
	
	public static void main(String[] args) {
		System.out.println("------------Welcome To The ATM--------------");
		System.out.println("\n");
		Account();
		
		 System.out.println("------------Thanks To Visit--------------");

          
          }
	

	public static void Account()
	{
		Scanner sc = new Scanner(System.in);
		int b;
		System.out.println("press 1 ==> To know your Balance");
        System.out.println("press 2 ==> To Deposit");
        System.out.println("press 3 ==> To Withdraw");
        System.out.println("press 4 ==> To go back to The Main Menu");
        System.out.println("press 5 ==> To Exit");
        int n = sc.nextInt();
        switch(n)
        {
        case 1: 
      	  
      	  System.out.println("Your Balance is Rs. "+bal);
	      System.out.println("press 1 ==> To go back to The Main Menu");
	       System.out.println("press 2 ==> To Exit");
	       int a = sc.nextInt();
           if(a==2)
         	  break;
           else if(a==1)
           	   Account();
           else 
        	   break;
         break;
        case 2 : 
      	  System.out.println("Enter the money to deposite : ");
      	  double amt=sc.nextDouble();
      	   bal=bal+amt;
      	  System.out.println("Your updated amount is Rs."+bal);
      	  System.out.println("press 1 ==> To go back to The Main Menu");
            System.out.println("press 2 ==> To Exit");
            b = sc.nextInt();
            if(b==2)
          	  break;
            else if(b==1)
            	Account();
            else
            	System.out.println("Invalid Choice");
            	break;
    	
        case 3 : 
    		  System.out.println("Current balance is Rs. "+bal);
        	  System.out.println("Enter the money to Withdraw : ");
        	
          	  double amtt=sc.nextDouble();
          	  if(amtt>bal)
          	  {
          		 System.out.println("Insufficient Balance");
          		 break;
          	  }
          	     
          	  else
          	  {
          	   bal=bal-amtt;
          	  System.out.println("Your amount after Withdraw is Rs. "+bal);
          	  }
          	  System.out.println("press 1 ==> To go back to The Main Menu");
              System.out.println("press 2 ==> To Exit");
                 int c=sc.nextInt();
                 if(c==1)
                	 Account();
                 else if(c==2) 
                	  break;
                 else
                	 System.out.println("Invalid Choice");
                	 break;
                   
        case 4:
        	Account();
        	break;
        case 5:
        	  break;
        default:
        	System.out.println("Invalid choice");
            	 
	}
       
       
	}


}
