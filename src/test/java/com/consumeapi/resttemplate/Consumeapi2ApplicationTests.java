package com.consumeapi.resttemplate;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.client.RestTemplate;

import com.consumeapi.resttemplate.controller.ApiController;
import com.google.gson.Gson;

import PojoClass.entity;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class Consumeapi2ApplicationTests {

	@LocalServerPort
    int randomServerPort;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGetUserListSuccess() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/getUserProfile";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Gson g = new Gson();  
	    entity s = g.fromJson(result.getBody().toString(), entity.class);  
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("bishalca14l011@gmail.com", s.getEmail());
	}
	
	@Test
	public void testGetUserfirstName() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/getUserProfile";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Gson g = new Gson();  
	    entity s = g.fromJson(result.getBody().toString(), entity.class);  
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("Bishal", s.getFirstName());
	}
	@Test
	public void testGetUserlastName() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/getUserProfile";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Gson g = new Gson();  
	    entity s = g.fromJson(result.getBody().toString(), entity.class);  
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("Panda", s.getLastName());
	}
	
	
	@Test
	public void testgetUsername() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/getUserProfile";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Gson g = new Gson();  
	    entity s = g.fromJson(result.getBody().toString(), entity.class);  
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("isutest", s.getUserName());
	}

	@Test
	public void testgetUseraddress() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/getUserProfile";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Gson g = new Gson();  
	    entity s = g.fromJson(result.getBody().toString(), entity.class);  
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("F 139, Sect 19", s.getAddress());
	}
	
	@Test
	public void testgetCity() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/getUserProfile";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Gson g = new Gson();  
	    entity s = g.fromJson(result.getBody().toString(), entity.class);  
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("Rourkela", s.getCity());
	}
	@Test
	public void testgetState() throws URISyntaxException 
	{
	    RestTemplate restTemplate = new RestTemplate();
	     
	    final String baseUrl = "http://localhost:" + randomServerPort + "/getUserProfile";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    Gson g = new Gson();  
	    entity s = g.fromJson(result.getBody().toString(), entity.class);  
	    
	    //Verify request succeed
	    Assert.assertEquals(200, result.getStatusCodeValue());
	    Assert.assertEquals("Odisha", s.getState());
	}
}
