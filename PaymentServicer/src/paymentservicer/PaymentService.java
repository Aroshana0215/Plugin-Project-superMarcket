package paymentservicer;

public interface PaymentService {
	
	public int genaerateToyalityNumber();
	public boolean CheckPayment(String num9);
	public double generateDiscount(double value);
	public double CalculateLastP(double value, double val);
	

}
