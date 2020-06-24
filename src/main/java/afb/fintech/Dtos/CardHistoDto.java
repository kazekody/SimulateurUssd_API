/**
 * 
 */
package afb.fintech.Dtos;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Transaction sur Carte materialise par l'entite CardTrans
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 03 Nov. 2017
 */
@SuppressWarnings("serial")
public class CardHistoDto implements Serializable {

	/**
	 * Default Constructor
	 */
	public CardHistoDto() {}
	/**
	 * No de la carte
	 */
	private String cardNo;
	/**
	 * Date de la transaction
	 */
	private String tranDate;
	/**
	 * Montant de la transaction
	 */
	private BigDecimal amount;
	/**
	 * Type de Transaction
	 */
	private String tranType;
	/**
	 * Type de Carte
	 */
	private String cardType;
	/**
	 * Sens
	 */
	private String sens;
	/**
	 * @param cardNo No de la carte
	 * @param tranDate Date de l'operation
	 * @param amount Montant de l'operation
	 * @param tranType Type d'operation
	 * @param cardType Type de carte
	 */
	public CardHistoDto(String cardNo, String tranDate, BigDecimal amount, String tranType, String cardType, String sens) {
		super();
		this.cardNo = cardNo;
		this.tranDate = tranDate;
		this.amount = amount;
		this.tranType = tranType;
		this.cardType = cardType;
		this.sens = sens;
	}
	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}
	/**
	 * @return the tranDate
	 */
	public String getTranDate() {
		return tranDate;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @return the tranType
	 */
	public String getTranType() {
		return tranType;
	}
	/**
	 * @return the cardType
	 */
	public String getCardType() {
		return cardType;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @param tranDate the tranDate to set
	 */
	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * @param tranType the tranType to set
	 */
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(String cardType) {
		this.cardType = cardType;
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
		return "CardHistoDto [cardNo=" + cardNo + ", tranDate=" + tranDate + ", amount=" + amount + ", tranType="
				+ tranType + ", cardType=" + cardType + ", sens=" + sens + "]";
	}
	
}
