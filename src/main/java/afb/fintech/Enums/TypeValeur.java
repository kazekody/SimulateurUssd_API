package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Types de valeurs pour le parametrage des commissions
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum TypeValeur {

	/**
	 * Forfait
	 */
	Forfait("Forfait"),
	
	/**
	 * Taux
	 */
	Taux("Taux"),

	/**
	 * Taux_Par_Paliers
	 */
	Taux_Par_Paliers("Taux_Par_Paliers"),
	
	/**
	 * Forfait_Par_Paliers
	 */
	Forfait_Par_Paliers("Forfait_Par_Paliers");
	

	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Systemes
	 */
	private static final List<TypeValeur> values = new ArrayList<TypeValeur>();
	
	static {
		
		// On ajoute
		values.add(TypeValeur.Forfait);
		values.add(TypeValeur.Taux);
		values.add(TypeValeur.Forfait_Par_Paliers);
		values.add(TypeValeur.Taux_Par_Paliers);
		
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private TypeValeur(String value) {
		
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
