package Com.Epam.Factory;
public abstract class Factory {
	public abstract int getWheel(); 
	  public String toString() {
	    return "Wheel: " + this.getWheel();
	  }
	}
	class Car extends Factory {
	  int wheel;
	  Car(int wheel) {
	    this.wheel = wheel;
	  }
	  @Override
	  public int getWheel() {
	    return this.wheel;
	  }
	}
	class Bike extends Factory {
	  int wheel;
	  Bike(int wheel) {
	    this.wheel = wheel;
	  } 
	  @Override
	  public int getWheel() {
	    return this.wheel;
	  }
	}
	class VehicleFactory {
	  public static Factory getInstance(String type, int wheel) {
	    if(type == "car") {
	      return new Car(wheel);
	    } else if(type == "bike") {
	      return new Bike(wheel);
	    }    
	    return null;
	  }
	}
public class FactoryPattern {
	  public static void main(String[] args) {
		  Factory car = VehicleFactory.getInstance("car", 4);
	    System.out.println(car);
	    Factory bike = VehicleFactory.getInstance("bike", 2);
	    System.out.println(bike);
	  }
}
