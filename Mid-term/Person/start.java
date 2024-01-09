import java.lang.*;
import java.util.*;

public class start{
	public static void main(String args[]){
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your name : ");
		String  n = obj.next();
		
		System.out.println("Enter your age : ");
		int a = obj.nextInt();
		
		System.out.println("Enter your address : ");
		String  ad = obj.next();
		
		person p1 = new person(n, a, ad);
		p1.display();
		
		person p2 = new person();
		
		System.out.println("Enter your name : ");
		p2.setName(obj.next());
		
		System.out.println("Enter your age : ");
		p2.setAge(obj.nextInt());
		
		System.out.println("Enter your address : ");
		p2.setAddress(obj.next());
		
		p2.display();
		
	}
	
}