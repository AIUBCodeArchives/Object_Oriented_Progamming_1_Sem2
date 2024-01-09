import java.lang.*;

public class Student extends Person{
	private int id;
	
	public Student(){
		System.out.println("student empty cons");
	}
	
	public Student(String name, int age, int id){
		super(name, age);
		this.id = id;
		System.out.println("student para cons");
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public void display(){
		super.display();
		System.out.println("ID : "+id);
	}
}