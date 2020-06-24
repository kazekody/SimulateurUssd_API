package afb.fintech.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import afb.fintech.Entity.Rdv;
import afb.fintech.Entity.Urgence;
import afb.fintech.Tools.Response;


@RestController
@RequestMapping("/Test")
public class Test {
	
	
	@Autowired
	   RestTemplate restTemplate;
	
	String url1 = "http://172.21.253.225/rc-crm/api/v1/case";
	String url2 = "http://172.21.253.225/rc-crm/api/v1/meeting";
	
	@CrossOrigin
	@PostMapping(value = "/cases/{Urgence}" ,headers = "Accept=application/json")
	@ResponseBody
	public Response cases(@RequestBody Urgence urgence) {
		
		Response reponseF = new Response();
		
		Urgence urgence1 = restTemplate.postForObject(url1,urgence, Urgence.class);
		reponseF.setReturnValue(urgence1);
		
		return reponseF;
		
	}
	
	@CrossOrigin
	@PostMapping(value = "/meeting/{rdv}" ,headers = "Accept=application/json")
	@ResponseBody
	public Response meeting(@RequestBody Rdv rdv) {
		
		Response reponseF = new Response();
		
		Rdv rdv1 = restTemplate.postForObject(url2,rdv, Rdv.class);
			reponseF.setReturnValue(rdv1);
		
		return reponseF;
		
	}


}
