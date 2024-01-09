import java.lang.*;

public class student{
	
	private String name;
	private String id;
	private float cgpa;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public void setCgpa(float cgpa){
		this.cgpa = cgpa;
	}
	
	public String getName(){
		return name;
	}
	
	public String getId(){
		return id;
	}
	
	public float getCgpa(){
		return cgpa;
	}
	
	public static void main(String args[]){
		student p1 = new student();
		p1.setName("Sami");
		p1.setId("23-50102-1");
		p1.setCgpa(3.79F);
		System.out.println("Student name : "+p1.getName());
		System.out.println("Student ID   : "+p1.getId());
		System.out.println("Student CGPA : "+p1.getCgpa());
		
		
	}
}