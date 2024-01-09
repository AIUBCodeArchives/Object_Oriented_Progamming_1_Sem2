import java.lang.*;
import java.util.*;

public class Start
{	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// Account a1 = new Fixed(101, 100000, 7); //didn't use default
		// Account a2 = new Saving(102, 500000, 0.7); 
		
		// Customer c = new Customer("Rakin",3); 
		
		// c.insertacc(a1);
		// c.insertacc(a2);
		
		
		System.out.println("\n\n				-->> Welcome to Bangladesh Bank <<--\n");
		System.out.println("		-->> Created By Rakin(23-50071-1), Founder and CEO of BD Bank <<--\n\n");
		System.out.print("Enter your name to proceed : ");
		String name = in.next();
		System.out.print("How many account do you need : ");
		int acccnt = in.nextInt();
		
		Customer c1 = new Customer(name, acccnt);
		
		int count = 0;
		
		for(int i = 0; ; i++)
		{
			System.out.println("\n\nSelect an option to proceed :- \n");
			System.out.println("(1) Create Account\n");
			System.out.println("(2) Delete Account\n");
			System.out.println("(3) Update Account\n");
			System.out.println("(4) Withdraw Balance\n");
			System.out.println("(5) Deposit Balance\n");
			System.out.println("(6) Details of Account\n");
			System.out.println("(7) Exit program\n\n");
		
			System.out.print("Enter an option : ");
			int choice = in.nextInt();
		
			switch(choice)
			{
				case 1:
				if(count == acccnt)
				{
					System.out.println("You have reached your account creating limit which is "+acccnt+".\n");
					System.out.println("### Please choose different option or exit the program. ###");
					break;
				}
				
				System.out.println("\nWhat type of account you want to create?\n(1) Fixed account,	(2)Savings account\n");
				System.out.print("=>> ");
				choice = in.nextInt();
				if(choice == 1)
				{
					System.out.print("Enter your account No. : ");
					int id = in.nextInt();
					System.out.print("Enter your account balance : ");
					double balance = in.nextDouble();
					System.out.print("Enter your fixed year : ");
					int year = in.nextInt();
					Account f1 = new Fixed(id, balance, year);
					c1.insertacc(f1);
					System.out.println("Fixed account is created under "+name+"'s name.");
					count++;
					
				}
				else if(choice == 2)
				{
					System.out.print("Enter your account No. : ");
					int id = in.nextInt();
					System.out.print("Enter your account balance : ");
					double balance = in.nextDouble();
					System.out.print("Enter your interest rate : ");
					double inrate = in.nextDouble();
					Account s1 = new Saving(id, balance, inrate);
					c1.insertacc(s1);
					System.out.println("Saving account is created under "+name+"'s name.");
					count++;
				}
				else
				{
					System.out.println("Invalid input.");
				}
				break;
				
				case 2:
				System.out.print("Enter the account No. you want to delete : ");
				int id = in.nextInt();	
				c1.deleteacc(id);
				count--;
				break;
				
				case 3:
				System.out.print("Enter the account No. you want to update details : ");
				id = in.nextInt();	
				c1.updateacc(id);
				break;
				
				case 4:
				System.out.print("Enter the account No. you want to withdraw money from : ");
				id = in.nextInt();
				System.out.print("Enter the amount you want to withdraw : ");
				double amount = in.nextDouble();	
				c1.withdrawacc(id, amount);
				break;
				
				case 5:
				System.out.print("Enter the account No. you want to deposit money : ");
				id = in.nextInt();
				System.out.print("Enter the amount you want to deposit : ");
				amount = in.nextDouble();	
				c1.depositacc(id, amount);
				break;
				
				case 6:
				c1.details();
				break;
				
				default:
				if(choice != 7)
				{
					System.out.println("Invalid input.");
				}
			}
			
			if(choice == 7)
			{
				System.out.println("Thank you for using our services.");
				break;
			}
		}
	}
}