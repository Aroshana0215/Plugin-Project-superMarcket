package supermarketserviceer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class meat_fish implements Inner_Interface {

	public double meat = 1200.00;
	public double fish = 900.00;
	
	public double Total = 0.00;
	
	Map<String, Double> map1 = new HashMap<>();
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
		

	    
	    // method to store the put the value and
	    // key into the map
	    map1.put("Meat", 1200.00);
	    map1.put("Fish", 900.00);
	   

	    // method to access the value based on
	    // the key
	  

	    Set<Map.Entry<String, Double> > set1
	        = map1.entrySet();
	    
	    List<Map.Entry<String, Double> > list1
	        = new ArrayList<>(set1);
	    
	    // using the iterator 
	    System.out.print("                              Item\t\t"+"amount\t\t"+"Price");
	    System.out.println("\n");
	    for ( Map.Entry<String, Double> entry : map1.entrySet()) {
	        String key = entry.getKey();
	        Double value = entry.getValue();
	        
			  
			  System.out.println("                              "+key+"\t\t1KG\t\t LKR:"+value);

	    }
	    System.out.println("\n");
	    System.out.println("                                 "+map1.size()+" records");
		
	}

	@Override
	public double SelectSection(String item, double y) {
		// TODO Auto-generated method stub


		
		if(item.equalsIgnoreCase("meat")) {
			Total = (meat*y);
			return Total;
			
		}else if(item.equalsIgnoreCase("fish")) {
			Total = (fish*y);
			return Total;
		}else {
			System.out.println("You have selected wrong item");
		return Total;
		}
		
	}

}
