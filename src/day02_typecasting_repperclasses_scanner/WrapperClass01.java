package day02_typecasting_repperclasses_scanner;

public class WrapperClass01 {
	public static void main(String[] args) {
		/*
		 * Primitive              Wrapper Class
		     byte					Byte
		     short					Short
		     int				Integer
		     long					Long
		     float				Float
		     double				Double
		     
		     boolean			Boolean
		     char				Character
		     
		 */
		int a=11;
		Integer b=12;
		System.out.println(Integer.MAX_VALUE);
		
		Integer f = 12345;
		System.out.println(f.min(a,b));
		System.out.println(b.compare(25,64));//-1
		System.out.println(b.compare(64,25));//1
		System.out.println(b.compare(64,64));//0
		
		Short kisa=12;
		Short moreKisa=10;
		
		System.out.println(kisa.MAX_VALUE);
		System.out.println(kisa.MIN_VALUE);
		
		System.out.println(kisa.compareTo(moreKisa));
		System.out.println(moreKisa.compareTo(kisa));
		System.out.println(kisa.compareTo(kisa));
		Short c=24533;
		Short d=123;
		System.out.println(c.MAX_VALUE);
		System.out.println(c.MIN_VALUE);
		System.out.println(c.SIZE);// 16 means c uses 16 bits.
		System.out.println(c.toString().length());//3 
		System.out.println(c.hashCode());//24533 It returns the address of the nonPrimitive data.
		System.out.println(c.equals(d));// returns a boolean.
		System.out.println(c.equals(c));
		
		
		//Autoboxing
		
		int x = 12;
		Integer y=x;
		
		//Unboxing
		Integer z = 23;
		int t=z;
		
		
		
		
		
		
	}

}
