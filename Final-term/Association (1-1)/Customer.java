import java.lang.*;

public class Customer
{
	private String name;
	private Account acc;
	
	public Customer()
	{
		System.out.println("Empty for Customer");
	}
	
	public Customer(String name, Account acc)
	{
		this.name=name;
		this.acc=acc;
		System.out.println("Para for Customer");
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public void setacc(Account acc)
	{
		this.acc=acc;
	}
	
	public String getname()
	{
		return name;
	}
	
	public Account getacc()
	{
		return acc;
	}
	public void details()
	{
		System.out.println("Name: "+name);
		acc.details();
	}
}