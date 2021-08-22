package lamdacourse;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
/*
 Method references: Class Name :: method name without method parenthesis
 Example==> 		String     :: length
 					ArrayList  :: size
 
 */
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
		getMin(l);
		minAndGreater(l);
		getHalfOfDistinctElementsReversed(l);
		
	}
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order from the list.
	public static void getHalfOfDistinctElementsReversed(List<Integer> l) {
	List<Double> result=l.
						 stream().
						 distinct().
						 filter(t->t>5).
						 map(Utils::getHalf).
						 sorted(Comparator.reverseOrder()).
						 collect(Collectors.toList());
		System.out.println("Half of the elements list: "+ result);
	}
	
	
	
	//9 create a method to find the min value which is greater than 7 and even.
		public static void minAndGreater(List<Integer>l) {
		Integer min=l.
				stream().distinct().
				filter(t->t>7).
				filter(Utils::chechToBeEven).
				sorted(Comparator.reverseOrder()).
				reduce(Integer.MAX_VALUE, Math::min);
		System.out.println(min);
		}
	
	
	// 8) Create a method to find the minimum value from the list elements
		public static void getMin(List<Integer> l) {
			int min=l.
					stream().
					reduce(Integer.MAX_VALUE,Math::min);
			System.out.println(min);
		}
	
	
	
	
	//7)Create a method to find the maximum value from the list elements
		public static void getMax(List<Integer> l) {
			int maxEl=l.
					stream().
					reduce(Integer.MIN_VALUE,Math::max);
			System.out.println(maxEl);
		}
	
	
	
	
	//6)Create a method to calculate the product of the cubes of distinct even elements
		public static void productOfCubeOfDistincts(List<Integer> l) {
			int i =l.
					stream().
					distinct().
					filter(Utils::chechToBeEven).
					map(Utils::getCubed).
					reduce(1,Math::multiplyExact);
			System.out.println(i);
		}
	//5)Create a method to calculate the sum of the squares of distinct even elements
		public static void sumOfSquareOfDistinctEven(List<Integer> l) {
			int sum=l.
					stream().
					distinct().
					filter(Utils::chechToBeEven).
					map(Utils::getSquare).
					reduce(0,Math::addExact);
			System.out.println(sum);
		}
	
	
	
	
	//4)Create a method to print the cube of distinct
		//odd list elements on the console in the same line with a space between two consecutive elements.
		public static void printCubeOfOdd(List<Integer> l) {
			l.
			stream().
			distinct().
			filter(Utils::chechToBeOdd).
			map(Utils::getCubed).
			forEach(Utils::printInTheSameLineWithASpace);
		}
	
	
	
	//3)Create a method to print the square of odd list elements on the console
	 //in the same line with a space between two consecutive elements.
	public static void printSquareOfOdds(List<Integer> l) {
		l.
		stream().
		filter(Utils::chechToBeOdd).
		map(Utils::getSquare).
		forEach(Utils::printInTheSameLineWithASpace);
	}
	
	
	//2)Create a method to print the even list elements on the console in the same
	//line with a space between two consecutive elements.(Method Reference) (edited) 
	public static void printElFunctional(List<Integer> l) {
		l.
		stream().
		filter(Utils::chechToBeEven).
		forEach(Utils::printInTheSameLineWithASpace);
	}
	
	
	//1)Create a method to print the list elements on the console
	//in the same line with a space between two consecutive elements.(Method Reference)
	public static void printElFuntional(List<Integer> l) {
	//If java has any method we prefer to use it,if java doesn't have it we create a method in the utils class and then use it.
		l.
		stream().
		forEach(Utils::printInTheSameLineWithASpace);
	}
	
	
	

}
