import java.lang.*;
import java.util.*;

public class Login{
	protected String userName;
	protected String email;
	
	Login(){
		
	}
	
	Login(String userName, String email){
		this.userName = userName;
		this.email = email;
	}
	//setters
	public void setName(String userName){
		this.userName = userName;
	}
	public void setEmail(String email){
		this.email = email;
	}
	//getters
	public String getName(){
		return userName;
	}
	public String getEmail(){
		return email;
	}
	
	public void display(){
		System.out.println("\n		Name of the user : "+getName());
		System.out.println("\n		Email of the user : "+getEmail());
	}
}