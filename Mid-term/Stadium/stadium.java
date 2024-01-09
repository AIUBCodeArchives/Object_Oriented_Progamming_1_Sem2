import java.lang.*;
import java.util.*;

public class stadium{
	private String stadium_name;
	private String stadium_id;
	private int capaciy;
	
	public stadium(){
		System.out.println("Empty Constructor");
	}
	
	public stadium(String stadium_name, String stadium_id, int capaciy){
		this.stadium_name = stadium_name;
		this.stadium_id = stadium_id;
		this.capaciy = capaciy;
		
		System.out.println("Parameterized Constructor");
	}
	
	//setters
	public void setstadium_name(String stadium_name){
		this.stadium_name = stadium_name;
	}
	public void setstadium_id(String stadium_id){
		this.stadium_id = stadium_id;
	}
	public void setCapacity(int capaciy){
		this.capaciy = capaciy;
	}
	
	//getters
	public String getstadium_Name(){
		return stadium_name;
	}
	public String getstadium_id(){
		return stadium_id;
	}
	public int getCapacity(){
		return capaciy;
	}
	
	public void display(){
		System.out.println("Name : "+stadium_name);
		System.out.println(stadium_name+" ID : "+stadium_id);
		System.out.println("Capaciy : "+capaciy);
	}
	
}