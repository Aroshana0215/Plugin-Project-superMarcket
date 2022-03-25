package servicesubscriber2;

import deliverysevicer.DeliverySevice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import paymentservicer.PaymentService;
import pharmacyservice.PharmacyService;
import servicepublisher2.ServicePublish;
//import toyservice.toyService;
import supermarketserviceer.SuperMarketService;


public class Activator implements BundleActivator {


	ServiceReference serviceReference;

	@Override
	public void start(BundleContext context)throws Exception{
		System.out.println("Start Subscriber Service \n\n\n\n");
		System.out.println("***********************************      Welcome to the v-shopping super marcket center      ***********************************\n\n\n");
		
		
		serviceReference = context.getServiceReference(ServicePublish.class.getName());
		ServicePublish servicePublish = (ServicePublish) context.getService(serviceReference);
		
		serviceReference = context.getServiceReference(SuperMarketService.class.getName());
		SuperMarketService servicerSuperMarket = (SuperMarketService) context.getService(serviceReference);
//		
		serviceReference = context.getServiceReference(PharmacyService.class.getName());
		PharmacyService ServicePharmacy = (PharmacyService) context.getService(serviceReference);
		
		serviceReference = context.getServiceReference(DeliverySevice.class.getName());
		DeliverySevice SeviceDelivery = (DeliverySevice) context.getService(serviceReference);
		

		serviceReference = context.getServiceReference(PaymentService.class.getName());
		PaymentService ServicePayment = (PaymentService) context.getService(serviceReference);

//				System.out.println(servicePublish.publishService());
				
				
				String value = "";                                          
				String y = "";
				String c = "";
				String value3;
				String value4;
				String value2;
				String value5;
				String value6;
				String value7;
				String value8;
				String value9;
				String value10;
				String num9;
				
				int counter = 0;
				
				boolean result;
				
				double num3;
				double num7;
				double num8;
				double discount = 0.00;
				double CalcDelivery = 0.00;
				double  Total = 0.00;
				double  pTotal = 0.00;
				double  ph_S_Total = 0.00;
				double  DE_ph_S_Total = 0.00;
				double  GetTot = 0.00; 
				double  LastPayment = 0.00; 
				
				
				
				
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				Scanner sc = new Scanner(System.in);
				
				
				System.out.println("Do you want to continue the service (yes / no):");
				value = reader.readLine();
				System.out.println("\n");
				
				
				while(value.equalsIgnoreCase("yes") ) {
					
					
					System.out.println("Enter your name please:");
					c = reader.readLine();
					System.out.println("\n\n");
					
					
					System.out.println("                         Hi   "+ servicePublish.PrintName(c)+ "  You are engagging with V-shopping super marcket center");
					System.out.println("                                                    Customer id:"+ servicePublish.PrintID());
					System.out.println("\n\n");
					
					
					
					
					servicerSuperMarket.PrintSection();
					System.out.println("\n\n");
				
					System.out.println("Do you want check the section details (yes/no):");
					value2 = sc.next();
					
					while(value2.equalsIgnoreCase("yes")){
						
						
						System.out.println("\n");
						System.out.println("Enter your prefered section:");
						int num = sc.nextInt();
                     
						System.out.println("\n\n");
					 servicerSuperMarket.printdetailsOfSections(num);
					 	
					    System.out.println("\n");
						System.out.println("Do you want to continue to buy (yes/no):");
						value4 = sc.next();
						
						
					 
					 
					 while(!value4.equalsIgnoreCase("no")) {
						System.out.println("\n");
						System.out.println("Enter Item Name:");
						value4 = sc.next();
						System.out.println("Enter amount you want:");
						num3 = sc.nextDouble();
					 
						GetTot = servicerSuperMarket.printSectionDetails(num, value4, num3);                
						System.out.println("\n");
						servicerSuperMarket.printInvoice();
						Total = Total + GetTot;
						System.out.println("                                                            Newly Buy Item' Total       LKR:"+GetTot);
						System.out.println("                                                            Your current Bill amount    LKR:"+Total);
						System.out.println("\n\n");
					 
						

						 counter++;
						 
						 
							System.out.println("Do you want to continue buy  in this  section (yes/no):");
							value4 = sc.next();
						 
					}
				
					    System.out.println("\n");
						System.out.println("Do you want check the section details (yes/no):");
						value2 = sc.next();
						System.out.println("\n");
						servicerSuperMarket.PrintSection();
		
                    }
					
					
					 System.out.println("\n");
					servicerSuperMarket.printInvoice();
					servicerSuperMarket.CalculateTotal(Total);
					
					
					 System.out.println("\n\n");
					System.out.println("Do you want to Enter to the Pharmacy (yes / no):");
					value5 = reader.readLine();
					
					while(!value5.equalsIgnoreCase("no")) {
						 System.out.println("\n\n");
					
					System.out.println("                                                      Welcome to the V-shopping Pharmacy");
					 
					 System.out.println("\n");
					System.out.println("Press any key to see the available Medicine List:");
					value = reader.readLine();
					
					ServicePharmacy.Printlist();
					
					
					 System.out.println("\n");
					System.out.println("Do yo want to get Medicine(yes/no):");
					value6 = sc.next();
					
					 
					 while(value6.equalsIgnoreCase("yes")) {
						System.out.println("Enter Item Name:");
						value7 = sc.next();
						System.out.println("Enter amount you want:");
						 num7 = sc.nextDouble();
					 
						GetTot = ServicePharmacy.BuyMedicine(value7, num7 );          
					 
						
						
						 ServicePharmacy.PrintPharmcyInvoice();
						 pTotal =  pTotal + GetTot;
						 System.out.println("                                        Newly added Item Price LKR:"+ pTotal);
						 System.out.println("                                        Pharmacy Total:"+ pTotal);
						 ph_S_Total = servicePublish.PrintPH_SMTotal(Total, pTotal);
						 System.out.println("                                        Your current Bill amount    LKR:"+ ph_S_Total);
						

						 counter++;
						 
						    System.out.println("\n");
							System.out.println("Do you want to buy Medicine again(yes/no):");
							value6 = sc.next();
						 
					}
                     

					 ServicePharmacy.PrintPharmcyInvoice();
					 System.out.println("                                        Pharmacy Total:"+ pTotal);
					 System.out.println("                                        Your current Bill amount    LKR:"+ ph_S_Total);
					 
					 
						System.out.println("Do you want to Enter to the Pharmacy Again (yes / no):");
						value5 = reader.readLine();
					
					}
					
					
					
					 
					 System.out.println("hello "+servicePublish.PrintName(c));
					 servicerSuperMarket.printInvoice();
					 servicerSuperMarket.CalculateTotal(Total);
					 System.out.println("\n\n");
					 ServicePharmacy.PrintPharmcyInvoice();
					 System.out.println("                                        Pharmacy Total:"+ pTotal);
					 ph_S_Total = servicePublish.PrintPH_SMTotal(Total, pTotal);
					 System.out.println("                                        Your current Bill amount    LKR:"+ph_S_Total);
					 
					 
					 System.out.println("\n\n");
					 System.out.println("                                        V-shoping Delivery Service                  \n\n ");
				
					 
					 
					
					
					System.out.println("Enter Your Address:");
					value8 = reader.readLine();
					
					
					System.out.println("Enter your  District:");
					value9 = reader.readLine();
					 
					System.out.println("Enter ditance from your Location to Colombo:(km)");
					num7 = sc.nextDouble();
					 
					 
					SeviceDelivery.SetAddress(value8);
					CalcDelivery = SeviceDelivery.CalculateDelivery(value9,num7);
					
					DE_ph_S_Total = CalcDelivery + pTotal + Total ;
					
					 
					 System.out.println("\n\n");
						System.out.println("                                            Payment section               \n\n");
					 
	
						System.out.println("Do you want to create a loyality card [4% discount] (yes/no):");
						value10 = reader.readLine();

						 if(value10.equalsIgnoreCase("yes")) {
							 
							int loyality = ServicePayment.genaerateToyalityNumber();
							servicePublish.setLoyalityN(loyality);
							 
						}
						 
							
						 System.out.println("                                        hello "+servicePublish.PrintName(c));
						 servicePublish.setAddress(value8);
						 servicerSuperMarket.printInvoice();
						 System.out.println("\n\n");
						 servicerSuperMarket.CalculateTotal(Total);
						 ServicePharmacy.PrintPharmcyInvoice();
						 System.out.println("                                        Pharmacy Total:"+ pTotal);
						 ph_S_Total = servicePublish.PrintPH_SMTotal(Total, pTotal);
						 System.out.println("                                        Your Crrent Total:\n"+ph_S_Total);
						 System.out.println("                                        Delivery cost:"+CalcDelivery);
						 System.out.println("                                        Total :\n"+DE_ph_S_Total);
						 discount = ServicePayment.generateDiscount(DE_ph_S_Total);	
						 LastPayment = ServicePayment.CalculateLastP(DE_ph_S_Total,discount );
						 System.out.println("                                        Total you have to pay::\n"+LastPayment);
						 
						 System.out.println("\n\n");
							System.out.println("To Complete your Payment Enter your receipt Number:");
							num9 = sc.next();
							
							
							
							result = ServicePayment.CheckPayment(num9);
							
						
						 
							if(result == true) {
								System.out.println("                                        You have successfully done the payment.....");
								
							}else {
								System.out.println("                                        Payment failed!!\n");
								
									
								
							}
						 
			
					
					System.out.println("Do you want to continue the service in Supermaket (yes / no):");
					value = reader.readLine();
					
						
					
				}
				
				System.out.println("                                        Thank you for visitting!!!!");
				System.out.println("                                         Bye... see you again!");
				
				
				
	}

	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Good Bye !!!");
		context.ungetService(serviceReference);
		
	}

}
