/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import afb.fintech.Enums.Periodicity;
import afb.fintech.Enums.Status;


/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Ordre de Virement
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 22 Jan. 2018
 */
@SuppressWarnings("serial")
public class TrfOrderDto implements Serializable {

	/**
	 * Default Constructor
	 */
	public TrfOrderDto() {}
	
	/**
	 * Order Id
	 */
	private String orderId;
	/**
	 * Order Date
	 */
	private String orderDate;
	/**
	 * Transfer Order Amount
	 */
	private BigDecimal amount;
	/**
	 * Periodicity
	 */
	private Periodicity periodicity;
	/**
	 * Sender Account Number
	 */
	private String fromAccount;
	/**
	 * Beneficiary Account Number
	 */
	private String toAccount;
	/**
	 * Beneficiary Name
	 */
	private String benefName;
	/**
	 * Start Date
	 */
	private String startDate;
	/**
	 * End Date
	 */
	private String endDate;
	/**
	 * Order Status
	 */
	private Status status;
	
	/**
	 * @param orderId
	 * @param orderDate
	 * @param amount
	 * @param periodicity
	 * @param fromAccount
	 * @param toAccount
	 * @param benefName
	 * @param startDate
	 * @param endDate
	 */
	public TrfOrderDto(String orderId, String orderDate, BigDecimal amount, Periodicity periodicity, String fromAccount,
			String toAccount, String benefName, String startDate, String endDate, Status status) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.amount = amount;
		this.periodicity = periodicity;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.benefName = benefName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	/**
	 * @return the periodicity
	 */
	public Periodicity getPeriodicity() {
		return periodicity;
	}

	/**
	 * @param periodicity the periodicity to set
	 */
	public void setPeriodicity(Periodicity periodicity) {
		this.periodicity = periodicity;
	}

	/**
	 * @return the fromAccount
	 */
	public String getFromAccount() {
		return fromAccount;
	}

	/**
	 * @param fromAccount the fromAccount to set
	 */
	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	/**
	 * @return the toAccount
	 */
	public String getToAccount() {
		return toAccount;
	}

	/**
	 * @param toAccount the toAccount to set
	 */
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	/**
	 * @return the benefName
	 */
	public String getBenefName() {
		return benefName;
	}

	/**
	 * @param benefName the benefName to set
	 */
	public void setBenefName(String benefName) {
		this.benefName = benefName;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TrfOrderDto [orderId=" + orderId + ", orderDate=" + orderDate + ", amount=" + amount + ", periodicity="
				+ periodicity + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", benefName=" + benefName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", status=" + status + "]";
	}
	
}
