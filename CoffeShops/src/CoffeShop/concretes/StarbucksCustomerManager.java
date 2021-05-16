package CoffeShop.concretes;

import CoffeShop.abstracts.BaseCustomerManager;
import CoffeShop.abstracts.CustomerCheckService;
import CoffeShop.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

private CustomerCheckService customerCheckService;
	

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {

		this.customerCheckService = customerCheckService;
		
	}
	
	@Override
	public void Save(Customer customer) {
		
		if(this.customerCheckService.CheckIfRealPerson(customer)) {
			
		      System.out.println("Saved to db :" +  customer.getFirstName());
			 } 
			 
			 
			 else {
				 System.out.println("Not a valid person. ");
			 }
		
	}

}
