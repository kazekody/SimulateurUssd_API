/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Signataire d'un compte
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class AccountSignatoryDto implements Serializable {

	/**
	 * Default Constructor
	 */
	public AccountSignatoryDto() {}
	
	/**
	 * Nom du signataire
	 */
	private String name;
	
	/**
	 * N� de telephone du signataire
	 */
	private String phone;
	/**
	 * @param name
	 * @param phone
	 */
	public AccountSignatoryDto(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
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
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountSignatoryDto [name=" + name + ", phone=" + phone + "]";
	}

}
