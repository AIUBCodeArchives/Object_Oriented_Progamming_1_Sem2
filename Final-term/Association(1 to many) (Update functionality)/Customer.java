import java.lang.*;
import java.util.*;

public class Customer
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
		acc=new Account[size];
	}
	
	public void setname(String name)
	{
		this.name=name;
	}

	public String getname()
	{
		return name;
	}
	
	//Insert
	public void insertacc(Account a)
	{
		int flag=0;
		for(int i=0;i<acc.length;i++)
		{
		
		if(acc[i]==null)
			{
				acc[i]=a;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Inserted");
		}
		else
		{
			System.out.println("Not Inserted");
		}
		
	}
	
	//Delete
	public void deleteacc(Account a)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i]==a)
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
	public void updateacc(Account a)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i] == a)
			{
				System.out.println("Enter account number : ");
				acc[i].setaccnb(in.nextInt());
				System.out.println("Enter account balance : ");
				acc[i].setbalance(in.nextDouble());
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Account updated.");
		}
		else
		{
			System.out.println("Acoount not updated");
		}
		
	}
	
	public void withdrawacc(int id, double ammount)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i].getaccnb() == id)
			{
				if(ammount <= acc[i].getbalance())
				{
					acc[i].setbalance(acc[i].getbalance()-ammount);
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
			System.out.println("Ammount withdrawed.");
		}
		else
		{
			System.out.println("Ammount not withdrawed");
		}
	}
	
	public void depositacc(int id, double ammount)
	{
		int flag = 0;
		for(int i = 0; i<acc.length; i++)
		{
			if(acc[i].getaccnb() == id)
			{
				acc[i].setbalance(acc[i].getbalance()+ammount);
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Ammount deposited.");
		}
		else
		{
			System.out.println("Ammount not deposited");
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
			else
			{
				System.out.println("It's NULL");
			}
		}
	}
}