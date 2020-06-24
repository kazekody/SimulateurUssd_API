package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Operateurs necessaire
 * @author Nacis DJIOMOU
 * @version 1.0
 */
public enum MathOperator {

	/**
	 * Operateur maximum
	 */
	MAXIMUM("MAXIMUM"),
	
	/**
	 * Operateur minimum
	 */
	MINIMUM("MINIMUM"),

	/**
	 * Operateur moyenne
	 */
	MOYENNE("MOYENNE"),
	
	/**
	 * Operateur somme
	 */
	SOMME("SOMME");
	

	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Systemes
	 */
	private static final List<MathOperator> values = new ArrayList<MathOperator>();
	
	static {
		
		// On ajoute
		values.add(MathOperator.MAXIMUM);
		values.add(MathOperator.MINIMUM);
		values.add(MathOperator.MOYENNE);
		values.add(MathOperator.SOMME);
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private MathOperator(String value) {
		
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
