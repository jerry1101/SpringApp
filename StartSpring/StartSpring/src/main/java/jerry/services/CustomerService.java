package jerry.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jerry.dataaccess.CustomerDAO;

@Component
public class CustomerService {
	@Autowired
	@Qualifier("cdao")
	CustomerDAO dao; 
	
	public String getName(int key) {
		return dao.getCustomerName(key);
	}

}
