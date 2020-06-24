/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Partner materialise par l'entite <b>XXXXX</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class CountryDto implements Serializable {
	/**
	 * Code
	 */
	private String code;
	/**
	 * Nom du Pays
	 */
	private String name;
	
	/**
	 * Default Constructor
	 */
	public CountryDto() {}

	/**
	 * @param code
	 * @param name
	 */
	public CountryDto(String code, String name) {
		super();
		this.code = code;
		this.name = name;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CountryDto [code=" + code + ", name=" + name + "]";
	}

}
