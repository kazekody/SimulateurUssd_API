/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation d'un objet Personne
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 04 Jan. 2019
 */
@SuppressWarnings("serial")
public class PersonDto implements Serializable {
	
	private String code;
	private String name;
	private String idCardNo;
	private String phones;
	private String address;
	private String title;
	
	/**
	 * Default constructor
	 */
	public PersonDto() {}

	/**
	 * @param code
	 * @param name
	 * @param idCardNo
	 * @param phones
	 * @param address
	 * @param title
	 */
	public PersonDto(String code, String name, String idCardNo, String phones, String address, String title) {
		super();
		this.code = code;
		this.name = name;
		this.idCardNo = idCardNo;
		this.phones = phones;
		this.address = address;
		this.title = title;
	}

	/**
	 * Default constructor
	 */
	public PersonDto(CustomerDto c) {
		if(c == null) return;
		this.code = c.getCustomerId();
		this.name = c.getName();
		this.idCardNo = c.getIdCard();
		this.phones = c.getPhoneNumber();
		this.address = c.getExpIdDate();
		this.title = "";
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return the idCardNo
	 */
	public String getIdCardNo() {
		return idCardNo;
	}

	/**
	 * @param idCardNo the idCardNo to set
	 */
	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	/**
	 * @return the phones
	 */
	public String getPhones() {
		return phones;
	}

	/**
	 * @param phones the phones to set
	 */
	public void setPhones(String phones) {
		this.phones = phones;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[PersonDto:{code:" + code + ", name:" + name + ", idCardNo:" + idCardNo + ", phones:" + phones
				+ ", address:" + address + ", title:" + title + "}]";
	}

}
