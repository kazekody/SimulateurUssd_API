package afb.fintech.Controller;


import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import afb.fintech.Dtos.EventDto;
import afb.fintech.Tools.Response;
@CrossOrigin
@Configuration
@RestController
@RequestMapping("/Transaction")
public class Transaction {

	@Autowired
	   RestTemplate restTemplate;
	
	
	String url1 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/doAccountTranfert/{senderAccNo}/{receiverAccNo}/{amount}/{reason}";
	String url2 = "http://172.21.253.247:8242/afb-fintech-api/rest/mobilebanking/doBankTranfert/{senderAccNo}/{receiverAccNo}/{currencyRecAccount}/{amount}/{benefName}/{reason}";
	
	@CrossOrigin
	@GetMapping("/TransfertCompte/{senderAccNo}/{receiverAccNo}/{amount}/{reason}")
	public Response TransfertCompte(@PathVariable(value="senderAccNo")String senderAccno,@PathVariable(value="receiverAccNo")String receiverAccNo,
			@PathVariable(value="reason")String reason,@PathVariable(value="amount")Double amount) {
		
		Response reponseF = new Response();
		BigDecimal amount1 = new BigDecimal(amount);
		Response reponse = restTemplate.getForObject(url1, Response.class,senderAccno,receiverAccNo,amount1,reason);
		reponseF.setReturnValue(reponse.getReturnValue());
		
		ObjectMapper mapper = new ObjectMapper();
		EventDto eventdto = new EventDto();
		try {
			mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			eventdto = mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), EventDto.class);
		} catch (JsonMappingException e) {
		
			e.printStackTrace();
		} catch (JsonProcessingException e) {
		
			e.printStackTrace();
		}
		reponseF.setReturnValue(eventdto);
		
	return reponse;
		
	}

	@CrossOrigin
	@GetMapping("/transactionBenef/{senderAccNo}/{receiverAccNo}/{currencyRecAccount}/{amount}/{benefName}/{reason}")
	public Response transactionBenef(@PathVariable(value="senderAccNo")String senderAccno,@PathVariable(value="receiverAccNo")String receiverAccNo,@PathVariable(value="reason")String reason,@PathVariable(value="amount")Double amount,@PathVariable(value = "benefName")String benefName,@PathVariable(value = "currencyRecAccount")String currencyRecAccount) {
	
			Response reponseF = new Response();
			BigDecimal bigAmount = new BigDecimal(amount);
			Response reponse = restTemplate.getForObject(url2, Response.class,senderAccno,receiverAccNo,reason,bigAmount,benefName,currencyRecAccount);
			if(reponse.isSuccess())
			reponseF.setReturnValue(reponse.getReturnValue());
		
		ObjectMapper mapper = new ObjectMapper();
		EventDto eventdto = null;
		try {
			mapper.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
			eventdto = mapper.readValue(mapper.writeValueAsString(reponseF.getReturnValue()), EventDto.class);
		} catch (JsonMappingException e) {
		
			e.printStackTrace();
		} catch (JsonProcessingException e) {
		
			e.printStackTrace();
		}
		
		reponseF.setReturnValue(eventdto);
		
	return reponseF;
	}
}
	
