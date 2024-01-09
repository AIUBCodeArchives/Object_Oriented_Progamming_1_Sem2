import java.lang.*;

public class Teacher extends Person{
	private double sal;
	
	public Teacher(){
		System.out.println("Teacher empty cons");
	} 
	public Teacher(String name, int age, double sal){
		super(name, age);
		this.sal = sal;
		System.out.println("Teacher para cons");
	}
	
	public void setSal(double sal){
		this.sal = sal;
	}
	public double getSal(){
		return sal;
	}
	
	public void display(){
		super.display();
		System.out.println("Salary : "+sal);
	}
}