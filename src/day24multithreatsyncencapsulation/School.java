package day24multithreatsyncencapsulation;



public class School {

	public static void main(String[] args) {
		
		Student student1=new Student();
		//2.Way: Use constructor with parameters
		Student student2=new Student("Veli Han",23,false);
		
		System.out.println(student1.getName());
		student1.setName("Ali Can");
		System.out.println(student1.getName());
		String str="Ali veli";
		
		
		
		
		
		
		//Create: Object by using default constructor, then update the values by using setters.
		Student student3=new Student();
		System.out.println(student3.getName());//Mark
		student3.setName("mary Star");
		student3.setSuccessful(false);
		
	}

}
