package CoffeShop.concretes;

import CoffeShop.abstracts.BaseCustomerManager;
import CoffeShop.entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Save(Customer customer) {
		System.out.println("Save to db : " +customer.getFirstName() +  " " + customer.getLastName());
		
	}

}
