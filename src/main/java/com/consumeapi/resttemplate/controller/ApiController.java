package com.consumeapi.resttemplate.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import PojoClass.entity;

@RestController
public class ApiController {
	
    @Autowired
	private RestTemplate restTemplate;    //coreuat-zwqcqy3qmq-el.a.run.app/user/getuserprofile?id
    
	
	private static String url ="https://coreuat-zwqcqy3qmq-el.a.run.app/user/getuserprofile?id";
	
	@GetMapping("/getUserProfile")
	public entity getUserDetail(){
		HttpHeaders headers = new HttpHeaders();
		headers.set("Authorization", "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpc3V0ZXN0IiwiYXVkaWVuY2UiOiJ3ZWIiLCJjcmVhdGVkIjoxNjQyNzY1MDIyNjgwLCJleHAiOjE2NDUzOTMwMjJ9.DKJFrPBf9w_u2FurS6mgkDK3qom4nBUv49gq_JuHxII02Jcsc7a6cXu770ieJ_bykTfDP9vSWx4DfdpGrLH3Rw");
		HttpEntity<Void> requestEntity = new HttpEntity<>(headers);
		
		ResponseEntity<entity>  response=restTemplate.exchange(url, HttpMethod.GET, requestEntity,  entity.class);
		return response.getBody();
	}
}
