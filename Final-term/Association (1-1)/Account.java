import java.lang.*;

public class Account{
	
	private int accnb;
	private String acctype;
	private double balance;
	
	public Account()
	{
		System.out.println("Account Empty Cons.");
	}
	
	public Account(int accnb,String acctype,double balance)
	{
		this.accnb=accnb;
		this.acctype=acctype;
		this.balance=balance;
		System.out.println("Account para cons.");
	}
	
	public void setaccnb(int accnb)
	{
		this.accnb=accnb;
	}
	
	public void setacctype(String acctype)
	{
		this.acctype=acctype;
	}
	
	public void setbalance(double balance)
	{
		this.balance=balance;
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
	
	public void details()
	{
		System.out.println("Account Nb: "+accnb+"\n"+"Account type: "+acctype+"\n"+"Balance: "+balance);
	}
}