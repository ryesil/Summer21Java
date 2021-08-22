package day03increment_decriment_operator;

public class Decrement01 {
	public static void main(String[] args) {
	int weight=120;
	//How to decrease the value of a variable
	//1
	weight=weight-20;
	
//	2nd way
	weight-=10;
	
//	3rd way
	weight--;
	
	int population=24000;
	
//	decrease by division
	population=population/2;
	
	//2nd
	population/=3;
	
	
	int aliSalary=600;
	int veliSalary=500;
	//Decrease Ali's salary 20% then increase it by 100 dollars
	//Increase Veli's salary 100 then decrease it by 20%
	
	aliSalary-=0.2*aliSalary;
	aliSalary+=100;
	veliSalary+=100;
	veliSalary-=veliSalary*0.2;
	System.out.println(aliSalary+" "+veliSalary);

	}
}