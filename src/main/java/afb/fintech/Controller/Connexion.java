package afb.fintech.Controller;



import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import afb.fintech.Entity.Client;
import afb.fintech.Service.IClientService;
import afb.fintech.Tools.Response;
//import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;


@Configuration
@RestController
@RequestMapping("/Connexion")
public class Connexion {

	@Autowired
	private IClientService clientService;
	
	@Autowired
	   RestTemplate restTemplate;
	
	String url = "http://localhost:8080/Connexion/RechercheTelephone/{telephone}";
	
	
@GetMapping(value = "/RechercheTelephone/{telephone}")
public Client findByTelephone(@PathVariable("telephone") String telephone) {
	
		Client client = new Client();
     client = clientService.findByTelephone(telephone);
    System.out.println(client);

    return client;
}

	
@GetMapping(value = "/RechercheCustomerId/{telephone}")
public Response findCustomerId(@PathVariable("telephone") String telephone) {
	Response reponse = new Response();
     String customerId = clientService.findCustomerId(telephone);
     reponse.setReturnValue(customerId);
    return reponse;
}


@GetMapping(value = "/AncienCodePin/{codePin}")
public Client findcodePin(@PathVariable("codePin") String codePin) {
	
//		Client clientF = null;
     Client client = clientService.findcodePin(codePin);
        
     return client;
   
}


@GetMapping(value="/RechercheCodePin/{codePin}/{telephone}")
public Response findcodePin(@PathVariable("codePin") String codePin, @PathVariable("telephone")String telephone) {
	
	Response reponseF = new Response();
	Boolean reponsef =  true;
	Client client = new Client();

	 try {
	 client = restTemplate.getForObject(url, Client.class,telephone);

	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	
	
    Client client2 = clientService.findcodePin(codePin);
    System.out.println(client2);
    if(client2.getCodePin().equals(client.getCodePin())) {
    	reponseF.setReturnValue(client2);
    }
    if(!(client2.getCodePin().equals(client.getCodePin()))) {
    	reponsef = false;
    	reponseF.setReturnValue(reponsef);
    }
    return reponseF;
}


@GetMapping(value = "/ChangerCodePin/{codePin1}/{customerId}") 
	public Response changerPin(@PathVariable("codePin1")String codePin1,@PathVariable("customerId")String customerId ) {
	
	Boolean reponsef =  true;
	Response reponseF = new Response();
	clientService.modifierPin(codePin1, customerId);
	reponseF.setReturnValue(reponsef);
	
		return reponseF;
	
	
}


	
}
