package supermarketserviceer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Fruits_Vegetable implements Inner_Interface {
	
	

public double beans = 150.00;
public double carrot = 200.00;

public double mango = 70.00;
public double apple = 60.00;

public double Total = 0.00;
	
	@Override
	public void printDetails() {
		

		Map<String, Double> map1 = new HashMap<>();
	    
	    // method to store the put the value and
	    // key into the map
	    map1.put("Bean", 150.00);
	    map1.put("Carrot", 200.00);
	    map1.put("Mango", 70.00);
	    map1.put("Apple", 60.00);
	   

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
	    System.out.println("                                     "+map1.size()+" records");
		
	}

	@Override
	public double SelectSection(String item, double y) {
		
		
		
		if(item.equalsIgnoreCase("beans")) {
			Total =  beans*y; 
			return Total;
			
		}else if(item.equalsIgnoreCase("carrot")) {
			Total = carrot*y;
			return Total;
		}else if(item.equalsIgnoreCase("Mango")) {
			Total = mango*y;
			return Total;
		}else if(item.equalsIgnoreCase("apple")) {
			Total = apple*y;
			return Total;
		}
		
		else {
			System.out.println("You have sleceted wrong Item!!");
		return Total;
		}
	}

	

}
