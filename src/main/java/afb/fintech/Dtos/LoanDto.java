/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Credit materialise par l'entite <b>Loan</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class LoanDto implements Serializable {

	/**
	 * N� du Pret
	 */
	private String loanNo;
	/**
	 * Montant du Pret
	 */
	private BigDecimal amt;
	/**
	 * Taux d'interet
	 */
	private BigDecimal rate;
	/**
	 * Date de mise en Place (au format yyyy-MM-dd)
	 */
	private String startDate;
	/**
	 * Date de Fin (au format yyyy-MM-dd)
	 */
	private String endDate;
	/**
	 * Capital restant (capital + interets + taxes)
	 * Montant total restant a payer
	 */
	private BigDecimal remaining;
	/**
	 * Statut du Pret (En Etude, Valid�, D�bloqu�, Clotur�)
	 */
	private String status;
	/**
	 * Date de la Prochaine echeance (au format yyyy-MM-dd)
	 */
	private String nextInstallmentDate;
	/**
	 * Montant des Impayes (capital + interet + taxes + penalit�)
	 * Montant total des echeances impayees
	 */
	private BigDecimal outstanding;
	/**
	 * Montant des Penalites
	 */
	private BigDecimal penalty;

	/**
	 * Default COnstructor
	 */
	public LoanDto() {}

	/**
	 * @param loanNo = N� du Pret
	 * @param amt = Montant Accorde
	 * @param rate = Taux d'interet
	 * @param startDate = Date de mise en place
	 * @param endDate = Date de Fin
	 * @param remaining = Capital restant
	 * @param status = Statut du Pret
	 * @param nextInstallmentDate = Date de la prochaine echeance
	 * @param outstanding = Montant des impayes
	 */
	public LoanDto(String loanNo, BigDecimal amt, BigDecimal rate, String startDate, String endDate,
			BigDecimal remaining, String status, String nextInstallmentDate, BigDecimal outstanding) {
		super();
		this.loanNo = loanNo;
		this.amt = amt;
		this.rate = rate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.remaining = remaining;
		this.status = status;
		this.nextInstallmentDate = nextInstallmentDate;
		this.outstanding = outstanding;
	}

	/**
	 * @return the loanNo
	 */
	public String getLoanNo() {
		return loanNo;
	}

	/**
	 * @return the amt
	 */
	public BigDecimal getAmt() {
		return amt;
	}

	/**
	 * @return the rate
	 */
	public BigDecimal getRate() {
		return rate;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @return the remaining
	 */
	public BigDecimal getRemaining() {
		return remaining;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the nextInstallmentDate
	 */
	public String getNextInstallmentDate() {
		return nextInstallmentDate;
	}

	/**
	 * @return the impay�s
	 */
	public BigDecimal getOutstanding() {
		return outstanding;
	}

	/**
	 * @param loanNo the loanNo to set
	 */
	public void setLoanNo(String loanNo) {
		this.loanNo = loanNo;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	/**
	 * @param rate the rate to set
	 */
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @param remaining the remaining to set
	 */
	public void setRemaining(BigDecimal remaining) {
		this.remaining = remaining;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param nextInstallmentDate the nextInstallmentDate to set
	 */
	public void setNextInstallmentDate(String nextInstallmentDate) {
		this.nextInstallmentDate = nextInstallmentDate;
	}

	/**
	 * @param outstanding the outstanding to set
	 */
	public void setOutstanding(BigDecimal outstanding) {
		this.outstanding = outstanding;
	}

	/**
	 * @return the penalty
	 */
	public BigDecimal getPenalty() {
		return penalty;
	}

	/**
	 * @param penalty the penalty to set
	 */
	public void setPenalty(BigDecimal penalty) {
		this.penalty = penalty;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoanDto [loanNo=" + loanNo + ", amt=" + amt + ", rate=" + rate + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", remaining=" + remaining + ", status=" + status + ", nextInstallmentDate="
				+ nextInstallmentDate + ", outstanding=" + outstanding + ", penalty=" + penalty + "]";
	}

}
