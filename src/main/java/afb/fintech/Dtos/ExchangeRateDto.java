/**
 * 
 */
package afb.fintech.Dtos;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Patron de conception (DTO) utilise pour la transformation de l'objet Taux de Change 
 * @author <a href="mailto:francis_djiomou@afrilandfirstbank.com">Francis DJIOMOU (First Bank Project Engineer and Research)</a>
 * @since 07 Nov. 2017
 */
@SuppressWarnings("serial")
public class ExchangeRateDto implements Serializable {

	/**
	 * Default Constructor
	 */
	public ExchangeRateDto() {}
	
	/**
	 * Devise
	 */
	private CurrencyDto currency;
	/**
	 * Prix d'achat de la devise pour la client
	 * Prix de vente de la devise pour la banque
	 */
	private BigDecimal achat;
	/**
	 * Prix de vente de la devise pour le client
	 * Prix d'achat de la devise pour la banque
	 */
	private BigDecimal vente;
	/**
	 * Valeur du cours de la devise par rapport a la devise nationale
	 */
	private BigDecimal cours;
	/**
	 * Date
	 */
	private String date;
	
	/**
	 * @return the currency
	 */
	public CurrencyDto getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(CurrencyDto currency) {
		this.currency = currency;
	}
	/**
	 * @param currency Devise
	 * @param rate Taux de change
	 */
	public ExchangeRateDto(CurrencyDto currency, BigDecimal achat, BigDecimal vente, BigDecimal cours, String date) {
		super();
		this.currency = currency;
		this.achat = achat;
		this.vente = vente;
		this.cours = cours;
		this.date = date;
	}
	/**
	 * @return the achat
	 */
	public BigDecimal getAchat() {
		return achat;
	}
	/**
	 * @return the vente
	 */
	public BigDecimal getVente() {
		return vente;
	}
	/**
	 * @return the cours
	 */
	public BigDecimal getCours() {
		return cours;
	}
	/**
	 * @param achat the achat to set
	 */
	public void setAchat(BigDecimal achat) {
		this.achat = achat;
	}
	/**
	 * @param vente the vente to set
	 */
	public void setVente(BigDecimal vente) {
		this.vente = vente;
	}
	/**
	 * @param cours the cours to set
	 */
	public void setCours(BigDecimal cours) {
		this.cours = cours;
	}
	
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExchangeRateDto [currency=" + currency + ", achat=" + achat + ", vente=" + vente + ", cours=" + cours
				+ ", date=" + date + "]";
	}

}
