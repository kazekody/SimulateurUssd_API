package afb.fintech.Controller;

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
import afb.fintech.Dtos.CashVoucherDto;
import afb.fintech.Dtos.EffectDto;
import afb.fintech.Dtos.LoanDto;
import afb.fintech.Tools.Response;
@CrossOrigin
@Configuration
@RestController
@RequestMapping("/Option")
public class Option {
	
	@Autowired
	   RestTemplate restTemplate;
	
	String url1 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/listCustCashVouchers/{customerId}";
	String url2 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/listCustLoans/{customerId}";
	String url3 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/listCustEffects//{customerId}";
	
	@CrossOrigin
	@GetMapping("listBonCaise/{customerId}")
	public List<CashVoucherDto> listBonCaisse(@PathVariable("customerId") String customerId) {
		
		Response reponseF = new Response();
		Response reponse = restTemplate.getForObject(url1, Response.class,customerId);
		reponseF.setReturnValue(reponse.getReturnValue());
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		List<CashVoucherDto> bonCaisseList = new ArrayList<CashVoucherDto>() ;
		try {
			bonCaisseList = Arrays.asList(mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), CashVoucherDto[].class));
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
//		if(bonCaisseList.size() == 0) {
//			List<String> bonCaisseFN = new ArrayList<String>();
//			bonCaisseFN.add("Aucun bon de caisse trouvé !");
//			return bonCaisseFN;
//		}
//		else {
//		for (CashVoucherDto cashVoucherDto : bonCaisseList) {
//			
//			bonCaisseListF.add(cashVoucherDto.getDate()+" Bon de caisse "+ cashVoucherDto.getCvNo()+ " d'un montant de "+cashVoucherDto.getAmt()+ " .Status : "+cashVoucherDto.getStatus());
//	
//		}
//		
//	}
		return bonCaisseList;
	}
	
	@CrossOrigin
	@GetMapping("listFinancement/{customerId}")
	public List<LoanDto> listFinancement(@PathVariable("customerId") String customerId) {
		
		Response reponseF = new Response();
		Response reponse = restTemplate.getForObject(url2, Response.class,customerId);
		
		reponseF.setReturnValue(reponse.getReturnValue());
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		List<LoanDto> financementList = new ArrayList<LoanDto>() ;
		try {
			financementList = Arrays.asList(mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), LoanDto[].class));
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
//		
//		if(financementList.size() == 0) {
//			List<String> financementFN = new ArrayList<String>();
//			financementFN.add("Aucune demande de financement trouvé !");
//			return financementFN;
//		}
//		else {
//		for (LoanDto loanDto : financementList) {
//			
//			financementListF.add("Demande de financement No "+ loanDto.getLoanNo()+ " d'un montant de "+loanDto.getAmt()+ " d'un montant restant : "+loanDto.getRemaining());
//	
//		}
//		
//	}
//		return financementListF;
//	}
		return financementList;
}
	@CrossOrigin
	@GetMapping(value = "/EffetDeCommerce/{customerId}")
	public List<EffectDto> listEffetDeCommerce(@PathVariable("customerId") String customerId) {
		
		Response reponseF = new Response();
		Response reponse = restTemplate.getForObject(url3, Response.class,customerId);
		
		reponseF.setReturnValue(reponse.getReturnValue());
		ObjectMapper mapper = new ObjectMapper();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		List<EffectDto> effetDeCommerceList = new ArrayList<EffectDto>() ;
		try {
			effetDeCommerceList = Arrays.asList(mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), EffectDto[].class));
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return effetDeCommerceList;
		
	}
	
	
	
	
}


