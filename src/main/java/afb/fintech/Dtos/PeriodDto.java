/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Periodicite
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class PeriodDto implements Serializable {

	/**
	 * Code de la Periodicite
	 */
	private String code;
	/**
	 * Designation de la periodicite
	 */
	private String name;
	/**
	 * Default Constructor
	 */
	public PeriodDto() {}
	/**
	 * @param code Code de la periode
	 * @param name Libelle de la periode
	 */
	public PeriodDto(String code, String name) {
		super();
		this.code = code;
		this.name = name;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PeriodDto [code=" + code + ", name=" + name + "]";
	}

}
