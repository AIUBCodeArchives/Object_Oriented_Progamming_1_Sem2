import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1 = new Account(111, "Saving", 5000000);
		Customer c1 = new Customer("Sakib", a1);
		
		c1.showDetails();
	}
}