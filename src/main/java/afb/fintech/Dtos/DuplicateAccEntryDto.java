/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;
import java.util.Date;

/**
 * Objet utilise pour controler les Doublons dans les rapports de comptabilisation
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 13 Mar 2018
 */
@SuppressWarnings("serial")
public class DuplicateAccEntryDto implements Serializable {
	
	/**
	 * Date Comptable
	 */
	private Date dco;
	
	/**
	 * Code Agence
	 */
	private String age;
	/**
	 * COde Devise
	 */
	private String dev;
	/**
	 * Numero de Compte
	 */
	private String ncp; 
	/**
	 * Code Operation
	 */
	private String ope;
	/**
	 * Code Evenement
	 */
	private String eve; 
	/**
	 * Numero de Piece
	 */
	private String pie;
	/**
	 * Libelle de l'ecriture
	 */
	private String lib;
	/**
	 * Montant
	 */
	private Double mon;
	/**
	 * Sens
	 */
	private String sen;
	/**
	 * Nbre de Lignes
	 */
	private Integer nbre;
	
	/**
	 * 
	 */
	public DuplicateAccEntryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param age
	 * @param dev
	 * @param ncp
	 * @param ope
	 * @param eve
	 * @param pie
	 * @param lib
	 * @param mon
	 * @param sen
	 * @param nbre
	 */
	public DuplicateAccEntryDto(Date dco, String age, String dev, String ncp, String ope, String eve, String pie, String lib, Double mon,
			String sen, Integer nbre) {
		super();
		this.dco = dco;
		this.age = age;
		this.dev = dev;
		this.ncp = ncp;
		this.ope = ope;
		this.eve = eve;
		this.pie = pie;
		this.lib = lib;
		this.mon = mon;
		this.sen = sen;
		this.nbre = nbre;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the dev
	 */
	public String getDev() {
		return dev;
	}
	/**
	 * @param dev the dev to set
	 */
	public void setDev(String dev) {
		this.dev = dev;
	}
	/**
	 * @return the ncp
	 */
	public String getNcp() {
		return ncp;
	}
	/**
	 * @param ncp the ncp to set
	 */
	public void setNcp(String ncp) {
		this.ncp = ncp;
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
	 * @return the eve
	 */
	public String getEve() {
		return eve;
	}
	/**
	 * @param eve the eve to set
	 */
	public void setEve(String eve) {
		this.eve = eve;
	}
	/**
	 * @return the pie
	 */
	public String getPie() {
		return pie;
	}
	/**
	 * @param pie the pie to set
	 */
	public void setPie(String pie) {
		this.pie = pie;
	}
	/**
	 * @return the lib
	 */
	public String getLib() {
		return lib;
	}
	/**
	 * @param lib the lib to set
	 */
	public void setLib(String lib) {
		this.lib = lib;
	}
	/**
	 * @return the mon
	 */
	public Double getMon() {
		return mon;
	}
	/**
	 * @param mon the mon to set
	 */
	public void setMon(Double mon) {
		this.mon = mon;
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
	 * @return the dco
	 */
	public Date getDco() {
		return dco;
	}
	/**
	 * @param dco the dco to set
	 */
	public void setDco(Date dco) {
		this.dco = dco;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DuplicateAccEntryDto [dco=" + dco + ", age=" + age + ", dev=" + dev + ", ncp=" + ncp + ", ope=" + ope
				+ ", eve=" + eve + ", pie=" + pie + ", lib=" + lib + ", mon=" + mon + ", sen=" + sen + ", nbre=" + nbre
				+ "]";
	}
	
}
