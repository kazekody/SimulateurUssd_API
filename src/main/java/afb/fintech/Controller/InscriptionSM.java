package afb.fintech.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin
@RestController
@RequestMapping("InscriptionSM")
public class InscriptionSM {
	
	
	String url = "";
	
	@Autowired
	   RestTemplate restTemplate;

}
