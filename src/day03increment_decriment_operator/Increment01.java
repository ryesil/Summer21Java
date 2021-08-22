package day03increment_decriment_operator;

public class Increment01 {

	public static void main(String[] args) {
		int age=12;
		System.out.println("Before increment: "+age);
		//How to increase the value of a variable;
		
		//1th way
		age=age+3;
		System.out.println("After increment: "+age);
		
		//2nd way
		age+=5;
		System.out.println("after second increment: "+age);
		
		//3rd way this is used to increase by 1;
		age++;
		System.out.println("After 3rd increment: "+age);
		
		int salary=1000;
		
		//How to increase the value of a variable by multiplication
		salary=salary*2;
		System.out.println("After increment: "+salary);
		
		//2nd way 
		salary*=3;
		System.out.println(salary);
		

	}

}
