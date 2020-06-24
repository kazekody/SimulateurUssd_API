/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Demande de CHequier materialise par l'entite <b>ChequeDemand</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 24 Oct 2017
 */
@SuppressWarnings("serial")
public class ChequeDemandDto implements Serializable {

	/**
	 * N� de la demande de chequier
	 */
	private String demandNo;
	/**
	 * Date de la demande de chequier
	 */
	private String dmdDate;
	/**
	 * N� de Compte
	 */
	private String accNo;
	/**
	 * Nbre de Carnet demandes
	 */
	private Integer nbBook;
	/**
	 * Type de carnet Demandes
	 */
	private String bookType;
	/**
	 * Statut de la demande
	 */
	private String status;

	/**
	 * Default Constructor
	 */
	public ChequeDemandDto() {}

	/**
	 * @param demandNo = N� de la demande de chequier
	 * @param dmdDate = Date de la demande
	 * @param accNo = N� de compte
	 * @param nbBook = Nbre de carnets
	 * @param bookType = Type de carnets
	 * @param status = Etat de la demande
	 */
	public ChequeDemandDto(String demandNo, String dmdDate, String accNo, Integer nbBook, String bookType,
			String status) {
		super();
		this.demandNo = demandNo;
		this.dmdDate = dmdDate;
		this.accNo = accNo;
		this.nbBook = nbBook;
		this.bookType = bookType;
		this.status = status;
	}

	/**
	 * @return the demandNo
	 */
	public String getDemandNo() {
		return demandNo;
	}

	/**
	 * @return the dmdDate
	 */
	public String getDmdDate() {
		return dmdDate;
	}

	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @return the nbBook
	 */
	public Integer getNbBook() {
		return nbBook;
	}

	/**
	 * @return the bookType
	 */
	public String getBookType() {
		return bookType;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param demandNo the demandNo to set
	 */
	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}

	/**
	 * @param dmdDate the dmdDate to set
	 */
	public void setDmdDate(String dmdDate) {
		this.dmdDate = dmdDate;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	/**
	 * @param nbBook the nbBook to set
	 */
	public void setNbBook(Integer nbBook) {
		this.nbBook = nbBook;
	}

	/**
	 * @param bookType the bookType to set
	 */
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ChequeDemandDto [demandNo=" + demandNo + ", dmdDate=" + dmdDate + ", accNo=" + accNo + ", nbBook="
				+ nbBook + ", bookType=" + bookType + ", status=" + status + "]";
	}

}
