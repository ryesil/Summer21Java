package day02_typecasting_repperclasses_scanner;

public class Variables01 {
	public static void main(String[] args) {
		// if you convert a primitive to another one, it is called "Type Casting".
		//byte<short<int<long<float<double
		
		byte a = 12;
		int b=123;
		int c= a+b;
		System.out.println(c);
		byte age=65;
		short newAge=age;
		System.out.println(newAge);
		System.out.println(age);
		long profit =2345;
		int newprofit=(int) profit;
		
		//Type code to convert float to short
		
		float ben=12.24f;
		short sen=(short)ben;
		System.out.println(sen);
		
		double florida = 12.345432;
		int miami=(int) florida;
		
		System.out.println(miami);
		
		//Explicit Narrowing
		long profitt=2345;
		int newProfitt=(int) profitt;
		
		
		//AutoWidenning
		long ar=12344;
		double arra=(double)ar;
		// If the number is not in the range of the second type, Java uses "Modulus operation" to put into the range.
		short price =245;
		byte newPrice=(byte) price;
		//how to do matematical operations with different data types
		
		// Note: If data are different, Java uses the larger type for the result.
		int aa=5;
		double bb=4;
		float ee=4.0f;
		int cc=2;
		int dd=3;
		
		System.out.println(aa+bb);//9.0 double
		
		System.out.println(aa/cc);//2 not 3 java just chop-offs the decimal.
		//double, there are 16 digits.
		System.out.println(aa/dd); //java chops-off the decimal part.
		
		//IN float we have 7 digits.
		System.out.println(ee/dd);// 1.33333334
		
		
	}

}
