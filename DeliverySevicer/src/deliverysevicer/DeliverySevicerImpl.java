package deliverysevicer;

public class DeliverySevicerImpl implements DeliverySevice {

	String address;
	
	double delivery = 0.00;
	double CalDist = 0.00;
	
	@Override
	public double CalculateDelivery(String d,double distance) {
		// TODO Auto-generated method stub
		
		String []arr = {"colombo","Gampaha","Kaluthara"} ;
		
		for(int i = 0; i  < arr.length ; i++) {
			
			if(d.equalsIgnoreCase(arr[i])) {
				
				System.out.println("You can have your item within  today!!\n\n");
				
				if(distance <= 30.00 ) {
					
					delivery = 300.00;
					return delivery;
				
					
				}else {
					
					delivery = 500.00;
			
					return delivery;
				}
				
				
		
			
				
			}else {
				System.out.println("You can have your item with a week!!\n\n");
				
				delivery = 700.00;
				double dist = 100.00;;
				double CalcDist = 0.00;
				
				
				if(distance <= 100.00) {
					
					
					return delivery;
					
				}else {
					
					CalcDist = distance - dist;
					
					double newTotal = CalcDist * 20;
					
					return newTotal + delivery ;
					
				}

				
			
				
			}
			
		}
		
		
		return delivery;
		
	}

	@Override
	public void SetAddress(String ad) {
		// TODO Auto-generated method stub
		
	}
	
	
}
