package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Sexes
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum Sex {

	/**
	 * Male
	 */
	M("M"),
	
	/**
	 * Female
	 */
	F("F");
	

	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Sexes
	 */
	private static final List<Sex> values = new ArrayList<Sex>();
	
	static {
		
		// On ajoute
		values.add(Sex.M);
		values.add(Sex.F);
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private Sex(String value) {
		
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
