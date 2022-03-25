package supermarketserviceer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Glosary implements Inner_Interface{
	
	public double book = 150.00;
	public double pen = 20.00;
	
	public double Total =  0.00;
	
	
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		
		
Map<String, Double> map1 = new HashMap<>();
	    
	    // method to store the put the value and
	    // key into the map
	    map1.put("Book", 150.00);
	    map1.put("Pen", 20.00);
	   

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
	    System.out.println("                                   "+map1.size()+" records");
		
	}


	@Override
	public double SelectSection(String item, double y) {
		// TODO Auto-generated method stub
		
	
		
		if(item.equalsIgnoreCase("book")) {
			Total = (book*y);
			return Total;
			
		}else if(item.equalsIgnoreCase("pen")) {
			Total = (pen*y);
			return Total;
		}else {
		System.out.println("You have seleceted wrong item");	
		return Total;
		}
		
	}
		
		
		
	}
	


