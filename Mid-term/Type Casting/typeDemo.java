import java.lang.*;

public class typeDemo{
	public static void main(String args[]){
		int x = 71;
		float y = 123.45F;
		
		System.out.println("Before int to float--- Implicit x :"+x);
		System.out.println("Before int to float--- Implicit y :"+y);
		y = x;
		
		System.out.println();
		System.out.println("After Implicit x :"+x);
		System.out.println("After Implicit y :"+y);
		
		x = 71;
		y = 123.45F;
		
		
		x = (int)y;
		System.out.println();
		System.out.println("After explicit x :"+x);
		System.out.println("After explicit y :"+y);
		
		char a = 'r';
		float b = 123.45F;
		System.out.println("Before char to float--- Implicit a :"+a);
		System.out.println("Before char to float--- Implicit b :"+b);
		
		b = a;
		System.out.println();
		System.out.println("After Implicit a :"+a);
		System.out.println("After Implicit b :"+b);
		
		
		a = 'r';
		b = 123.45F;
		
		a = (char)b;
		System.out.println();
		System.out.println("After explicit a :"+a);
		System.out.println("After explicit b :"+b);		
	}
}