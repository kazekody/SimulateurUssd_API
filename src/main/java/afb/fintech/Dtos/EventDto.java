/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;


import afb.fintech.Enums.Status;


/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet de type Evenement
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 11 Dec. 2017
 */
@SuppressWarnings("serial")
public class EventDto implements Serializable {

	/**
	 * Default COnstructor
	 */
	public EventDto() {}
	/**
	 * No de l'evenement
	 */
	private String eventNo;
	/**
	 * Date
	 */
	private String eventDate;
	/**
	 * Amount
	 */
	private Double amount = 0d;
	/**
	 * FRais
	 */
	private Double fees = 0d;
	/**
	 * Status
	 */
	private Status status = Status.Cancel;
	/**
	 * Branch
	 */
	private String branchCode;
	/**
	 * Account No
	 */
	private String accountNo;
	/**
	 * Reason
	 */
	private String reason;
	/**
	 * Operation Code
	 */
	private String opeCode;
	/**
	 * Operation title
	 */
	private String opeTitle;
	/**
	 * Customer Id
	 */
	private String custId;
	/**
	 * Customer Name
	 */
	private String custName;
	/**
	 * Nom du beneficiaire
	 */
	private String recipientName;
	/**
	 * Numero de compte du beneficiaire
	 */
	private String recipientAccount;
	
	
	private Long trxId;
	/**
	 * @param eventNo
	 * @param eventDate
	 * @param amount
	 * @param status
	 * @param branchCode
	 * @param accountNo
	 * @param reason
	 * @param opeCode
	 * @param opeTitle
	 * @param custId
	 * @param custName
	 */
	public EventDto(String eventNo, String eventDate, Double amount, Status status, String branchCode, String accountNo,
			String reason, String opeCode, String opeTitle, String custId, String custName, Double fees, String recipientName, String recipientAccount, Long trxId) {
		super();
		this.eventNo = eventNo;
		this.eventDate = eventDate;
		this.amount = amount;
		this.status = status;
		this.branchCode = branchCode;
		this.accountNo = accountNo;
		this.reason = reason;
		this.opeCode = opeCode;
		this.opeTitle = opeTitle;
		this.custId = custId;
		this.custName = custName;
		this.fees = fees;
		this.recipientName = recipientName;
		this.recipientAccount = recipientAccount;
		this.trxId = trxId;
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
	 * @return the eventDate
	 */
	public String getEventDate() {
		return eventDate;
	}
	/**
	 * @param eventDate the eventDate to set
	 */
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
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
	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}
	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the opeCode
	 */
	public String getOpeCode() {
		return opeCode;
	}
	/**
	 * @param opeCode the opeCode to set
	 */
	public void setOpeCode(String opeCode) {
		this.opeCode = opeCode;
	}
	/**
	 * @return the opeTitle
	 */
	public String getOpeTitle() {
		return opeTitle;
	}
	/**
	 * @param opeTitle the opeTitle to set
	 */
	public void setOpeTitle(String opeTitle) {
		this.opeTitle = opeTitle;
	}
	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the fees
	 */
	public Double getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(Double fees) {
		this.fees = fees;
	}
	/**
	 * @return the recipientName
	 */
	public String getRecipientName() {
		return recipientName;
	}
	/**
	 * @param recipientName the recipientName to set
	 */
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	/**
	 * @return the recipientAccount
	 */
	public String getRecipientAccount() {
		return recipientAccount;
	}
	/**
	 * @param recipientAccount the recipientAccount to set
	 */
	public void setRecipientAccount(String recipientAccount) {
		this.recipientAccount = recipientAccount;
	}
	
	
	public Long getTrxId() {
		return trxId;
	}
	
	public void setTrxId(Long trxId) {
		this.trxId = trxId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EventDto [eventNo=" + eventNo + ", eventDate=" + eventDate + ", amount=" + amount + ", fees=" + fees
				+ ", status=" + status + ", branchCode=" + branchCode + ", accountNo=" + accountNo + ", reason="
				+ reason + ", opeCode=" + opeCode + ", opeTitle=" + opeTitle + ", custId=" + custId + ", custName="
				+ custName + ", recipientName=" + recipientName + ", recipientAccount=" + recipientAccount + ", trxId="
				+ trxId + "]";
	}

	
}
