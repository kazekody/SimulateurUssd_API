package afb.fintech.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet compte materialise par l'entite Account
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 22 Oct 2017
 */
@SuppressWarnings("serial")
public class AccountDto implements Serializable {
	/**
	 * No de COmpte (au format [CODE_BANQUE]-[CODE_GUICHET]-[NUM_COMPTE]-[CLE])
	 */
	private String accNo;
	/**
	 * Solde du Compte
	 */
	private BigDecimal balance;
	/**
	 * Date de creation (FOrmat yyyy-MM-dd)
	 */
	private String createDate;
	/**
	 * Titulaire du compte
	 */
	private String owner;
	/**
	 * Type de COmpte
	 */
	private String accType;
	/**
	 * Devise du Compte (COde ISO de la devise)
	 */
	private String currency;
	/**
	 * Agence du Compte
	 */
	private BranchDto branch;
	/**
	 * Code Pays
	 */
	private String countryCode = "CMR";

	private List<AccMandatoryDto> mandataries = new ArrayList<AccMandatoryDto>();
	
	/**
	 * Default COnstructor
	 */
	public AccountDto() {
		super();
	}
	/**
	 * @param accNo = No de Compte
	 * @param balance = Solde
	 * @param createDate = Date de creation (yyyy-MM-dd)
	 * @param owner = Titulaire
	 * @param accType = Type de compte
	 * @param currency = Devise
	 */
	public AccountDto(String accNo, BigDecimal balance, String createDate, String owner, String accType, String currency) {
		super();
		this.accNo = accNo;
		this.balance = balance;
		this.createDate = createDate;
		this.owner = owner;
		this.accType = accType;
		this.currency = currency;
	}
	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}
	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}
	/**
	 * @return the createDate
	 */
	public String getCreateDate() {
		return createDate;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @return the accType
	 */
	public String getAccType() {
		return accType;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @param accType the accType to set
	 */
	public void setAccType(String accType) {
		this.accType = accType;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the branch
	 */
	public BranchDto getBranch() {
		return branch;
	}
	/**
	 * @param branch the branch to set
	 */
	public void setBranch(BranchDto branch) {
		this.branch = branch;
	}
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	/**
	 * @return the mandataries
	 */
	public List<AccMandatoryDto> getMandataries() {
		return mandataries;
	}
	/**
	 * @param mandataries the mandataries to set
	 */
	public void setMandataries(List<AccMandatoryDto> mandataries) {
		this.mandataries = mandataries;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AccountDto [accNo=" + accNo + ", balance=" + balance + ", createDate=" + createDate + ", owner=" + owner
				+ ", accType=" + accType + ", currency=" + currency + ", branch=" + branch + ", countryCode="
				+ countryCode + "]";
	}

}
