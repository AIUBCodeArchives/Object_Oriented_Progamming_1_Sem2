import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Car a1 = new Car("Audi A8", 1000000 );
		Customer c1 = new Customer("Sakib",1000000,a1);
		
		c1.showDetails();
	}
}