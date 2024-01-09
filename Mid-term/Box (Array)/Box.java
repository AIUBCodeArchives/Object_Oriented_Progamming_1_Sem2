import java.lang.*;
import java.util.*;

public class Box{
	private float length;
	private float width;
	private float height;
	
	Scanner in = new Scanner(System.in);
	
	public Box(){
		System.out.println("Empty Constructor");
		
		System.out.println("Enter length : ");
		length = in.nextFloat();
		System.out.println("Enter width : ");
		width = in.nextFloat();
		System.out.println("Enter height : ");
		height = in.nextFloat();
	}
	
	public Box(float length, float width, float height){
		this.length = length;
		this.width = width;		
		this.height = height;
		System.out.println("Parameterized Constructor");
	}
	
	public void setLength(float length){
		this.length = length;
	}
	
	public void setWidth(float width){
		this.width = width;
	}
	public void setHeight(float height){
		this.height = height;
	}
	
	public float getLength(){
		return length;
	}
	public float getWidth(){
		return width;
	}
	public float getHeight(){
		return height;
	}
	
	public void display(){
		System.out.println("Length : "+getLength()+"\nWidth : "+getWidth()+"\nHeight : "+getHeight());
	}
	
}