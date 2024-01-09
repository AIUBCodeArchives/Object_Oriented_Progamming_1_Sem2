import java.lang.*;

public class Car
{
	private String model;
	private int price;
	
	Car()
	{
		System.out.println("Empty for car.");
	}
	
	Car(String model, int price)
	{
		this.model = model;
		this.price = price;
	}
	
	public void setModel(String model)
	{
		this.model = model;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public String getModel()
	{
		return model;
	}
	public int getPrice()
	{
		return price;
	}
	
	public void details()
	{
		System.out.println("Model : "+model+"\nPrice : "+price);
	}
}