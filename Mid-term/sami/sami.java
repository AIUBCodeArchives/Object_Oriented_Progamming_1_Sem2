import java.lang.*;

public class sami{
	private String name;
	private static String id;
	private float cgpa;
	private double totalNumber;
	private int points;
	
	sami(){
		System.out.println("Empty constructor created");
	}
	
	sami(String name, String id, float cgpa, double totalNumber, int points){
		this.name = name;
		this.id = id;
		this.cgpa = cgpa;
		this.totalNumber = totalNumber;
		this.points = points;
		
		System.out.println("Parameterized constructor created");
	}
	
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setCgpa(float cgpa){
		this.cgpa = cgpa;
	}
	public void setTotalnumber(double totalNumber){
		this.totalNumber = totalNumber;
	}
	public void setPoints(int points){
		this.points = points;
	}
	
	//getter
	public String getName(){
		return name;
	}
	public String getId(){
		return id;
	}
	public float getCgpa(){
		return cgpa;
	}
	public double getTotalNumber(){
		return totalNumber;
	}
	public int getPoints(){
		return points;
	}
	
	public void display(){
		System.out.println("Name is : "+name);
		System.out.println("ID is : "+id);
		System.out.println("CGPA is : "+cgpa);
		System.out.println("Total number is : "+totalNumber);
		System.out.println("points is : "+points);
	}
	
	
	
	
}