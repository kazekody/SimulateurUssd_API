/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Banque materialise par l'entite <b>XXXXX</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class BankDto implements Serializable {
	/**
	 * Code Banque
	 */
	private String bankCode;
	/**
	 * Nom de la banque
	 */
	private String bankName;

	/**
	 * Default COnstructor
	 */
	public BankDto() {}

	/**
	 * @param bankCode = Code Banque
	 * @param bankName = Nom de la Banque
	 */
	public BankDto(String bankCode, String bankName) {
		super();
		this.bankCode = bankCode;
		this.bankName = bankName;
	}

	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankDto [bankCode=" + bankCode + ", bankName=" + bankName + "]";
	}

}
