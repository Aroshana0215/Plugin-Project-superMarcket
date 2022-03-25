package supermarketsubscriber;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import supermarketserviceer.SuperMarketService;

public class Activator implements BundleActivator {
	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context)throws Exception{
		System.out.println("Start PaymnetSubscriber Service ");	
		serviceReference = context.getServiceReference(SuperMarketService.class.getName());
		SuperMarketService servicePublish = (SuperMarketService) context.getService(serviceReference);
		

				
				
				
	}

	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("PaymentSubscriber has been terminated Good Bye !!!");
		context.ungetService(serviceReference);
		
	}
}
