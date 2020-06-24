package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Periodicites
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum Periodicity {
	
	/**
	 * Journalier
	 */
	Daily("Daily"),
	
	/**
	 * Hebdomadaire
	 */
	Weekly("Weekly"),
	
	/**
	 * Mensuel
	 */
	Monthly("Monthly"),

	/**
	 * Annual
	 */
	Annually("Annually"),

	/**
	 * BiAnnually
	 */
	BiAnnually("BiAnnually"),
	
	/**
	 * Trimestriel
	 */
	Quaterly("Quaterly");
	
	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Langues disponibles
	 */
	private static final List<Periodicity> values = new ArrayList<Periodicity>();
	
	static {
		
		// On ajoute
		values.add(Periodicity.Daily);
		values.add(Periodicity.Weekly);
		values.add(Periodicity.Monthly);
		values.add(Periodicity.Quaterly);
		values.add(Periodicity.Annually);
		values.add(Periodicity.BiAnnually);
		
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private Periodicity(String value) {
		
		// Initialisation de la valeur
		this.value = value;
	}

	/**
	 * Obtention de la valeur 
	 * @return	Valeur 
	 */
	public String value() {
        return value;
    }
	
	public String getValue() {
        return value;
    }
	
	/**
	 * Methode d'obtention des periodicites
	 * @return	Liste des periodicites disponibles
	 */
	public static List<Periodicity> getPeriodicities() {
		
		// On retourne la liste
		return values;
		
	}
	
}
