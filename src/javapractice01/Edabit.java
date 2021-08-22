package javapractice01;

import java.util.regex.Pattern;

public class Edabit {
public static void main(String[] args) {	
//isZipp("12345");	
//isZipp("1 234");
//isZipp("1v234");	
//isZipp("123-12-12");	
//isPin(1234);
//cBinaryy("ALICAN");
//getMiddle("AliCan");
//getMiddle("VeliHan");	
//System.out.println(isSuffix("sdautomation", "auto"));
//isValid("result");	
//removeABC("li");

System.out.println(getFilename("C:/Users/johnsmith/Music/Beethoven_5.mp3"));	
	
	
	
}




public static String getFilename(String path) {
return path.substring(path.lastIndexOf("/")+1);		
}




public static String removeABC(String words) {
words=words.toLowerCase();
words=words.contains("a")||words.contains("b")||words.contains("c")?words.replaceAll("[abc]", ""):null;	
System.out.println(words);	
return words;
	
	
}







public static boolean isValid(String variable) {
boolean bool=variable.matches("^[a-zA-Z].*")&&!variable.contains(" ");
System.out.println(bool);
return(bool);	
}


public static boolean isPrefix(String word, String prefix) {
return word.indexOf(prefix)==0;	
}

public static boolean isSuffix(String word, String suffix) {
	return word.lastIndexOf(suffix)!=0;
}


public static String getMiddle(String word) {
int len=word.length();
int halfWay=len/2;	
String str=len%2==0?word.substring(halfWay-1,halfWay+1):word.substring(halfWay,halfWay+1);	
System.out.println(str);
return str;
}





public static String cBinaryy(String str) {
	str=str.replaceAll("[a-m[A-M]]","0").replaceAll("[n-z[N-Z]]","1");
	System.out.println(str);
	return str;
}
public static String cBinary(String str) {
	
String s="";
for(int i=0;i<str.length();i++) {

if(String.valueOf(str.charAt(i)).matches("[a-m[A-M]]")) {
	s+=0;
} else if(String.valueOf(str.charAt(i)).matches("[n-z[N-Z]]")) {
	s+=1;
}
}	
return s;	
}




public static boolean isPin(int w) {
String s=String.valueOf(w);
System.out.println(s.matches("\\d{4}")||s.matches("\\d{5}"));
return s.matches("\\d{4}")||s.matches("\\d{5}");
}



public static boolean isZipp(String zip) {
	boolean isZip=zip.matches("\\d{5}");
	System.out.println(isZip);
	return isZip;
}

public static boolean isZip(String zip) {
System.out.println(zip.length()==5&&!zip.contains(" ")&&zip.matches("\\d+"));
return zip.length()==5&&!zip.contains(" ")&&zip.matches("\\d+");
}
}	
