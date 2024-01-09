import java.lang.*;
import java.util.*;

public class Fixed extends Account
{
	private int year;
	
	Fixed()
	{
		System.out.println("Fixed para cons");
	}
	Fixed(int accnb, double balance, int year)
	{
		super(accnb, balance);
		this.year = year;
	}
	
	public void setyear(int year)
	{
		this.year = year;
	}
	public int getyear()
	{
		return year;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Year : "+year);
	}
}