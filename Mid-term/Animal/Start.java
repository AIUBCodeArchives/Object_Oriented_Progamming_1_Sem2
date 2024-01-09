import java.lang.*;
import java.util.*;

public class Start{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details for Tiger : \n");
		
		Tiger t1 = new Tiger();
		System.out.print("Enter name : ");
		t1.setName(sc.next());
		System.out.print("Enter species : ");
		t1.setSpecies(sc.next());
		System.out.print("Enter color : ");
		t1.setColor(sc.next());
		System.out.print("Enter breed/type : ");
		t1.setBreed(sc.next());
		t1.display();
		
		System.out.print("\n\n");
		
		System.out.println("Enter details for Bear : \n");
		
		Bear b1 = new Bear();
		System.out.print("Enter name : ");
		b1.setName(sc.next());
		System.out.print("Enter species : ");
		b1.setSpecies(sc.next());
		System.out.print("Enter color : ");
		b1.setColor(sc.next());
		System.out.print("Enter breed/type : ");
		b1.setbreed(sc.next());
		b1.display();
		
		System.out.print("\n\n");
		
		System.out.println("Enter another set of details for Tiger -");
		String n1, s1, c1, l1;
		System.out.print("Enter name : ");
		n1 = sc.next();
		System.out.print("Enter species : ");
		s1 = sc.next();
		System.out.print("Enter color : ");
		c1 = sc.next();
		System.out.print("Enter breed/type : ");
		l1 = sc.next();
		Tiger t2 = new Tiger(n1, s1, c1, l1);
		t2.display();
		
		System.out.print("\n\n");
		
		System.out.println("Enter another set of details for Bear -");
		String n2, s2, c2, l2;
		System.out.print("Enter name : ");
		n2 = sc.next();
		System.out.print("Enter species : ");
		s2 = sc.next();
		System.out.print("Enter color : ");
		c2 = sc.next();
		System.out.print("Enter breed/type : ");
		l2 = sc.next();
		Bear b2 = new Bear(n2, s2, c2, l2);
		b2.display();

	}
}