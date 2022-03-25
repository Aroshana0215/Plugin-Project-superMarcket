package supermarketserviceer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class SuperMarketServiceImpl implements SuperMarketService {

	

	 Glosary G = new Glosary();
	 Fruits_Vegetable f_v = new Fruits_Vegetable();
	 meat_fish m_f = new meat_fish();
	 
	 Map<String, Double> map1 = new HashMap<>();

 
public int qut;
public double Total;


	@Override
	public void PrintSection() {
		
		
		String []arr = {"Glosary Section","Vegitable_fuits Section","Meat/Fish Section"} ;
		System.out.println("                                                   Sections             ");
		System.out.println("\n"); 
		
		for(int i = 0; i  < arr.length ; i++) {
			
		
			System.out.println("                                               "+ i+ "   =   "+ arr[i]);
			
			
		}
		
		}
	

	@Override
	public double printSectionDetails(int x,String item, double q) {

	    
	    // method to store the put the value and
	    // key into the map
	    map1.put(item, q);
	
		
		
		
	
		 System.out.println("\n");
	           if (x == 0){
	
			 double x1 = G.SelectSection(item, q);
			      return x1;
	           }
	           else if(x == 1) {

			 
			  double x2 = f_v.SelectSection(item, q);
			            return x2;
			  
	           }else if(x == 2) {
	
		
			  double x3 = m_f.SelectSection(item, q);
			         return x3;
			   
	           }else {
		    System.out.println("You selected wrong Number");
		}
		
	
		return 0.00;
		
	}


	@Override
	public void printdetailsOfSections(int x) {
		// TODO Auto-generated method stub
		
		switch (x) {
		  case 0:
			  G.printDetails();
		    break;
		  case 1:
			  f_v.printDetails();
		    break;
		  case 2:
			  m_f.printDetails();
			    break;
		  default:
		    System.out.println("You have entered wrong number");
		}
		
	}



	
	public void printInvoice() {
		
	    // method to access the value based on
	    // the key
	    System.out.println(map1.size());

	    Set<Map.Entry<String, Double> > set1
	        = map1.entrySet();
	    
	    List<Map.Entry<String, Double> > list1
	        = new ArrayList<>(set1);
	    
	    System.out.println("\n\n");
	    // using the iterator 
	    System.out.println("                                                                       Receipt                      ");
	    System.out.println("\n");
	    System.out.println("                                                              Item\t\t\t"+"amount\t\t");
	    System.out.println("\n");
	    for ( Map.Entry<String, Double> entry : map1.entrySet()) {
	        String key = entry.getKey();
	        Double value = entry.getValue();
	        
	       
			  
			  System.out.println("                                                              "+key+"\t\t\t"+value);
			  

	    }
	
	    System.out.println("                               **********************************************************************************************");
	}


	@Override
	public void CalculateTotal(double Total) {
		// TODO Auto-generated method stub
		
		this.Total = Total;
		System.out.println("                             Your Total   LKR:"+this.Total);
		
	}



		
		
	

	
	

}
