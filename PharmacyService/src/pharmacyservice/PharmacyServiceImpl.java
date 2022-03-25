package pharmacyservice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PharmacyServiceImpl implements PharmacyService {
	
	
	double penadol = 3.50;
	double Idex_balm = 400.00;
	double c_vitamin = 10.00;
	
	double Total = 0.00;
	
	 Map<String, Double> map = new HashMap<>();

	@Override
	public void Printlist() {
		// TODO Auto-generated method stub
		
		
Map<String, Double> map1 = new HashMap<>();
	    
	    // method to store the put the value and
	    // key into the map
	    map1.put("Penadol", 3.50);
	    map1.put("Idex balm", 400.00);
	    map1.put("C-Vitamin", 10.00);
	   

	    // method to access the value based on
	    // the key


	    Set<Map.Entry<String, Double> > set1
	        = map1.entrySet();
	    
	    List<Map.Entry<String, Double> > list1
	        = new ArrayList<>(set1);
	    
	    System.out.println("\n\n");
	    // using the iterator 
	    System.out.println("                                        Item\t\t"+"amount\t\t"+"Price");
	    System.out.println("\n");
	    for ( Map.Entry<String, Double> entry : map1.entrySet()) {
	        String key = entry.getKey();
	        Double value = entry.getValue();
	        
			  
			  System.out.println("                                        "+key+"\t\t1KG\t\t LKR:"+value);

	    }
	    System.out.println("\n");
	    System.out.println("                                               "+map1.size()+" records");
		
	}

	public double BuyMedicine(String m , double q) {
		// TODO Auto-generated method stub
		
		   map.put(m, q);

		if(m.equalsIgnoreCase("penadol")) {
			Total = (penadol*q);
			return Total;
			
		}else if(m.equalsIgnoreCase("Ideax")) {
			Total = (Idex_balm*q);
			return Total;
		}else if(m.equalsIgnoreCase("C-vitamin")) {
			Total = (c_vitamin*q);
			return Total;
		}else {
		System.out.println("You have seleceted wrong item");	
		return Total;
		}
		
		
	}


	@Override
	public void PrintPharmcyInvoice() {
		// TODO Auto-generated method stub
		

	    // method to access the value based on
	    // the key
	    System.out.println(map.size());

	    Set<Map.Entry<String, Double> > set1
	        = map.entrySet();
	    
	    List<Map.Entry<String, Double> > list1
	        = new ArrayList<>(set1);
	    
	    // using the iterator 
	    System.out.println("                                                                receipt");
	    System.out.println("                                                     Item\t\t\t"+"amount");
	    System.out.println("\n");
	    for ( Map.Entry<String, Double> entry : map.entrySet()) {
	        String key = entry.getKey();
	        Double value = entry.getValue();
	        
	       
			  
			  System.out.println("                                                    "+key+"\t\t\t"+value);
			  

	    }
	
	    System.out.println("                               ************************************************************************************");
		
	}

}
