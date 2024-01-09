import java.lang.*;
import java.util.*;

public class Bear extends Animal{
	private String color;
	private String breed;
	
	public Bear(){
		System.out.println("Bear empty constructor");
	} 
	public Bear(String name, String strength, String color, String breed){
		super(name, strength);
		this.color = color;
		this.breed = breed;
		System.out.println("Bear para constructor");
	}
	
	//setters
	public void setColor(String color){
		this.color = color;
	}
	public void setbreed(String breed){
		this.breed = breed;
	}
	
	//getters
	public String getColor(){
		return color;
	}
	public String getbreed(){
		return breed;
	}
	
	public void display(){
		super.display();
		System.out.println("Color : "+getColor()+"\nBreed/Type : "+getbreed());
	}
}