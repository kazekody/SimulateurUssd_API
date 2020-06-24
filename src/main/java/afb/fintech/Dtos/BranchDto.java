/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Branches/Agences materialise par l'entite <b>Branch</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class BranchDto implements Serializable {
	/**
	 * Code Agence
	 */
	private String branchCode;
	/**
	 * Designation
	 */
	private String name;
	/**
	 * Adresse complete de l'agence
	 */
	private String adr;
	/**
	 * Coordonnees Geographique de Latitude
	 */
	private String latitude;
	/**
	 * Coordonnees Geographique de Longitude
	 */
	private String longitude;
	
	/**
	 * Ville
	 */
	private String town;

	/**
	 * Default COnstructor
	 */
	public BranchDto() {}

	/**
	 * @param branchCode = Code Agence
	 * @param name = Nom
	 * @param adr = Adresse
	 * @param latitude = Latitude
	 * @param longitude = Longitude
	 */
	public BranchDto(String branchCode, String name, String adr, String latitude, String longitude, String town) {
		super();
		this.branchCode = branchCode;
		this.name = name;
		this.town = town;
		this.adr = adr;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the adr
	 */
	public String getAdr() {
		return adr;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}

	/**
	 * @param adr the adr to set
	 */
	public void setAdr(String adr) {
		this.adr = adr;
	}

	/**
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BranchDto [branchCode=" + branchCode + ", name=" + name + ", adr=" + adr + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", town=" + town + "]";
	}

}
