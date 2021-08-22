package javapractice01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Runner {

	public static void main(String[] args) {
	
		Circle circle1=new Circle();
		GeometricObject circle2=new Circle();
		Rectangle rectangle=new Rectangle();
		
		try {
			FileOutputStream file= new FileOutputStream("GeometricObjects");
			ObjectOutputStream os=new ObjectOutputStream(file);
			os.writeObject(circle1);
			os.writeObject(circle2);
			os.writeObject(rectangle);
			
			os.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		

	}

}
