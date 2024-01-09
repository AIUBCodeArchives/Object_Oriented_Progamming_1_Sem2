import java.lang.*;
import java.util.*;

public class person{
	
	private String name;
	private int age;
	private String address;
	
	person(){
		System.out.println("Empty Constructor created");
	}
	person(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
		System.out.println("Parameterized Constructor created");
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	public String getAddress(){
		return address;
	}
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
	}
	
	
}