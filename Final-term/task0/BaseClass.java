import java.lang.*;
import java.util.*;

public class BaseClass
{
	Scanner in = new Scanner(System.in);
	
	protected String name;
	protected int age;
	protected double salary;
	
	public BaseClass()
	{
		System.out.print("Enter name : ");
		name = in.next();
		System.out.print("Enter age : ");
		age = in.nextInt();
		System.out.print("Enter salary : ");
		salary = in.nextDouble();
		
	}
	
	public BaseClass(String name, int age, double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}	
	public double getSalary()
	{
		return salary;
	}
	
	public void showDetails()
	{
		System.out.println("Name : "+name+"\nAge : "+age+"\nSalary : "+salary);
	}
}