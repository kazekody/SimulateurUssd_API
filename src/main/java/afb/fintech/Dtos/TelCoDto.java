/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Langue
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 08 Dec 2017
 */
@SuppressWarnings("serial")
public class TelCoDto implements Serializable {

	/**
	 * Code
	 */
	private String code;
	/**
	 * Designation de la langue
	 */
	private String name;
	/**
	 * Default Constructor
	 */
	public TelCoDto() {}
	/**
	 * @param code Code de la langue
	 * @param name Libelle de la langue
	 */
	public TelCoDto(String code, String name) {
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param iso the iso to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
		TelCoDto other = (TelCoDto) obj;
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
		return "TelCoDto [code=" + code + ", name=" + name + "]";
	}

}
