/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Historique materialise par l'entite <b>Historic</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class HistoricDto implements Serializable {
	
	/**
	 * N� de COmpte  (au format [CODE_BANQUE]-[CODE_GUICHET]-[NUM_COMPTE]-[CLE])
	 */
	private String accNo;
	/**
	 * Date de l'operation (format yyyy-MM-dd)
	 */
	private String tranDate;
	/**
	 * Montant de l'operation
	 */
	private Double amt = 0d;
	/**
	 * Libelle de l'operation
	 */
	private String title;
	/**
	 * Type d'operation
	 */
	private String ope;
	/**
	 * Sens
	 */
	private String sens;
	/**
	 * Default Constructor
	 */
	public HistoricDto() {}

	/**
	 * @param accNo = No de compte
	 * @param tranDate = Date de transaction
	 * @param amt = Montant
	 * @param title = Libelle
	 * @param ope = Type operation
	 * @param sens = Sens de l'operation
	 */
	public HistoricDto(String accNo, String tranDate, Double amt, String title, String ope, String sens) {
		super();
		this.accNo = accNo;
		this.tranDate = tranDate;
		this.amt = amt;
		this.title = title;
		this.ope = ope;
		this.sens = sens;
	}

	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @return the tranDate
	 */
	public String getTranDate() {
		return tranDate;
	}

	/**
	 * @return the amt
	 */
	public Double getAmt() {
		return amt;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the ope
	 */
	public String getOpe() {
		return ope;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	/**
	 * @param tranDate the tranDate to set
	 */
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	/**
	 * @param amt the amt to set
	 */
	public void setAmt(Double amt) {
		this.amt = amt;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param ope the ope to set
	 */
	public void setOpe(String ope) {
		this.ope = ope;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HistoricDto [accNo=" + accNo + ", tranDate=" + tranDate + ", amt=" + amt + ", title=" + title + ", ope="
				+ ope + ", sens=" + sens + "]";
	}

}
