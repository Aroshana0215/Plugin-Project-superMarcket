package supermarketserviceer;

import java.util.ArrayList;

public interface SuperMarketService {
	
	
	public void PrintSection();
	public void printdetailsOfSections(int x);
	public double printSectionDetails(int x,String item, double q);
	public void printInvoice() ;
	public void CalculateTotal(double Total) ;

	
	

}
