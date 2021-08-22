package day24multithreatsyncencapsulation;

public class Test01 {

	public static void main(String[] args) {
		String str1="Java";
		String str2="Java";
		String str3=new String("Java");
		StringBuilder sb1=new StringBuilder("Java");
		AccessModifier01 obj1=new AccessModifier01();
		
		if(str1==str2) {
			System.out.println("str1 and str2 equal to each other with ==");
		}
		if(str1==str3) {
			System.out.println(true);
		}
		if(str1.equals(str3)) {
			System.out.println(true);
		}
		//if you compare data in different data types, Java gives you compile time error
		
		if(str1.equals(sb1)) {// returns falls because of different data types.
			
			System.out.println("str1 is equal to sb1");
		}
		
	}

}
