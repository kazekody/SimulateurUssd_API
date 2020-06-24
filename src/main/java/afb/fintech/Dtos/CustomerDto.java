/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Client
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 10 Dec. 2017
 */
@SuppressWarnings("serial")
public class CustomerDto implements Serializable {

	/**
	 * Default Constructor
	 */
	public CustomerDto() {}
	
	/**
	 * Matricule Client
	 */
	private String customerId;
	
	/**
	 * Nom
	 */
	private String name;
	
	/**
	 * Numero de telephone
	 */
	private String phoneNumber;
	
	/**
	 * Adresse
	 */
	private String address;
	
	/**
	 * Numero de la piece d'identite
	 */
	private String idCard;
	
	/**
	 * Date d'expiration de la piece d'identite
	 */
	private String expIdDate;
	
	/**
	 * Type de Client (Particulier/Entreprise)
	 */
	private String type;
	
	/**
	 * Date de naissance
	 */
	private String dna;
	
	/**
	 * Sexe
	 */
	private String sex;
	
	/**
	 * Langue
	 */
	private String lang;

	/**
	 * Manager
	 */
	private String manager;

	/**
	 * Email
	 */
	private String email;
	
	private String firstName;
	private String lastName;
	
	/**
	 * @param customerId Matricule Client
	 * @param name Nom
	 * @param phoneNumber Numeros de telephone
	 * @param address Adresse du client
	 * @param idCard Numero de la piece d'identite
	 * @param expIdDate Date d'expiration de la piece d'identite
	 * @param type Type de Client (Particulier/Entreprise)
	 * @param dna Date de naissance
	 * @param sex Sexe
	 * @param lang Langue
	 */
	public CustomerDto(String customerId, String name, String phoneNumber, String address, String idCard,
			String expIdDate, String type, String dna, String sex, String lang, String firstName, String lastName, String email) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.idCard = idCard;
		this.expIdDate = expIdDate;
		this.type = type;
		this.dna = dna;
		this.sex = sex;
		this.lang = lang;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the idCard
	 */
	public String getIdCard() {
		return idCard;
	}
	/**
	 * @param idCard the idCard to set
	 */
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	/**
	 * @return the expIdDate
	 */
	public String getExpIdDate() {
		return expIdDate;
	}
	/**
	 * @param expIdDate the expIdDate to set
	 */
	public void setExpIdDate(String expIdDate) {
		this.expIdDate = expIdDate;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the dna
	 */
	public String getDna() {
		return dna;
	}
	/**
	 * @param dna the dna to set
	 */
	public void setDna(String dna) {
		this.dna = dna;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the lang
	 */
	public String getLang() {
		return lang;
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @param lang the lang to set
	 */
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return the manager
	 */
	public String getManager() {
		return manager;
	}
	/**
	 * @param manager the manager to set
	 */
	public void setManager(String manager) {
		this.manager = manager;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerDto other = (CustomerDto) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", idCard=" + idCard + ", expIdDate=" + expIdDate + ", type=" + type
				+ ", dna=" + dna + ", sex=" + sex + ", lang=" + lang + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

}
