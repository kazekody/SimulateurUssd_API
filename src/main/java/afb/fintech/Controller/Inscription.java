package afb.fintech.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import afb.fintech.Dtos.CustomerDto;
import afb.fintech.Entity.Client;
import afb.fintech.Service.IClientService;
import afb.fintech.Tools.GeneratePin;
import afb.fintech.Tools.Response;
@CrossOrigin
@RestController
@RequestMapping("/Inscription")
public class Inscription {
	
	
	
String url1 = "http://172.21.253.247:8242/afb-fintech-api/rest/feature/findCustomer/{customerId}";
String url2 = "http://172.21.253.247:8242/afb-fintech-api/rest/feature/checkIfCustomerFeaturesMatches/{customerId}/{cardID}/{phoneNumber}";
String url3 = "http://localhost:8080/Inscription/findCustomerID/{customerId}";
String url4 = "http://localhost:8080/Inscription/findCustomerIdPhone/{customerId}/{phoneNumber}";

	
	@Autowired
	private IClientService clientService;
	
	@Autowired
	   RestTemplate restTemplate;
	
	@CrossOrigin
	@GetMapping("/findCustomerID/{customerId}")
	public Response findCustomerID(@PathVariable("customerId") String customerId) {
		Response reponseF = new Response();
		Object client = new Object();
		 try {
			Response reponse = restTemplate.getForObject(url1, Response.class,customerId);
			if(reponse.isSuccess())
				client = reponse.getReturnValue();
			reponseF.setReturnValue(client);
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return reponseF;
	}
	
	@CrossOrigin
	@GetMapping("/findCustomerIdPhone/{customerId}/{phoneNumber}")
	public Response findCustomerIdPhone(@PathVariable("customerId")String customerId,@PathVariable("phoneNumber")String phoneNumber) {
		Response reponseF = new Response();
		Boolean reponses = false;
		Object client = new Object();
			Response reponse = restTemplate.getForObject(url3, Response.class,customerId);
			if(reponse.isSuccess())
				client = reponse.getReturnValue();
				reponseF.setReturnValue(client);
		
		ObjectMapper mapper = new ObjectMapper();
		CustomerDto customerdto = null;
		try {
			customerdto = mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), CustomerDto.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		String chaineNumero = customerdto.getPhoneNumber().replaceAll(" ","");
		String[] numero = chaineNumero.split(",");
		for(String a : numero) {
			if(a.equals(phoneNumber)) {
				reponses = true;
				reponseF.setReturnValue(customerdto);
				return reponseF;
			}
		}
		reponseF.setReturnValue(reponses);
				
		return reponseF;
		
	}

 
	@CrossOrigin
	@GetMapping("/findCustomerIdPhoneCard/{customerId}/{cardID}/{phoneNumber}")
	public Response findCustomerIdPhoneCard(@PathVariable("customerId")String customerId,@PathVariable("cardID")String cardId,@PathVariable("phoneNumber")String phoneNumber) {
		Response reponseF = new Response();
		Object client1 = new Object();
		try {
		Response reponse = restTemplate.getForObject(url2, Response.class,customerId,cardId,phoneNumber);
				if(reponse.isSuccess())
		 client1 = reponse.getReturnValue();
				reponseF.setReturnValue(client1);
	}catch(Exception e) {
		e.printStackTrace();
	}
		return reponseF;	
	}
	
	@CrossOrigin
	@PostMapping("/enregistrement/{customerId}/{phoneNumber}")
	public Response enregistrement(@PathVariable ("customerId")String customerId, @PathVariable("phoneNumber")String phoneNumber) {
		Response reponseF = new Response();
		Object client1 = new Object();
			Response reponse = restTemplate.getForObject(url4, Response.class, customerId, phoneNumber);
			if(reponse.isSuccess()) {
				if(reponse.getReturnType().equals("afb.fintech.Dtos.CustomerDto")) {
					client1 = reponse.getReturnValue();
					reponseF.setReturnValue(client1);
				}
				else {
					reponseF.setReturnValue(false);
					return reponseF;
				}
					
			}
		
		ObjectMapper mapper = new ObjectMapper();
		CustomerDto customerdto = null;
		try {
			customerdto = mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), CustomerDto.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		Client client = new Client();
		client.setCustomerId(customerId);
		client.setCodePin(GeneratePin.generate());
		client.setNomClient(customerdto.getName());
		client.setDateSouscrip(new Date());
		client.setTelephone(phoneNumber);
		clientService.ajouterClient(client);
		reponseF.setReturnValue(client);
		
		return reponseF;
		
	}
	
	
}
