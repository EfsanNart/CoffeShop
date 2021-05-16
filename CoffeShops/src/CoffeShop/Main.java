package CoffeShop;
import CoffeShop.concretes.StarbucksCustomerManager;
import CoffeShop.abstracts.BaseCustomerManager;
import CoffeShop.adapters.MernisServiceAdapter;
import CoffeShop.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		
		 customerManager.Save(new Customer(2,"ELA EFSAN","NART",2001,"65421985467"));
		
	}

}
