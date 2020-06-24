/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la generation d'un objet de type AccountEntry au niveau du resident Amplitude
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 12 Jan 2018
 */
@SuppressWarnings("serial")
public class AccEntryDto implements Serializable {

	/**
	 * Default Constructor
	 */
	public AccEntryDto() {}
	
	/**
	 * Numero de compte complet (format [BANK_CODE]-[BRANCH_CODE]-[ACCOUNT_NO]-[KEY])
	 */
	private String accountNo;
	
	/**
	 * Identifiant de l'evenement poste dans le CBS (format [age]-[ope]-[eve])
	 */
	private String eventNo;
	
	/**
	 * Montant de l'ecriture
	 */
	private Double amount;
	
	/**
	 * Sens de l'ecriture (D=Debit/C=Credit)
	 */
	private String sens;
	
	/**
	 * Libelle de l'ecriture
	 */
	private String lib;
	
	/**
	 * Reference de l'operation
	 */
	private String ref;

	/**
	 * @param accountNo
	 * @param eventNo
	 * @param amount
	 * @param sens
	 * @param lib
	 * @param ref
	 */
	public AccEntryDto(String accountNo, String eventNo, Double amount, String sens, String lib, String ref) {
		super();
		this.accountNo = accountNo;
		this.eventNo = eventNo;
		this.amount = amount;
		this.sens = sens;
		this.lib = lib;
		this.ref = ref;
	}

	/**
	 * @return the accountNo
	 */
	public String getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the eventNo
	 */
	public String getEventNo() {
		return eventNo;
	}

	/**
	 * @param eventNo the eventNo to set
	 */
	public void setEventNo(String eventNo) {
		this.eventNo = eventNo;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the sens
	 */
	public String getSens() {
		return sens;
	}

	/**
	 * @param sens the sens to set
	 */
	public void setSens(String sens) {
		this.sens = sens;
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
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}
	
}
