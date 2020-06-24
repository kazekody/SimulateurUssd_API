package afb.fintech.Model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerDto implements Serializable {

	
	public CustomerDto() {}
	
	
	private String customerId;
	
	
	private String name;
	
	
	private String phoneNumber;
	
	
	private String address;
	
	
	private String idCard;
	

	private String expIdDate;
	
	
	private String type;
	
	
	private String dna;
	
	
	private String sex;
	
	
	private String lang;

	
	private String manager;

	
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
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getIdCard() {
		return idCard;
	}
	
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	
	public String getExpIdDate() {
		return expIdDate;
	}
	
	public void setExpIdDate(String expIdDate) {
		this.expIdDate = expIdDate;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDna() {
		return dna;
	}
	
	public void setDna(String dna) {
		this.dna = dna;
	}
	
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getLang() {
		return lang;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setLang(String lang) {
		this.lang = lang;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public String getManager() {
		return manager;
	}
	
	public void setManager(String manager) {
		this.manager = manager;
	}
	
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
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
		CustomerDto other = (CustomerDto) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", idCard=" + idCard + ", expIdDate=" + expIdDate + ", type=" + type
				+ ", dna=" + dna + ", sex=" + sex + ", lang=" + lang + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}


}
