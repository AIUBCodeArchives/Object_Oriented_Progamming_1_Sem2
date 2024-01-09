import java.lang.*;
import java.util.*;

public class Start
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		BaseClass b[] = new BaseClass[4];
		
		ChildClass c1 = new ChildClass("Sami", 22, 5000, 101);
		ChildClass c3 = new ChildClass("Avoy", 22, 3000, 102);
		
		ChildClass c[] = new ChildClass[2];
		
		b[0] = c1;
		b[1] = c3;
		
		for(int i = 0; i<4; i++)
		{
			if(b[i] != null)
			{
				System.out.println("Child class is filled.");
			}
			else
			{
				for(int j = 0; j<2 ; j++)
				{
				c[j] = new ChildClass();
				b[i] = c[j];
				}
				}
		}
		
		for(int i = 0; i<4; i++)
		{
			b[i].showDetails();
		}
		
		
	}
}