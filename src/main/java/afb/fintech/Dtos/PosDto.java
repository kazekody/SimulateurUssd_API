/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet POS materialise par l'entite <b>POS</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class PosDto implements Serializable {
	/**
	 * Identifiant du TPE
	 */
	private String posID;
	/**
	 * Adresse du TPE
	 */
	private String address;
	/**
	 * Latitude
	 */
	private String latitude;
	/**
	 * Longitude
	 */
	private String longitude;
	/**
	 * Nom du Marchand
	 */
	private String merchantName;
	/**
	 * Ville
	 */
	private String town;

	/**
	 * Default Constructor
	 */
	public PosDto() {}

	/**
	 * @param posID = Identifiant du TPE
	 * @param address = Adresse du TPE
	 * @param latitude = Latitude
	 * @param longitude = Longitude
	 * @param merchantName = Marchand
	 */
	public PosDto(String posID, String address, String latitude, String longitude, String merchantName, String town) {
		super();
		this.posID = posID;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.merchantName = merchantName;
		this.town = town;
	}

	/**
	 * @return the posID
	 */
	public String getPosID() {
		return posID;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
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
	 * @return the merchantName
	 */
	public String getMerchantName() {
		return merchantName;
	}

	/**
	 * @param posID the posID to set
	 */
	public void setPosID(String posID) {
		this.posID = posID;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
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

	/**
	 * @param merchantName the merchantName to set
	 */
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PosDto [posID=" + posID + ", address=" + address + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", merchantName=" + merchantName + ", town=" + town + "]";
	}

}
