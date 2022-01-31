package PojoClass;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.client.RestTemplate;

class entityTestCase {

	
     @Autowired
     private RestTemplate restTemplate; ;
     
	@Test
	public void testCreate() {
		RestTemplate user=new RestTemplate();
		
		//fail("Not yet implemented");
	}

}
