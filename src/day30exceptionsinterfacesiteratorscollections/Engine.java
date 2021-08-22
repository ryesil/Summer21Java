package day30exceptionsinterfacesiteratorscollections;

public interface Engine {

int price=8000;
String name="Eco";

void gasUsage();
void speedLimit();
void eat();
void drink();
default void accelarate() {
	System.out.println("Accelarate quickly...");
}
	
	
	
}
