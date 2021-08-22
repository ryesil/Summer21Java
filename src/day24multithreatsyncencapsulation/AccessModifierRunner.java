package day24multithreatsyncencapsulation;

public class AccessModifierRunner extends AccessModifier01 {
	public static void main(String[] args) {
		AccessModifier01 obj1=new AccessModifier01();
		String str="There is a bomb.";
		System.out.println(str.contains("bomb"));
	System.out.println(bomb("There is a bomb."));
	
	}
	public static String bomb(String str) {
		if(str.toLowerCase().contains("bomb")){
		return "DUCK!";
		}else{
			return "Relax, there is no bomb.";
		}
	}
}
