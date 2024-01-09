import java.lang.*;
import java.util.*;

public class Start
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Account a1 = new Fixed(111,5000000,7);
		Account a2 = new Saving(222,350000,7.5);
		Account a3 = new Fixed(333,400300,5);
		
		Customer c1 = new Customer("Sakib",3);
		c1.insertacc(a1);
		c1.insertacc(a2);
		c1.insertacc(a3);
		c1.details();
		//c1.deleteacc(a2);
		
		//c1.updateacc(a1);
		System.out.print("Enter your Account id : ");
		int id = in.nextInt();
		System.out.println("what do you want to do? (1) Deposit, (2) Withdraw ");
		int checker = in.nextInt();
		if(checker == 1)
		{
		System.out.print("Enter the ammount to deposit : ");
		double ammount = in.nextInt();
		c1.depositacc(id, ammount);
		}
		else if(checker == 2)
		{
		System.out.print("Enter the ammount to withdraw : ");
		double ammount = in.nextInt();
		c1.withdrawacc(id, ammount);
		}
		else
		{
			System.out.println("Invalid input");
		}
		//c1.withdrawacc(a3);
		
		c1.details();
		
		
		
	}
}