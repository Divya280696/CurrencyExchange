package com.CurrencyExchange.demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RefreshScope
public class CurrencyExchangeController {

	/*@Autowired
	
	private CurrencyConversionServiceProxy proxy;
	
	@GetMapping("currency-converter-feign/from{from}/to{to}/quantity{quantity}")
		public CurrencyExchange converterFeign(@PathVariable String from, @PathVariable String to, @PathVariable BigInteger quantity)
		{
			CurrencyExchange resp=proxy.retrieveValue(from, to);
			return new CurrencyExchange(resp.getId(),from,to,resp.getPort(),resp.getQuantity(),resp.getValue(),quantity.multiply(resp.getValue()));
		}
		
		
	}*/
	//@Value("${converter.service.url:default}")
	//String url;
	
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyExchange converter(@PathVariable String from, @PathVariable String to, @PathVariable BigInteger quantity)
	{
		
		Map<String, String>uriVariables=new HashMap<>();  
		uriVariables.put("from", from);  
		uriVariables.put("to", to); 
		//System.out.println(url);
		RestTemplate restTemPlate=new RestTemplate();
		/*
		 * ResponseEntity<CurrencyExchange> responseEntity =
		 * restTemPlate.getForEntity(url, CurrencyExchange.class, uriVariables);
		 */
		
		
		  ResponseEntity<CurrencyExchange> responseEntity = restTemPlate.getForEntity(
		  "http://localhost:8080/converter/currency-service/from/{from}/to/{to}",
		  CurrencyExchange.class, uriVariables);
		 
		//ResponseEntity<CurrencyExchange>responseEntity=new RestTemplate().getForEntity("http://localhost:8080/currency-exchange/from/{from}/to/{to}",
			//	CurrencyExchange.class);
		CurrencyExchange response=responseEntity.getBody(); 
		
		System.out.println(response.getValue());
		return new CurrencyExchange(response.getId(),from,to,response.getPort(),response.getValue(),quantity,quantity.multiply(response.getValue()));
	}
	
	@GetMapping("/getPerson")
	public List<Person> converter() throws JsonProcessingException{
		
		 List<Person> list = new ArrayList<>();
		
		RestTemplate restTemPlate=new RestTemplate();
		
		ResponseEntity<Employee>	responseEntity = restTemPlate.getForEntity("http://localhost:8080/getEmployee",
				Employee.class);
		
		
		Address addr = new Address("12" , "Palladam");
		
		
	Employee	emp2 = restTemPlate.postForObject("http://localhost:8080/insertAddress",  addr ,
			Employee.class);
	
		//Employee emp2 =	responseEntity2.getBody();
		
		Person person2 = new Person(emp2.getAge() , emp2.getDepart() , emp2.getName());
		
		Employee emp= 	responseEntity.getBody();
		
		Person person = new Person();
		
		person.setPersonAge(emp.getAge());
		
		person.setPersonDept(emp.getDepart());
		
		person.setPersonName(emp.getName());
		
		list.add(person);
		
		list.add(person2);
		
		return list;
		
		
	}
}
		
	
	
	
	

