package day21listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {
	public static void main(String[] args) {
List<Character> list1=new ArrayList<>();
list1.add('x');
list1.add('z');
list1.add('a');
list1.add('m');
//Use for-loop


for(int i=0;i<list1.size();i++) {
	System.out.print(list1.get(i)+"!");	//x!z!a!m!
}

for(char i: list1) {
System.out.print(i+"!");//x!z!a!m!
}

//If the characters are not vowel in the list print them on the console.


for(char i:list1) {
	if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u') {
		continue;
	}
	System.out.println(i+" !");
}

//print the ASCII values of all the characters on the console;


List<Character> list2=new ArrayList<>();

//for(int i='A';i<='z';i++) {
//	list2.add((char)i);
//}
int sum=0;
for(char i: list2) {
	System.out.println(""+i+" ="+(int)i);
	sum+=i;
}
System.out.println(sum);

//Print the characters whose ASCII values are even
sum=0;
for(char i: list1) {
	if(i%2==1) {
		continue;
	}
	sum+=i;
}
System.out.println(sum);

//If you see any character whose ASCII value less than 100 stop printing.

List<Character> list3=new ArrayList<>();
for(int i='A';i<='z';i++) {
	list3.add((char)i);
}
//for(char w:list3) {
//	if(w<100) {
//		System.out.println(w+" is less than 100");
//		System.err.println("Error");
//	break;
//	}
//	System.out.println(w);
//}
//System.out.println('a'<'A');

//Arrays can use for-each loop as well
//Print the list elements which doesn't end with n.
String s[]= {"Ali", "Can","Hasan", "Ekrem"};


for(String w:s) {
	if(!w.endsWith("n")) {
		System.out.println(w);	
	}
	
}




}
}