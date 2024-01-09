import java.lang.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Box b = new Box(34.4F, 45.6F, 56.4F);
		Box b1 = new Box(655.73F, 772.56F,898.98F);
		
		System.out.println("How many boxes do you want?(not less than 3)");
		int size = sc.nextInt();
		Box boxes[] = new Box[size];
		
		System.out.println("\n");
		
		boxes[1] = b; 
		boxes[3] = b1;
		
		
		for(int i = 0; i<boxes.length; i++){
			if(boxes[i] == null){
				System.out.println("Box No."+(i+1)+" is empty,");
				boxes[i] = new Box();
			}
			else{
				System.out.println("Box No."+(i+1)+" is filled.");
			}
			System.out.println();
		}
		
		System.out.println("Displayed Output : ");
		for(int i = 0; i<boxes.length; i++){
			System.out.println("Details of Box No."+(i+1)+" : ");
			boxes[i].display();
			System.out.println();
		}
	}
}