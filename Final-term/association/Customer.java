import java.lang.*;

public class Customer
{
	private String name;
	private int budget;
	private Car audi;
	
	public Customer()
	{
		System.out.println("Empty for customer");
	}
	
	public Customer(String name, int budget, Car audi)
	{
		this.name = name;
		this.budget = budget;
		this.audi = audi;
		System.out.println("Para for customer");
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBudget(int budget)
	{
		this.budget = budget;
	}
	public void setCar(Car audi)
	{
		this.audi = audi;
	}
	
	public String getName()
	{
		return name;
	}
	public int getBudget()
	{
		return budget;
	}
	public Car getCar()
	{
		return audi;
	}
		
	public void showDetails()
	{
			System.out.println("Name : "+name+"\nBudget : "+budget);
			audi.details();
	}
	
	
}