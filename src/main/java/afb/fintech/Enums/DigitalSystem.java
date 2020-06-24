package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Systemes Digitaux
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum DigitalSystem {
	
	/**
	 * Mobile Banking
	 */
	MobileBanking("MobileBanking"),
	
	/**
	 * Mobile Wallet
	 */
	MobileWallet("MobileWallet"),
	
	/**
	 * Agent Banking SYstem
	 */
	AgentBanking("AgentBanking"),

	/**
	 * Kiosk
	 */
	KioskBanking("KioskBanking"),
	
	/**
	 * Application Back-Office
	 */
	FintechBO("FintechBO"),

	/**
	 * Application Back-Office NanoBNK
	 */
	NanoBNKBO("NanoBNKBO");
	
	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Systemes
	 */
	private static final List<DigitalSystem> systems = new ArrayList<DigitalSystem>();
	
	static {
		
		// On ajoute
		systems.add(DigitalSystem.MobileBanking);
		systems.add(DigitalSystem.MobileWallet);
		systems.add(DigitalSystem.AgentBanking);
		systems.add(DigitalSystem.KioskBanking);
		systems.add(DigitalSystem.FintechBO);
		systems.add(DigitalSystem.NanoBNKBO);
		
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private DigitalSystem(String value) {
		
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
	public static List<DigitalSystem> enabledLanguages() {
		
		// On retourne la liste
		return systems;
		
	}
	
}
