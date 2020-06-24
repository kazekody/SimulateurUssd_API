package afb.fintech.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import afb.fintech.Entity.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long> {
	
	Client findByTelephone(String telephone);
	
	Client findByCodePin(String codePin);
	
	@Modifying
	@Transactional
	@Query(value = "delete from Client client where client.id= :id")
	public void deleteClient(@Param("id")Long id);
    
	@Modifying
	@Transactional
	@Query(value ="update Client client set client.codePin = :codePin1 where client.customerId = :customerId")
	public void modifierPin(@Param("codePin1") String codePin1,@Param("customerId") String customerId);
	
	
	@Transactional
	@Query(value = "select customerId from Client where telephone = :telephone")
	public String findCustomerId(@Param("telephone")String telephone);
	
}
