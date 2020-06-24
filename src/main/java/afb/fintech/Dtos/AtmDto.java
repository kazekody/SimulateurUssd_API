/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet ATM materialise par l'entite <b>ATM</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class AtmDto implements Serializable {
	/**
	 * Identifiant de l'ATM
	 */
	private String atmID;
	/**
	 * Adresse de l'ATM
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
	 * Ville
	 */
	private String town;

	/**
	 * Default Constructor
	 */
	public AtmDto() {}

	/**
	 * @param atmID = Identifiant de l'ATM
	 * @param address = Adresse de l'ATM
	 * @param latitude = Latitude
	 * @param longitude = Longitude
	 */
	public AtmDto(String atmID, String address, String latitude, String longitude, String town) {
		super();
		this.atmID = atmID;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.town = town;
	}

	/**
	 * @return the atmID
	 */
	public String getAtmID() {
		return atmID;
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
	 * @param atmID the atmID to set
	 */
	public void setAtmID(String atmID) {
		this.atmID = atmID;
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
		return "AtmDto [atmID=" + atmID + ", address=" + address + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", town=" + town + "]";
	}

}
