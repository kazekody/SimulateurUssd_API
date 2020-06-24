package afb.fintech.Impl;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import afb.fintech.Entity.Client;
import afb.fintech.Repository.IClientRepository;
import afb.fintech.Service.IClientService;

@Service
public class ClientImpl implements IClientService {
	
	@Autowired
	public IClientRepository clientRepository;

	@Override
	public void ajouterClient(Client client) {
			clientRepository.save(client);
}

	@Override
	public Client findByTelephone(String telephone) {
		Client client = clientRepository.findByTelephone(telephone);
		return client;
	}

	@Override
	public List<Client> listerClient() {
		List<Client> clients = clientRepository.findAll();
		return clients;
	}

	@Override
	public void modifierPin(String pin1, String customerId) {
		clientRepository.modifierPin(pin1,customerId);
		
	}

	@Override
	public void deleteClient(Long id) {
		clientRepository.deleteClient(id);
		
	}

	@Override
	public Client findcodePin(String codePin) {
		Client client = clientRepository.findByCodePin(codePin);
		return client;
	}

	@Override
	public String findCustomerId(String telephone) {
		String customerId = clientRepository.findCustomerId(telephone);
		return customerId;
		
	}

}
