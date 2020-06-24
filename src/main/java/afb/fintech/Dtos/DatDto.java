/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet DAT materialise par l'entite <b>DAT</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class DatDto implements Serializable {
	/**
	 * N� du DAT
	 */
	private String datNo;
	/**
	 * Montant
	 */
	private BigDecimal amt;
	/**
	 * Date de souscription
	 */
	private String date;
	/**
	 * Echeance du bon de caisse
	 */
	private String endDate;
	/**
	 * Taux d'interet
	 */
	private BigDecimal rate;
	/**
	 * Statut du Bon de Caisse
	 */
	private String status;
	/**
	 * Montant des interets
	 */
	private BigDecimal interest;
	/**
	 * Montant des interets deja Payes
	 */
	private BigDecimal interestPaid;
	/**
	 * N� de Compte
	 */
	private String accNo;
	/**
	 * Default COnstructor
	 */
	public DatDto() {}

	/**
	 * @param cvNo = N� du DAT
	 * @param accNo = N� de Compte
	 * @param amt = Montant
	 * @param date = Date de souscription
	 * @param endDate = Echeance
	 * @param rate = Taux d'interet
	 * @param status = Statut
	 * @param interest = MOntant total des interets
	 * @param interestPaid = Total des interets deja verses
	 */
	public DatDto(String cvNo, BigDecimal amt, String date, String endDate, BigDecimal rate, String status,
			BigDecimal interest, BigDecimal interestPaid, String accNo) {
		super();
		this.datNo = cvNo;
		this.amt = amt;
		this.date = date;
		this.endDate = endDate;
		this.rate = rate;
		this.status = status;
		this.interest = interest;
		this.interestPaid = interestPaid;
		this.accNo = accNo;
	}

	/**
	 * @return the cvNo
	 */
	public String getDatNo() {
		return datNo;
	}

	/**
	 * @return the amt
	 */
	public BigDecimal getAmt() {
		return amt;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @return the rate
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the interest
	 */
	public BigDecimal getInterest() {
		return interest;
	}

	/**
	 * @return the interestPaid
	 */
	public BigDecimal getInterestPaid() {
		return interestPaid;
	}

	/**
	 * @param datNo the datNo to set
	 */
	public void setDatNo(String datNo) {
		this.datNo = datNo;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

	/**
	 * @param interestPaid the interestPaid to set
	 */
	public void setInterestPaid(BigDecimal interestPaid) {
		this.interestPaid = interestPaid;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DatDto [datNo=" + datNo + ", amt=" + amt + ", date=" + date + ", endDate=" + endDate + ", rate=" + rate
				+ ", status=" + status + ", interest=" + interest + ", interestPaid=" + interestPaid + ", accNo="
				+ accNo + "]";
	}

}
