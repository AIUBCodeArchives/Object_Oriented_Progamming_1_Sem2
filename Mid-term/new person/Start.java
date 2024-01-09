import java.lang.*;

public class Start{
	public static void main(String[] args){
		Student s1 = new Student("Java", 56,2342);
		s1.display();
		
		Teacher t1 = new Teacher();
		t1.setName("C#");
		t1.setAge(675);
		t1.setSal(100000);
		t1.display();
	}
}