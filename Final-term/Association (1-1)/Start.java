import java.lang.*;

public class Start{
	
	public static void main(String[] args)
	{
		Account a1=new Account(111,"Saving",5000000);
		Customer c1=new Customer();
		c1.setname("sakib");
		c1.setacc(a1);
		c1.details();
	}
}