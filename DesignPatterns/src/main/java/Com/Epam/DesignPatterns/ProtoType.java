package Com.Epam.DesignPatterns;

import java.awt.List;
import java.util.ArrayList;

public class ProtoType implements Cloneable {
	private List<String> vehicleList;
	  
	  public ProtoType() {
	    this.vehicleList = new ArrayList<String>();
	  }
	  
	  public ProtoType(List<String> list) {
	    this.vehicleList = list;
	  }
	  
	  public void insertData() {
	    vehicleList.add("Honda amaze");
	    vehicleList.add("Audi A4");
	    vehicleList.add("Hyundai Creta");
	    vehicleList.add("Maruti Baleno");
	    vehicleList.add("Renault Duster");
	  }
	  
	  public List<String> getVehicleList() {
	    return this.vehicleList;
	  }
	  
	  @Override
	  public Object clone() throws CloneNotSupportedException {
	    List<String> tempList = new ArrayList<String>();
	    
	    for(String s : this.getVehicleList()) {
	      tempList.add(s);
	    }
	    
	    return new ProtoType(tempList);
	  }
	}

	public class PrototypeDesign {

	  public static void main(String[] args) throws CloneNotSupportedException {
		  ProtoType a = new ProtoType();
	    a.insertData();
	    
	    ProtoType b = (ProtoType) a.clone();
	    List<String> list = b.getVehicleList();
	    list.add("Honda new Amaze");
	    
	    System.out.println(a.getVehicleList());
	    System.out.println(list);
	    
	    b.getVehicleList().remove("Audi A4");
	    System.out.println(list);
	    System.out.println(a.getVehicleList());
	  }

	}