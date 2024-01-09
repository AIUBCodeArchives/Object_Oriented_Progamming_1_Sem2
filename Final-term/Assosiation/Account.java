import java.lang.*;
import java.util.*;

public class Account
{
	Scanner in = new Scanner(System.in);
	
	private int accnb;
	private String acctype;
	private double balance;
	
	public Account()
	{
		
	}
	
	public Account(int accnb, String acctype, double balance)
	{
		this.accnb = accnb;
		this.acctype = acctype;
		this.balance = balance;
		System.out.println("Account para cons");
	}
	
	public void setaccnb(int accnb)
	{
		this.accnb = accnb;
	}
	public void setacctype(String acctype)
	{
		this.acctype = acctype;
	}	
	public void setbalance(double balance)
	{
		this.balance = balance;
	}

	public int getaccnb()
	{
		return accnb;
	}
	public String getacctype()
	{
		return acctype;
	}	
	public double getbalance()
	{
		return balance;
	}
	
	public void showDetails()
	{
		System.out.println("Account number : "+accnb+"\nAccount type : "+acctype+"\nBalance : "+balance);
	}
}