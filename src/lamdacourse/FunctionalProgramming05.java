package lamdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming05 {

	public static void main(String[] args) {
	
		Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
        
        List<Course> coursesList = new ArrayList();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

ave(coursesList);

courseHasHighestAvg(coursesList);






		
		

	}
	
	
	
	
	//5) sort the list element acoording to the average score in ascending order and print just 3rd one.
	public static List<Course> sortAvgAscGetThird(List<Course> coursesList){
		return coursesList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).limit(1).collect(Collectors.toList());
		
		
	}
	
	
	//4)Sort the list elements according to the average score in ascending order and skip first 2 elements
public static List<Course> skipFirstTwo(List<Course> courseList) {
	List<Course> list=courseList.stream().sorted(Comparator.comparing(Course::getAverageScore)).skip(2).collect(Collectors.toList());
return list;	
}
	
	//3)Create a method to print the course whose average score is the highest
	public static void courseHasHighestAvg(List<Course> l) {
		Course result=l.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get();
		System.out.println(result);
	}
	
	//2 create a method to if at leat one of the course names contains "Turkish" word.
	public static boolean ave3(List<Course> l, String course) {
		return l.stream().anyMatch(t->t.getCourseName().contains(course));
	}
	//1)Create a method to check if all average scores are greater than 91
	public static boolean ave2(List<Course>l,Double averageScore) {
	return	l.stream().allMatch(t->t.getAverageScore()>averageScore);
	}
	
	public static void ave(List<Course> l) {
		System.out.println(l.stream().mapToInt(t->t.getAverageScore()).average().getAsDouble());
	}
}
