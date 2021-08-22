package day10loops;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 * Ask use to enter firstname and lastname under given conditions;
		 * 
		 * 1)If user uses space characters at the beginning or at the end remove them.
		 * 2)If user enters nothing or just space character, give a message like
		 * "Just space characters or nothing is not valid" 3)If user does not use space
		 * character between first and last name give a message like "One of the
		 * lastname and first name is not entered or space is not used between firstname
		 * and lastname" 4)If user uses multiple space characters between firstname and
		 * lastname make it single 5)Initials of firstname and lastname should be
		 * uppercase, other characters should be lowercases. If user does not enter the
		 * name in this format fix it.
		 */
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your firstName and lastName...");
		String name = in.nextLine();
		if (name.isBlank()) {// works with many spaces as well.
			System.out.println("Just space characters or nothing is not valid");
		} else if (!name.contains(" ")) {
			System.out.println("One of the lastname and first name is not entered"
					+ " or space is not used between firstname and lastname");
		} else if ((name.indexOf(" ") != name.lastIndexOf(" "))) {
//			name=name.replaceAll("\\s+ ", " ");
			int firstIdx = name.indexOf(" ");
			int lastIdx = name.lastIndexOf(" ");
			name = name.substring(0, firstIdx) + " " + name.substring(lastIdx + 1);
			System.out.println(name);
		} else if (!(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
			name = name.substring(0, 1).toUpperCase() + name.substring(1, name.indexOf(" ")).toLowerCase();

//		} else if (!(name.charAt(name.indexOf(" "+1))>='A'&& name.charAt(name.indexOf(" "+1))<='Z')) {
//		String firstnameFormatted=name.substring(name.indexOf(" "+1, name.indexOf(" ")+2).toUpperCase()+
//				)
//		System.out.println(firstNameFormatted);
//		}
			System.out.println("Before: " + name);
			name = name.trim();// Just using method will not change the original string. you need to make an
								// assignment.
			System.out.println("After: " + name);
		}
	}
}
