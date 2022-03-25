package pharmacyservice;

import org.osgi.framework.BundleActivator;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {


	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Publisher Start");
		PharmacyService ServicePharmacy = new PharmacyServiceImpl();  
		publishServiceRegistration = context.registerService(PharmacyService.class.getName(),ServicePharmacy, null);
		
		
		
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
		
	}

}
