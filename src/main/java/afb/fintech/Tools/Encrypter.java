/**
 * 
 */
package afb.fintech.Tools;

import java.security.MessageDigest;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * Implementation de l'Interface Responsable du chiffrement et du dechiffrement
 * @author ETUNE NGI Jean-Jacques
 * @version V1
 */
@SuppressWarnings("restriction")
public class Encrypter {

	/**
	 *  Le cipher
	 */
	private Cipher cipher;
	
	/**
	 *  Le Digester
	 */
	private MessageDigest digester;
	
	/**
	 * Instance unique de l'Encrypter
	 */
	private static Encrypter _instance = null;
	
	
	
	/**
	 * Constructeur prive
	 */
	public Encrypter(){
		
		try {
			
			// Initialisation du Digester
			digester = MessageDigest.getInstance("MD5");
			
			// Initialisation du Cipher
			cipher = Cipher.getInstance("DES");
			
		} catch (Exception e) {
			
			// On relance l'exception
			//throw new RuntimeException(e);
			e.printStackTrace();

		}
	}
	
	/**
	 * Factory de l'Encrypter
	 * @return	Encrypter
	 */
	public synchronized static Encrypter getInstance() {
		
		// Si l'instance est nulle
		if(_instance == null) {
			
			// Instanciation
			_instance = new Encrypter();
		}
		
		// On retourne l'instance
		return _instance;
	}
	
	
	/**
	 * Methode de decryptage d'un texte
	 * @param text	Texte a decrypter
	 * @return	Texte decrypte
	 */
	public synchronized String decryptText(String text) {
		
		try {
			
			// Mise en mode Decrypt
			cipher.init(Cipher.DECRYPT_MODE, this.createDESSecretKey(stringKey));
			
			// Obtention des bytes
			byte[] encodedByteText = new BASE64Decoder().decodeBuffer(text);
			
			// Decryption
			byte[] byteText = cipher.doFinal(encodedByteText);
			
			// Retour de la chaine
			return new String(byteText);

		} catch (Exception e) {
			
			// On relance l'exception
			//throw new RuntimeException(e);
			e.printStackTrace();
			return null;

		}		
	}

	/**
	 * Methode d'encryptage d'un texte
	 * @param text	Texte a encrypter
	 * @return	Texte encrypte
	 */
	public synchronized String encryptText(String text) {
		
		try {
			// Mise en mode Encrypt
			cipher.init(Cipher.ENCRYPT_MODE, this.createDESSecretKey(stringKey));
			
			// Obtention des bytes
			byte[] byteText = text.getBytes();
			
			// Encodage
			byte[] encodedByteText = cipher.doFinal(byteText);
			
			// Retour de la chaine encodee
			return new BASE64Encoder().encode(encodedByteText);

		} catch (Exception e) {
			
			// On relance l'exception
			//throw new RuntimeException(e);
			e.printStackTrace();
			return null;

		}		
	}

	/**
	 * Methode de hachage d'un texte
	 * @param text	Texte a hacher
	 * @return	Texte hach�
	 */
	public synchronized String hashText(String text) {
		
		// Hachage du texte
		return new BASE64Encoder().encode(digester.digest(text.getBytes()));
	}
	
	/**
	 * Methode de generation de cle prives sur la base d'un mot de passe
	 */
	private SecretKey createDESSecretKey(String keytext){
		
		try {
			
			// Generation de la cle DES bas�es sur une mot de passe
			DESKeySpec desKeySpec = new DESKeySpec(keytext.getBytes());
			
			// On retourne la cle DES
			return SecretKeyFactory.getInstance("DES").generateSecret(desKeySpec);

		} catch (Exception e) {
			
			// On relance l'exception
			//throw new RuntimeException(e);
			e.printStackTrace();
			return null;
			
		}
	}

	/**
	 *  La cle de cryptage
	 */
	private String stringKey = "samurai2017";
	
}
