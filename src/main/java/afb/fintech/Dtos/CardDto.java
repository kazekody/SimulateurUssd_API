/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Carte Bancaire materialise par l'entite <b>Card</b>
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 03 Nov. 2017
 */
@SuppressWarnings("serial")
public class CardDto implements Serializable {

	/**
	 * Default COnstructor
	 */
	public CardDto() {}
	/**
	 * N� de la carte bancaire
	 */
	private String cardNo;
	/**
	 * Type de Carte
	 */
	private String cardType;
	/**
	 * Solde de la carte
	 */
	private BigDecimal balance;
	/**
	 * Nom inscrit sur la carte
	 */
	private String name;
	/**
	 * Date d'expiration
	 */
	private String expDate;
	/**
	 * @param cardNo
	 * @param cardType
	 * @param balance
	 * @param name
	 * @param expDate
	 */
	public CardDto(String cardNo, String cardType, BigDecimal balance, String name, String expDate) {
		super();
		this.cardNo = cardNo;
		this.cardType = cardType;
		this.balance = balance;
		this.name = name;
		this.expDate = expDate;
	}
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}
	/**
	 * @return the balance
	 */
	public BigDecimal getBalance() {
		return balance;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the expDate
	 */
	public String getExpDate() {
		return expDate;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CardDto [cardNo=" + cardNo + ", cardType=" + cardType + ", balance=" + balance + ", name=" + name
				+ ", expDate=" + expDate + "]";
	}
	
}
