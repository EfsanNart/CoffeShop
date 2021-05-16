package CoffeShop.abstracts;

import CoffeShop.entities.Customer;

public interface CustomerCheckService {

	boolean CheckIfRealPerson(Customer customer);
}
