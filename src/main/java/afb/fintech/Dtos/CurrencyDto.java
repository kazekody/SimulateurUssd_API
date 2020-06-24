/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Devise
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class CurrencyDto implements Serializable {

	/**
	 * Code ISO de la devise
	 */
	private String iso;
	/**
	 * Designation de la devise
	 */
	private String name;
	/**
	 * Default Constructor
	 */
	public CurrencyDto() {}
	/**
	 * @param iso Code iso de la devise
	 * @param name Libelle de la devise
	 */
	public CurrencyDto(String iso, String name) {
		super();
		this.iso = iso;
		this.name = name;
	}
	/**
	 * @return the iso
	 */
	public String getIso() {
		return iso;
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
	public void setIso(String iso) {
		this.iso = iso;
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
		result = prime * result + ((iso == null) ? 0 : iso.hashCode());
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
		CurrencyDto other = (CurrencyDto) obj;
		if (iso == null) {
			if (other.iso != null)
				return false;
		} else if (!iso.equals(other.iso))
			return false;
		return true;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CurrencyDto [iso=" + iso + ", name=" + name + "]";
	}

}
