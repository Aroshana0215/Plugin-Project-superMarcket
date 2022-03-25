package paymentservicer;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Pyament Publisher Start");
		PaymentService ServicePayment = new paymentservicerImpl();  
		publishServiceRegistration = context.registerService(PaymentService.class.getName(),ServicePayment, null);
		
		
		
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Pyament Publisher Stop");
		publishServiceRegistration.unregister();
		
	}

}
