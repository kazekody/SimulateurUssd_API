package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des types de paiement
 * @author Franklin WOULEU
 * @version 1.0
 */
public enum PaymentType {

	/**
	 * Bill
	 */
	Bill("Type.Bill"),

	/**
	 * CashIn
	 */
	CashIn("Type.CashIn"),

	/**
	 * Merchant
	 */
	Purchase("Type.Purchase");
	
	/**
	 * Valeur de la constante 
	 */
	private final String value;
	
	/**
	 * Liste des types de facturation
	 */
	private static final List<PaymentType> values = new ArrayList<PaymentType>();
	
	static {
		
		// On ajoute
		values.add(PaymentType.Bill);
		values.add(PaymentType.CashIn);
		values.add(PaymentType.Purchase);
	}

	private PaymentType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public static List<PaymentType> getPaytype() {
		return values;
	}
	
	
}
