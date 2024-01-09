import java.lang.*;
import java.util.*;

public class Saving extends Account
{
	private double interest;
	
	Saving()
	{
		System.out.println("Saving para cons");
	}
	Saving(int accnb, double balance, double interest)
	{
		super(accnb, balance);
		this.interest = interest;
	}
	
	public void setinterest(double interest)
	{
		this.interest = interest;
	}
	public double getinterest()
	{
		return interest;
	}
	
	public void details()
	{
		super.details();
		System.out.println("interest : "+interest);
	}
}