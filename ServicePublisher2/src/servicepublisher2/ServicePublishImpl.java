package servicepublisher2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ServicePublishImpl implements ServicePublish {
	
        public String name;
        public String Address;
        public int Loyality;
        
        
     
        
		@Override
		public String PrintName(String name) {
			// TODO Auto-generated method stub
			
			this.name =  name;
			
			return this.name;
		}

		@Override
		public int PrintID() {
			Random random = new Random();   
			// Generates random integers 0 to 49  
			Integer x = random.nextInt(10000); 
			   
			
			 	
			 	
			 	
			 	
			 	return  x;
         
           
		}

		public double PrintPH_SMTotal(double x, double y) {
			// TODO Auto-generated method stub
			
			
			
			return x+ y;
		}

	
		public void setAddress(String ad ) {
			// TODO Auto-generated method stub
			
			
			this.Address = ad;
			
			System.out.println("Address is:"+this.Address);
		}

		@Override
		public void setLoyalityN(int name) {
			
			this.Loyality = name;
			
			System.out.println("Your Loyality Card Number is:"+this.Loyality);
		}




	    
		
	}


