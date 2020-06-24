/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Effet de Commerce materialise par l'entite <b>Effet</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class EffectDto implements Serializable {
	/**
	 * N� de l'effet
	 */
	private String effNo;
	/**
	 * Date de Souscription
	 */
	private String effDate;
	/**
	 * Montant de l'effet
	 */
	private BigDecimal amt;
	/**
	 * N� de Compte du client
	 */
	private String accNo;
	/**
	 * N� de reference
	 */
	private String ref;

	/**
	 * Default Constructor
	 */
	public EffectDto() {}

	/**
	 * @param effNo = N� de l'effet
	 * @param effDate = Date de souscription
	 * @param amt = Montant
	 * @param accNo = N� de Compte
	 * @param ref = N� de reference
	 */
	public EffectDto(String effNo, String effDate, BigDecimal amt, String accNo, String ref) {
		super();
		this.effNo = effNo;
		this.effDate = effDate;
		this.amt = amt;
		this.accNo = accNo;
		this.ref = ref;
	}

	/**
	 * @return the effNo
	 */
	public String getEffNo() {
		return effNo;
	}

	/**
	 * @return the effDate
	 */
	public String getEffDate() {
		return effDate;
	}

	/**
	 * @return the amt
	 */
	public BigDecimal getAmt() {
		return amt;
	}

	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @return the ref
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * @param effNo the effNo to set
	 */
	public void setEffNo(String effNo) {
		this.effNo = effNo;
	}

	/**
	 * @param effDate the effDate to set
	 */
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	/**
	 * @param ref the ref to set
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EffectDto [effNo=" + effNo + ", effDate=" + effDate + ", amt=" + amt + ", accNo=" + accNo + ", ref="
				+ ref + "]";
	}

}
