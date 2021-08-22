package day29exceptionsabstraction;

public class Parrot extends Bird{

	public static void main(String[] args) {
		
		
		
		
	}

	public static void drink(String liquid) throws IllegalDrinkException {
		
		if(liquid.equals("Beer")) 
			throw new Parrot().new IllegalDrinkException("Cannot drink, Haram");
		
		
	}
	
	
	
	
class IllegalDrinkException extends Exception{	
		private static final long serialVersionUID = 1L;

	public IllegalDrinkException(String message) {
		super(message);
	}
	
	}
	
	
	
	
	
	@Override
	public void drink() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	

	

}
