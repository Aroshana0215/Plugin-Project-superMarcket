package deliverysubscriber;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import deliverysevicer.DeliverySevice;


public class Activator implements BundleActivator {


	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context)throws Exception{
		System.out.println("Start DeliverSubscriber Service ");	
		serviceReference = context.getServiceReference(DeliverySevice.class.getName());
		DeliverySevice servicePublish = (DeliverySevice) context.getService(serviceReference);
		

				
				
				
	}

	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("DeliverySubscriber has been terminated Good Bye !!!");
		context.ungetService(serviceReference);
		
	}

}
