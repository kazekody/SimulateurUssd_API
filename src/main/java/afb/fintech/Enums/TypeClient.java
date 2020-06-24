package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Types de clients
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum TypeClient {

	/**
	 * Particulier
	 */
	Particulier("1.Particulier"),
	
	/**
	 * Entreprise
	 */
	Entreprise("2.Entreprise");
	

	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Systemes
	 */
	private static final List<TypeClient> values = new ArrayList<TypeClient>();
	
	static {
		values.add(TypeClient.Particulier);
		values.add(TypeClient.Entreprise);		
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private TypeClient(String value) {
		
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
