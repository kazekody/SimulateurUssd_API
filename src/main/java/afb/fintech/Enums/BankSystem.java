package afb.fintech.Enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Enumeration des Systemes Digitaux
 * @author Francis DJIOMOU
 * @version 1.0
 */
public enum BankSystem {
	
	/**
	 * Mobile Banking
	 */
	Amplitude("Amplitude"),
	
	/**
	 * Mobile Wallet
	 */
	SmartVista("SmartVista"),
	
	/**
	 * Agent Banking SYstem
	 */
	FirstBankPortal("FirstBankPortal"),
	
	/**
	 * Kiosk
	 */
	FlashTransfer("FlashTransfer");
	
	/**
	 * Valeur de la constante (Code)
	 */
	private final String value;
	
	/**
	 * Liste des Systemes
	 */
	private static final List<BankSystem> systems = new ArrayList<BankSystem>();
	
	static {
		
		// On ajoute
		systems.add(BankSystem.Amplitude);
		systems.add(BankSystem.SmartVista);
		systems.add(BankSystem.FirstBankPortal);
		systems.add(BankSystem.FlashTransfer);
		
	}
	
	/**
	 * Constructeur avec initialisation des parametres
	 * @param value	Valeur de l'etat
	 */
	private BankSystem(String value) {
		
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
	public static List<BankSystem> enabledLanguages() {
		
		// On retourne la liste
		return systems;
		
	}
	
}
