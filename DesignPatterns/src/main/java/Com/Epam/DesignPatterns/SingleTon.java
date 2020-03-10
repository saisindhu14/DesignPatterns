package Com.Epam.DesignPatterns;

public class SingleTon {
private static SingleTon object;
	private SingleTon() {
		
	}
	public static SingleTon getInstance() {
		if(object == null) {
			object = new SingleTon();
		}
		return object;
	}
}
