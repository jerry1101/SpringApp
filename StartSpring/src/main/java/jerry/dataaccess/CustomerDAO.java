package jerry.dataaccess;

import org.springframework.stereotype.Component;

@Component(value = "cdao")
public class CustomerDAO {
	
	
	public String getCustomerName(int key) {
		return "jerry";
	}

}
