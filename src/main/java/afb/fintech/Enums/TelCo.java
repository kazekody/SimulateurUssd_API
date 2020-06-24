package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Operateurs de Telecoms
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum TelCo {
	
	/**
	 * MTN
	 */
	MTN("MTN"),
	
	/**
	 * Orange
	 */
	Orange("Orange"),
	
	/**
	 * Camtel
	 */
	Camtel("Camtel"),
	
	/**
	 * Nextell
	 */
	Nextel("Nextel");
	
	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des TELCOs
	 */
	private static final List<TelCo> telcos = new ArrayList<TelCo>();
	
	static {
		
		// On ajoute
		telcos.add(TelCo.MTN);
		telcos.add(TelCo.Orange);
		telcos.add(TelCo.Camtel);
		telcos.add(TelCo.Nextel);
		
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private TelCo(String value) {
		
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
	
	/**
	 * Methode d'obtention des systemes
	 * @return	Liste des systemes disponibles
	 */
	public static List<TelCo> enabledTelCos() {
		
		// On retourne la liste
		return telcos;
		
	}
	
}
