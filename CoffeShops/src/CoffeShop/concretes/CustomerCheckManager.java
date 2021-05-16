package CoffeShop.concretes;

import CoffeShop.abstracts.CustomerCheckService;
import CoffeShop.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

	
}
