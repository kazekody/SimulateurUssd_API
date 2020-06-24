package afb.fintech.Controller;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
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
import com.fasterxml.jackson.databind.SerializationFeature;
import afb.fintech.Dtos.WebBenefDto;
import afb.fintech.Tools.Response;
@CrossOrigin
@RestController
@RequestMapping("/GestionBenef")
@Configuration
public class GestionBenef {

	@Autowired
	   RestTemplate restTemplate;
	
	String url1 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/addWebBeneficiary/{customerId}/{nomBenef}/{accountNo}/{dev}";
	String url2 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/getWebBeneficiaries/{customerId}";
	
	@CrossOrigin
	@PostMapping("/AjouterBenef/{customerId}/{nomBenef}/{accountNo}/{dev}")
	public Response AjouterBenef(@PathVariable("customerId")String customerId, @PathVariable("nomBenef")String nomBenef,@PathVariable("accountNo")String accountNo,@PathVariable("dev")String dev) {
		Response reponseF = new Response();
		
		Response reponse = restTemplate.getForObject(url1, Response.class,customerId,nomBenef,accountNo,dev);
		if(reponse.isSuccess()) 
		reponseF.setReturnValue(reponse.getReturnValue());
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		Boolean resultat = false;
		try {
			resultat =  mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), Boolean.class);
		} catch (JsonMappingException e) {
		
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		reponseF.setReturnValue(resultat);
		
		return reponseF;
		
	}
	
	@CrossOrigin
	@GetMapping("/ListerBenef/{customerId}")
	public List<WebBenefDto> listerBenef(@PathVariable("customerId") String customerId) {
		
		Response reponse = restTemplate.getForObject(url2, Response.class,customerId);

		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		List<WebBenefDto> benefList = new ArrayList<WebBenefDto>() ;
		try {
			benefList = Arrays.asList(mapper.readValue(mapper.writeValueAsString(reponse.getReturnValue()), WebBenefDto[].class));
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	
		return benefList;
		
	}
	
	
}
