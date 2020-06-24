/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

import java.util.Date;

import afb.fintech.Tools.Utils;

/**
 * Objet utilise pour controler les equilibres dans les rapports de comptabilisation
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 13 Mar 2018
 */
@SuppressWarnings("serial")
public class BalancedAccEntryDto implements Serializable {

	/**
	 * Date Comptable
	 */
	private Date dco;
	/**
	 * Code Utilisateur
	 */
	private String uti;
	/**
	 * Code Operation
	 */
	private String ope;
	/**
	 * Sens
	 */
	private String sen;
	/**
	 * Nbre de lignes
	 */
	private Integer nbre;
	/**
	 * Total
	 */
	private Double total;
	/**
	 * Default Constructor
	 */
	public BalancedAccEntryDto() {
		super();
	}
	/**
	 * @param dco
	 * @param uti
	 * @param ope
	 * @param sen
	 * @param nbre
	 * @param total
	 */
	public BalancedAccEntryDto(Date dco, String uti, String ope, String sen, Integer nbre, Double total) {
		super();
		this.dco = dco;
		this.uti = uti;
		this.ope = ope;
		this.sen = sen;
		this.nbre = nbre;
		this.total = total;
	}
	/**
	 * @return the dco
	 */
	public Date getDco() {
		return dco;
	}
	public String getFormattedDco(){
		return Utils.defaultDateFormat.format(dco);
	}

	/**
	 * @param dco the dco to set
	 */
	public void setDco(Date dco) {
		this.dco = dco;
	}
	/**
	 * @return the uti
	 */
	public String getUti() {
		return uti;
	}
	/**
	 * @param uti the uti to set
	 */
	public void setUti(String uti) {
		this.uti = uti;
	}
	/**
	 * @return the ope
	 */
	public String getOpe() {
		return ope;
	}
	/**
	 * @param ope the ope to set
	 */
	public void setOpe(String ope) {
		this.ope = ope;
	}
	/**
	 * @return the sen
	 */
	public String getSen() {
		return sen;
	}
	/**
	 * @param sen the sen to set
	 */
	public void setSen(String sen) {
		this.sen = sen;
	}
	/**
	 * @return the nbre
	 */
	public Integer getNbre() {
		return nbre;
	}
	/**
	 * @param nbre the nbre to set
	 */
	public void setNbre(Integer nbre) {
		this.nbre = nbre;
	}
	/**
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BalancedAccEntryDto [dco=" + dco + ", uti=" + uti + ", ope=" + ope + ", sen=" + sen + ", nbre=" + nbre
				+ ", total=" + total + "]";
	}
	
}
