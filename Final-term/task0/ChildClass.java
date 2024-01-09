import java.lang.*;
import java.util.*;

public class ChildClass extends BaseClass
{
	Scanner in = new Scanner(System.in);
	
	private int passcode;
	
	public ChildClass()
	{
		super();
		System.out.print("Enter passcode : ");
		passcode = in.nextInt();
	}
	
	public ChildClass(String name, int age, double salary, int passcode)
	{
		super(name, age, salary);
		this.passcode = passcode;
	}
	
	public void setPass(int passcode)
	{
		this.passcode = passcode;
	}
	public int getPass(){
		return passcode;
	}
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Passcode : "+passcode);
	}
}