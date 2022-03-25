package pharmacysubscriber;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import pharmacyservice.PharmacyService;

public class Activator implements BundleActivator {


	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context)throws Exception{
		System.out.println("Start PaymnetSubscriber Service ");	
		serviceReference = context.getServiceReference(PharmacyService.class.getName());
		PharmacyService servicePublish = (PharmacyService) context.getService(serviceReference);
		

				
				
				
	}

	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("PaymentSubscriber has been terminated Good Bye !!!");
		context.ungetService(serviceReference);
		
	}

}
