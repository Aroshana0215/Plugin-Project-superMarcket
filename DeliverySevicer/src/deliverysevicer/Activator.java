package deliverysevicer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	private static BundleContext context;

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Delivery Publisher Start");
		DeliverySevice SeviceDelivery = new DeliverySevicerImpl();  
		publishServiceRegistration = context.registerService(DeliverySevice.class.getName(),SeviceDelivery, null);
		
		
		
		

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Delivery Publisher Stop");
		publishServiceRegistration.unregister();
		
	}

}
