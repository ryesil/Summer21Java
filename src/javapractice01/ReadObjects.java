package javapractice01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ReadObjects implements Serializable {

	private static final long serialVersionUID = 3288060170389575955L;

	public static void main(String[] args) {
	
		try(ObjectInputStream os=
				new ObjectInputStream(new FileInputStream("GeometricObjects")))
		{
			GeometricObject obj1=(Circle) os.readObject();
			Circle 			obj2=(Circle) os.readObject();
			Rectangle		obj3=(Rectangle) os.readObject();
			
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			
		} catch (FileNotFoundException e) {
			System.out.println("There is no such a file...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
