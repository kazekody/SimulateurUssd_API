/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation d'un Mandataire
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 04 Jan. 2019
 */
@SuppressWarnings("serial")
public class AccMandatoryDto implements Serializable {

	private PersonDto person;
	private AccountDto account;
	private Double maxAmount;
	
	/**
	 * Default Constructor
	 */
	public AccMandatoryDto() {}

	/**
	 * @param person
	 * @param account
	 * @param maxAmount
	 */
	public AccMandatoryDto(PersonDto person, AccountDto account, Double maxAmount) {
		super();
		this.person = person;
		this.account = account;
		this.maxAmount = maxAmount;
	}

	/**
	 * @return the person
	 */
	public PersonDto getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(PersonDto person) {
		this.person = person;
	}

	/**
	 * @return the account
	 */
	public AccountDto getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(AccountDto account) {
		this.account = account;
	}

	/**
	 * @return the maxAmount
	 */
	public Double getMaxAmount() {
		return maxAmount;
	}

	/**
	 * @param maxAmount the maxAmount to set
	 */
	public void setMaxAmount(Double maxAmount) {
		this.maxAmount = maxAmount;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccMandatoryDto [person=" + person + ", account=" + account + ", maxAmount=" + maxAmount + "]";
	}

}
