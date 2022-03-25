package paymentservicer;

import java.util.Random;

public class paymentservicerImpl implements PaymentService {

	int LoyalityNumber;
	double discount = 0.00;
	double LastPayment = 0.00;
	
	int result;
	
	@Override
	public int genaerateToyalityNumber() {
		// TODO Auto-generated method stub
		
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int x = random.nextInt(10000);  
		
		return this.LoyalityNumber = x;

		
	}

	@Override
	public boolean CheckPayment(String x) {
		// TODO Auto-generated method stub
		
		System.out.println("check2:"+x);
		
		String []arr = {"R10001","R100735","R100007","R2098","R6555"} ;
		
		for(int i = 0; i  < arr.length ; i++) {
			
			
			
			if(x.equalsIgnoreCase(arr[i])) {
				
				this.result = 1;
				
				return true;
				
			}else {
				
				this.result = 0;
				return false;
				
			}
			
		}
		return false;
		
		
		
	}

	@Override
	public double generateDiscount(double value) {
		
		if (LoyalityNumber > 0  && value >= 15000.00) {
			
			discount = 12.00/100.00;
			System.out.println("                                        You have received 12% dicscpunt");
			
			
		}else if(LoyalityNumber > 0){
			discount = 4.00/100.00;
			System.out.println("                                        You have received 4% dicscpunt");
			
		}else if(value >= 15000.00){
			discount = 6.00/100.00;
			System.out.println("                                        You have received 6% dicscpunt");
			
		}else {
			discount = 0.00;
			System.out.println("                                        NO Doscount!");
		}
		
		
		
		return discount;
	}


	public double CalculateLastP(double value,double val) {
		// TODO Auto-generated method stub
		
		 double clacDiscount = value * val;
		 
		 LastPayment = value - clacDiscount;
		
		return LastPayment;
	}
	
	
	

}
