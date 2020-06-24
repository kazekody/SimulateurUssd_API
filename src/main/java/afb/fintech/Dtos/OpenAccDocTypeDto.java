/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Type de documents d'ouverture de compte
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 02 Jan 2017
 */
@SuppressWarnings("serial")
public class OpenAccDocTypeDto implements Serializable {

	/**
	 * Code 
	 */
	private String code;
	/**
	 * Designation 
	 */
	private String name;
	/**
	 * Mandatory
	 */
	private boolean mandatory = false;
	/**
	 * Default Constructor
	 */
	public OpenAccDocTypeDto() {}
	/**
	 * @param code
	 * @param name
	 */
	public OpenAccDocTypeDto(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}
	
	/**
	 * @param code
	 * @param name
	 * @param mandatory
	 */
	public OpenAccDocTypeDto(String code, String name, boolean mandatory) {
		super();
		this.code = code;
		this.name = name;
		this.mandatory = mandatory;
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
	 * @return the mandatory
	 */
	public boolean isMandatory() {
		return mandatory;
	}
	/**
	 * @param mandatory the mandatory to set
	 */
	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
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
		OpenAccDocTypeDto other = (OpenAccDocTypeDto) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OpenAccDocTypeDto [code=" + code + ", name=" + name + ", mandatory=" + mandatory + "]";
	}
	
}
