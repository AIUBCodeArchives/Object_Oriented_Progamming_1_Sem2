import java.lang.*;

public class Person{
	protected String name;
	protected int age;
	 
	public Person(){
		System.out.println("parent empty cons");
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("parent para cons");
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	
	public void display(){
		System.out.println("Name : "+getName()+"\nAge : "+getAge());
	}
}