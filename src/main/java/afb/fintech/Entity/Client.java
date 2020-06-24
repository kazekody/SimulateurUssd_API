package afb.fintech.Entity;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "fin_client")
@SequenceGenerator(name = "TB_CLIENT_SEQ", sequenceName = "TB_CLIENT_SEQ", initialValue = 1, allocationSize = 1)
public class Client implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Id
	@Column(name = "Id", unique = true, updatable = false, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Nom_Client", unique = true, updatable = false, nullable = false)
	private String nomClient;
	
	@Column(name = "CustomerId")
	private String customerId;
	
	@Column(name = "Date_Souscrip")
	private Date dateSouscrip;
	
	@Column(name = "CodePin", unique = true , nullable = true)
	private String codePin;
	

	@Column(name = "telephone")
	private String telephone; 
	
	
	public Client() {
		
	}

	public Date getDateSouscrip() {
		return dateSouscrip;
	}

	public void setDateSouscrip(Date dateSouscrip) {
		this.dateSouscrip = dateSouscrip;
	
	}

	public Long getClientID() {
		return id;
	}

	public void setClientID(Long clientID) {
		this.id = clientID;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	

	public String getCodePin() {
		return codePin;
	}

	public void setCodePin(String codePin) {
		this.codePin = codePin;
	}
	
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codePin == null) ? 0 : codePin.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((dateSouscrip == null) ? 0 : dateSouscrip.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomClient == null) ? 0 : nomClient.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (codePin == null) {
			if (other.codePin != null)
				return false;
		} else if (!codePin.equals(other.codePin))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (dateSouscrip == null) {
			if (other.dateSouscrip != null)
				return false;
		} else if (!dateSouscrip.equals(other.dateSouscrip))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomClient == null) {
			if (other.nomClient != null)
				return false;
		} else if (!nomClient.equals(other.nomClient))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nomClient=" + nomClient + ", customerId=" + customerId + ", dateSouscrip="
				+ dateSouscrip + ", codePin=" + codePin + ", telephone=" + telephone + "]";
	}

	

		
}
