import java.lang.*;
import java.util.*;

public class Userinput extends Login{
	
	Scanner sc = new Scanner(System.in);
	private int password;
	
	Userinput(){
		
	}
	
	Userinput(String userName, String email, int password){
		super(userName, email);
		this.password = password;
	}
	//setters
	public void setPass(int password){
		this.password = password;
	}
	//getters
	public int getPass(){
		return password;
	}
	public String name = "rakin";
	public String em = "rakin@gmail.com";
	public int pass = 1234;
	public void check(){
	// if(userName != name || email != em || password != pass){
			// System.out.print("\n\n		Wrong UserName/email/password.\n		Do you want to reset?(1/0) ");
			// int x = sc.nextInt();
			// if(x == 1){
				// reset();
			// }
			// else if(x == 0){
				// System.out.println("		Thank you for visiting.");
			// }
			// else{
				// System.out.println("		Invalid input.");	
			// }
			
		// }
		// else{
			System.out.println("		Login succesful, choose an option to continue : \n");
			System.out.println("		(1) Mathematic Calculator.");
			System.out.println("		(2) Temperature Calculator");
			System.out.println("		(3) Discount Calculator");
			System.out.println("		(4) Area Calculator.");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					math_calculator();
					break;
				case 2:
					temp_calculator();
					break;
				case 3:
					dis_calculator();
					break;
				case 4:
					area_calculator();
					break;
				default:
					System.out.println("		Invalid input.");
			}
			
		//}
	}
	
	public void reset(){
		System.out.print("		Enter new User Name : ");
		setName(sc.next());
		System.out.print("		Enter new Email     : ");
		setEmail(sc.next());
		System.out.print("		Enter new Password  : ");
		setPass(sc.nextInt());
		
	}
	
	public void math_calculator(){
		System.out.println("Select an option : \n(1)Addition\n(2)Subtraction\n(3)Multiplication\n(4)Division");
		int x = sc.nextInt();
		switch(x){
			case 1:
				System.out.println("How many numbers you want to add together?");
				int n1 = sc.nextInt();
				int add = 0;
				for(int i = 0; i<n1; i++){
					int num;
					System.out.println("Enter number no."+(i+1)+" : ");
					num = sc.nextInt();
					add += num;
				}
				System.out.println("Addition result : "+add);
				break;
			case 2:
				System.out.println("How many numbers you want to deduct together?");
				int n2 = sc.nextInt();
				System.out.println("What number you want to deduct from?");
				int sub = sc.nextInt();
				for(int i = 0; i<n2; i++){
					int num;
					System.out.println("Enter number no."+(i+1)+" : ");
					num = sc.nextInt();
					sub -= num;
				}
				System.out.println("Subtraction result : "+sub);
				break;
			case 3:
				System.out.println("How many numbers you want to multiply together?");
				int n3 = sc.nextInt();
				int mul = 1;
				for(int i = 0; i<n3; i++){
					int num;
					System.out.println("Enter number no."+(i+1)+" : ");
					num = sc.nextInt();
					mul *= num;
				}
				System.out.println("Multiplication result : "+mul);
				break;
			case 4:
				System.out.println("How many numbers you want to together together?");
				int n4 = sc.nextInt();
				System.out.println("What number you want to divide?");
				int div = sc.nextInt();
				for(int i = 0; i<n4; i++){
					int num;
					System.out.println("Enter number no."+(i+1)+" : ");
					num = sc.nextInt();
					div /= num;
				}
				System.out.println("Division result : "+div);
				break;
			default:
				System.out.println("		Invalid input.");
		}
	}
	public void temp_calculator(){
			System.out.println("Select an option : \n(1) Fahr to Cel\n(2) Fahr to Kel\n(3) Cel to Fahr\n(4) Cel to Kel\n(5) Kel to cel\n(6) Kel to Fahr");
			int choice = sc.nextInt();
			double fahr, cel, kel, result;
			
			switch(choice){
				case 1:
					System.out.print("Enter fahr temp : ");
					fahr = sc.nextDouble();
					result = (5*(fahr-32))/9;
					System.out.println("Cel result : "+result);
					break;
				case 2:
					System.out.print("Enter fahr temp : ");
					fahr = sc.nextDouble();
					result = ((fahr-32)/1.8)+273;
					System.out.println("Kel result : "+result);
					break;
				case 3:
					System.out.print("Enter cel temp : ");
					cel = sc.nextDouble();
					result = ((9*cel)/5)+32;
					System.out.println("Fahr result : "+result);
					break;
				case 4:
					System.out.print("Enter cel temp : ");
					cel = sc.nextDouble();
					result = cel+273;
					System.out.println("Kel result : "+result);
					break;
				case 5:
					System.out.print("Enter kel temp : ");
					kel = sc.nextDouble();
					result = kel-273;
					System.out.println("Cel result : "+result);
					break;
				case 6:
					System.out.print("Enter kel temp : ");
					kel = sc.nextDouble();
					result = (1.8*(kel-273))+32;
					System.out.println("fahr result : "+result);
					break;
				default:
					System.out.println("Invalid input.");
			}
	}	
	public void dis_calculator(){
		
	}	
	public void area_calculator(){
		
	}
	public void display(){
		super.display();
		System.out.println("\n		password of the user : "+getPass());
	}
}