/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Beneficaire materialise par l'entite WebBenef
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 07 Nov 2017
 */
@SuppressWarnings("serial")
public class WebBenefDto implements Serializable {

	/**
	 * Default COnstructor
	 */
	public WebBenefDto() {}
	/**
	 * Nom du beneficiaire
	 */
	private String name;
	/**
	 * N� du compte bancaire
	 */
	private String accountNo;
	/**
	 * Devise du Compte
	 */
	private String currency;
	/**
	 * @param name Nom du beneficiaire
	 * @param accountNo N� de compte bancaire
	 * @param cuurency Devise du compte
	 */
	public WebBenefDto(String name, String accountNo, String cuurency) {
		super();
		this.name = name;
		this.accountNo = accountNo;
		this.currency = cuurency;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}
	/**
	 * @return the cuurency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * @param cuurency the cuurency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "WebBenefDto [name=" + name + ", accountNo=" + accountNo + ", currency=" + currency + "]";
	}
	
}
