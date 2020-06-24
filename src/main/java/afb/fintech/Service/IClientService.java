package afb.fintech.Service;

import java.util.List;

import afb.fintech.Entity.Client;


public interface IClientService {
	
	public void ajouterClient(Client client);
	
	public Client findByTelephone(String telephone);
	
	public String findCustomerId(String telephone);
	
	public  List<Client> listerClient();
	
	public  void modifierPin(String pin1,String customerId);

	public  void deleteClient(Long id);

	public Client findcodePin(String codePin);

}
