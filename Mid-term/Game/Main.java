import java.lang.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	Game info[] = new Game[5];
	
	Cricket c1 = new Cricket();
	Cricket c2 = new Cricket("Cricket","Outdoor",50,11);
	
	Tennis t1 = new Tennis();
	Tennis t2 = new Tennis("Tennis","Outdoor",24,4);
	
	info[1] = c2;
	info[2] = t2;
	
	System.out.println("Enter information for cricket : ");
	System.out.println("Enter Game Name :");
	String a = in.next();
	System.out.println("Enter Game Type :");
	String b = in.next();
	System.out.println("Enter Score : ");
	int c = in.nextInt();
	System.out.println("Enter Players : ");
	int d = in.nextInt();
	
	Cricket c3 = new Cricket(a,b,c,d);
	info[3] = c3;
	
	System.out.println("Enter information for Tennis : ");
	System.out.println("Enter Game Name : ");
	String e = in.next();
	System.out.println("Enter Game Type : ");
	String f = in.next();
	System.out.println("Enter Score:");
	int g = in.nextInt();
	System.out.println("Enter Players:");
	int h = in.nextInt();
	
	Tennis t3 = new Tennis(e,f,g,h);
	info[4] = t3;
	
	for(int i=0; i<5; i++){
		if(info[i] != null){
			info[i].display();
		}
		else{
			System.out.println("Information slot is emnpty.");
		}
	}
}
}