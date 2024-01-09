import java.lang.*;
import java.util.*;

public class Tiger extends Animal{
	private String color;
	private String breed;
	
	public Tiger(){
		System.out.println("Tiger empty constructor");
	} 
	public Tiger(String name, String species, String color, String breed){
		super(name, species);
		this.color = color;
		this.breed = breed;
		System.out.println("Tiger parameterized constructor");
	}
	
	//setters
	public void setColor(String color){
		this.color = color;
	}
	public void setBreed(String breed){
		this.breed = breed;
	}
	
	//getters
	public String getColor(){
		return color;
	}
	public String getBreed(){
		return breed;
	}
	
	public void display(){
		super.display();
		System.out.println("Color : "+ getColor());
		System.out.println("Breed/Type : "+ getBreed());
	}
}