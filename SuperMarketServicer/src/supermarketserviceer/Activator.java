package supermarketserviceer;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Publisher Start");
		SuperMarketService publisherService = (SuperMarketService) new SuperMarketServiceImpl();  
		publishServiceRegistration = context.registerService(SuperMarketService.class.getName(),publisherService, null);
		
		
		
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
		
	}


}
