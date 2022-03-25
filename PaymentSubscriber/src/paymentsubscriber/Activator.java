package paymentsubscriber;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import paymentservicer.PaymentService;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context)throws Exception{
		System.out.println("Start PaymnetSubscriber Service ");	
		serviceReference = context.getServiceReference(PaymentService.class.getName());
		PaymentService servicePublish = (PaymentService) context.getService(serviceReference);
		

				
				
				
	}

	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("PaymentSubscriber has been terminated Good Bye !!!");
		context.ungetService(serviceReference);
		
	}

}
