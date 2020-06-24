package afb.fintech.Controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import afb.fintech.Dtos.AccountDto;
import afb.fintech.Dtos.HistoricDto;
import afb.fintech.Tools.Response;
@CrossOrigin
@RestController
@RequestMapping("/GestionCompte")
@Configuration
public class GestionCompte {
	
	@Autowired
	   RestTemplate restTemplate;
	
	String url1 = "http://172.21.253.247:8242/afb-fintech-api/rest/wallet/getCustomerAccounts/{custId}";
	String url2 = "http://172.21.253.247:8242/afb-fintech-api/rest/wallet/getAccountBalance/{accountNo}";
	String url3 = "http://172.21.253.247:8242/afb-fintech-api/rest/wallet/getAccountInfo/{accountNo}";
	String url4 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/getAccountHistoricN/{accountNo}/{n}";
	
	@GetMapping("/ListerCompte/{custId}")
	public List<String> listerCompte(@PathVariable("custId") String custId) {
		
		Response reponseF = new Response();
		List<String> accountListF = new ArrayList<String>();
		Response reponse = restTemplate.getForObject(url1, Response.class,custId);
			
		reponseF.setReturnValue(reponse.getReturnValue());
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		List<AccountDto> accountList = new ArrayList<AccountDto>() ;
		try {
			accountList = Arrays.asList(mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), AccountDto[].class));
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
	for (AccountDto accountDto : accountList) {
		accountListF.add(accountDto.getAccNo());
	}
		return accountListF;
		
	}

	@GetMapping(value = "/soldeCompte/{accountNo}")
	public BigDecimal soldeCompte(@PathVariable ("accountNo") String accountNo){
		Response reponseF = new Response();
		Response reponse = restTemplate.getForObject(url2, Response.class,accountNo);
		reponseF.setReturnValue(reponse.getReturnValue());
		BigDecimal solde = new BigDecimal(-1.0);
		if (reponse.isSuccess() == false) {
			return solde;
		}
		else if (reponse.isSuccess() == true) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		
		try {
			solde = mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), BigDecimal.class);
			System.out.println(solde);
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
	}
		return solde;
	}
	
	@GetMapping(value = "/detailsCompte/{accountNo}")
	public  AccountDto detailsCompte(@PathVariable ("accountNo") String accountNo){
		Response reponseF = new Response();
		Response reponse = restTemplate.getForObject(url3, Response.class,accountNo);
		reponseF.setReturnValue(reponse.getReturnValue());
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		AccountDto accountDto = null;
		try {
			accountDto = mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), AccountDto.class);
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			
			e.printStackTrace();
		}
		
//		detailsF = "Les détails de votre compte "+accountNo+ "\n Date de création : " +accountDto.getCreateDate()+ "\n Proprietaire : "+accountDto.getOwner()+ "\n Devise : "+accountDto.getCurrency()+ "\n Type de compte : "+accountDto.getAccType();
		
		return accountDto;
	}
	
	
	@GetMapping("/historiqueCompte/{accountNo}")
	public List<String> historiqueCompte(@PathVariable("accountNo") String accountNo) {
		Response reponseF = new Response();
		List<String> accountHistoricF = new ArrayList<String>();
		Object historic = new Object();
		int n = 10;
		Response reponse = restTemplate.getForObject(url4, Response.class,accountNo,n);
		if(reponse.isSuccess()) 
			 historic = reponse.getReturnValue();
		reponseF.setReturnValue(historic);
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		List<HistoricDto> historicList = new ArrayList<HistoricDto>() ;
		try {
			historicList = Arrays.asList(mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), HistoricDto[].class));
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
		
			e.printStackTrace();
		}
		if(historicList.size() == 0) {
			List<String> accountHistoricFN = new ArrayList<String>();
			accountHistoricFN.add("Aucune transaction éffectué !");
			return accountHistoricFN;
		}
		else {
		for (HistoricDto historicDto : historicList) {
			if(historicDto.getSens().equals("C")) {
				accountHistoricF.add(historicDto.getTranDate()+" Crédit d'une somme de " +historicDto.getAmt()+ " XAF");
			}
			else if(historicDto.getSens().equals("D")){
				accountHistoricF.add(historicDto.getTranDate()+" Débit d'une somme de " +historicDto.getAmt()+ " XAF");
			}
		}
		return accountHistoricF;
		}
	}
	
}
