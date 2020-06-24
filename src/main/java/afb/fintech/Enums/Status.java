package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Systemes Digitaux
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum Status {

	/**
	 * Transaction Valid
	 */
	Valid("Valid"),
	
	/**
	 * Transaction Awaiting
	 */
	Waiting("Waiting"),

	/**
	 * Transaction Failed
	 */
	Failed("Failed"),
	
	/**
	 * Transaction Cancelled
	 */
	Cancel("Cancel");
	

	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Systemes
	 */
	private static final List<Status> values = new ArrayList<Status>();
	
	static {
		
		// On ajoute
		values.add(Status.Valid);
		values.add(Status.Waiting);
		values.add(Status.Cancel);
		values.add(Status.Failed);
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private Status(String value) {
		
		// Initialisation de la valeur
		this.value = value;
	}

	/**
	 * Obtention de la valeur de l'etat
	 * @return	Valeur de l'etat
	 */
	public String value() {
        return value;
    }
	
	public String getValue() {
        return value;
    }
	
}
