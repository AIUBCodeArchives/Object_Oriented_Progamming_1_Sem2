import java.lang.*;
import java.util.*;

public class Start{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("					-----Welcome to your login page-----");
		System.out.print("		Enter your UserName : ");
		String name = sc.next();
		System.out.println();
		System.out.print("		Enter your Email    : ");
		String email = sc.next();
		System.out.println();
		System.out.print("		Enter your Password : ");
		int pass = sc.nextInt();
		
		Userinput rakin = new Userinput(name, email, pass);
		rakin.check();
		
		//System.out.println("		Displayed details : ");
		//rakin.display();
	}
}