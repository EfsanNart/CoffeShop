package CoffeShop.adapters;

import java.rmi.RemoteException;
import java.util.Locale;

import CoffeShop.abstracts.CustomerCheckService;
import CoffeShop.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		boolean  result =true;
		try {
			result=client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalIdentity()), customer.getFirstName().toUpperCase(new Locale("tr")), customer.getLastName().toUpperCase(new Locale("tr")),
					customer.getTimeOfBirth() );
		} catch ( RemoteException e) {
			
			e.printStackTrace();
		}
		System.out.println(result);
		return result;
	}

	
}
