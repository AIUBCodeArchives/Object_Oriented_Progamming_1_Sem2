import java.lang.*;
import java.util.*;

public class main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		stadium s1 = new stadium();
		
		System.out.println("Enter your name : ");
		s1.setstadium_name(sc.next());
		
		System.out.println("Enter your ID : ");
		s1.setstadium_id(sc.next());
		
		System.out.println("Enter stadium capacity : ");
		s1.setCapacity(sc.nextInt());
		
		s1.display();
		
		System.out.println("Enter your name 2 : ");
		String n = sc.next();
		
		System.out.println("Enter your ID 2 : ");
		String id = sc.next();
		
		System.out.println("Enter stadium capacity 2 : ");
		int Cap = sc.nextInt();
		
		stadium s2 = new stadium(n, id, Cap);
		
		s2.display();
		
	}
}