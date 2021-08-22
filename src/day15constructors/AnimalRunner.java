package day15constructors;

import java.util.Arrays;

//After Class name, in order to see the available constructors ctrl+space.
public class AnimalRunner {

	public static void main(String[] args) {
//	Animals a01=new Animals("Puppy");
//	System.out.println(a01.age);// 5 because we set it to 5. look at the animals class.
//	System.out.println(a01.name);// Bobby same reason as above
//	System.out.println((a01.gender));//M
//	System.out.println(a01.isCarnivorous);// false Default value. Because we did not declare it. above values were declared.
//	System.out.println(Animals.counter);
	
	String tim="1 hour 10 minute 50 seconds".replace("hour", "3600").replace("minute","60").replace("seconds", "");
	String[] time=tim.split(" ");
	System.out.println(Arrays.toString(time));
	int user[]=new int[time.length];
	int sec=0;
	for(int i=0;i<time.length;i++) {
		user[i]=Integer.valueOf(time[i]);
	}
	
	for(int i=0;i<2;i++) {
		sec+=(user[i*2]*user[i*2+1]);
	}
	System.out.println(sec+user[user.length-1]);
	
	}

}
