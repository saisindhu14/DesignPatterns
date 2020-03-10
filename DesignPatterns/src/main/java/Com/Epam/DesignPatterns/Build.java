package Com.Epam.DesignPatterns;
public class Build {
	private String engine;
	  private int wheel;
	  public String getEngine() {
	    return this.engine;
	  }
	  public int getWheel() {
	    return this.wheel;
	  }
	  private Build(VehicleBuilder builder) {
	    this.engine = builder.engine;
	    this.wheel = builder.wheel;
	  }
	  public static class VehicleBuilder {
	    private String engine;
	    private int wheel;
	    public VehicleBuilder(String engine, int wheel) {
	      this.engine = engine;
	      this.wheel = wheel;
	    }
	    public Build build() {
	      return new Build(this);
	    }
	  }
	}
	public class BuilderPatternExample { 
	  public static void main(String[] args) {
		  Build car = new Build.VehicleBuilder("1500cc", 4).build();
		  Build bike = new Build.VehicleBuilder("250cc", 2).build();
	    System.out.println(car.getEngine());
	    System.out.println(car.getWheel());
	    System.out.println(bike.getEngine());
	    System.out.println(bike.getWheel());
	  }
	}
