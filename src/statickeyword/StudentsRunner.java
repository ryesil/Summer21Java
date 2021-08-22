package statickeyword;

import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Enter your first name");
			String first=scanner.next();//In order to eliminate next() problem add another next() an empty one
			System.out.println("Enter your last name");
			String last=scanner.next();
			String name=first+" "+last;
			System.out.println("Enter your grad"
					+ "e");
			int grade=scanner.nextInt();
			System.out.println("enter registration");
			int year=scanner.nextInt();
			Students std1=new Students(name,grade,year);
			System.out.println("Student Name: "+std1.name);
			System.out.println("Student grade: "+std1.grade);
			System.out.println("Student regs year: "+ std1.registrationYear);
			System.out.println("student id: "+ std1.id);
			System.out.println("To quit press Q, to continue press any other button");
			String quit=scanner.next().toUpperCase();
			if(quit.equals("Q")) {
				break;
			}
		} while(true);
			
		}

	}


