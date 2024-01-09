import java.lang.*;

public class Animal{
	protected String name;
	protected String species;
	
	public Animal(){
		System.out.println("Parent empty constructor");
	}
	
	public Animal(String name, String species){
		this.name = name;
		this.species = species;
		System.out.println("Parent parameterized constructor");
	}
	
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setSpecies(String species){
		this.species = species;
	}
	
	//getters
	public String getName(){
		return name;
	}
	public String getSpecies(){
		return species;
	}
	
	public void display(){
		System.out.println("Name : "+getName()+"\nspecies : "+getSpecies());
	}
}