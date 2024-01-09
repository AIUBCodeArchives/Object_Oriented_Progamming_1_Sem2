import java.lang.*;
import java.util.*;

public class Customer implements Icustomer
{
	Scanner in = new Scanner(System.in);
	private String name;
	private Account acc[];
	
	public Customer()
	{
		System.out.println("Empty for Customer");
	}
	
	public Customer(String name,int size)
	{
		this.name=name;
		acc = new Account[size];
	}
	public void setsize(int size)
	{
		acc = new Account[size];
	}
	
	
	public void setname(String name)
	{
		this.name = name;
	}

	public String getname()
	{
		return name;
	}
	
	//Insert
	public void insertacc(Account a)
	{
		int flag = 0;
		for(int i = 0;i<acc.length;i++)
		{
			if(acc[i] == null)
			{
				acc[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account Inserted");
		}
		else
		{
			System.out.println("Account not Inserted");
		}
		
	}
	
	//Delete
	public void deleteacc(int id)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i].getaccnb() == id)
			{
				acc[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account deleted.");
		}
		else
		{
			System.out.println("Acoount not deleted");
		}
	}
	
	//Update
	public void updateacc(int id)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i].getaccnb() == id)
			{
				System.out.print("Enter new account number : ");
				acc[i].setaccnb(in.nextInt());
				System.out.print("Enter new account balance : ");
				acc[i].setbalance(in.nextDouble());
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account info updated.");
		}
		else
		{
			System.out.println("Acoount info not updated");
		}
		
	}
	
	public void withdrawacc(int id, double amount)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i].getaccnb() == id)
			{
				if(amount <= acc[i].getbalance())
				{
					acc[i].setbalance(acc[i].getbalance()-amount);
					flag = 1;
					break;
				}
				else
				{
					System.out.println("Not enough money to withdraw");
				}
			}
		}
		if(flag == 1)
		{
			System.out.println("Amount withdrawed.");
		}
		else
		{
			System.out.println("Amount not withdrawed");
		}
	}
	
	public void depositacc(int id, double amount)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i].getaccnb() == id)
			{
				acc[i].setbalance(acc[i].getbalance()+amount);
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Amount deposited.");
		}
		else
		{
			System.out.println("Amount not deposited");
		}
	}
	
	public void details()
	{
		System.out.println("Account holder name: "+name);
		for(int i=0;i<acc.length;i++)
		{
			if(acc[i]!=null)
			{
				acc[i].details();
			}
		}
	}
}