package OopsConcept;

class Human 
{
	int age;
	void sleep()
	{
		age=18;
		System.out.println("Human needs good sleep");
		System.out.println(age);
		
	}

}
class Student extends Human
{
	
}


public class Inheritance1 
{
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.sleep();
		
	}

}
