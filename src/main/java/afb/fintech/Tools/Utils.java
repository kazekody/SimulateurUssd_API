/**
 * 
 */
package afb.fintech.Tools;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Gestionnaire d'utilitaires
 * @author <b>francis_djiomou@afrilandfirstbank.com</b>
 * @since Nov 2017
 * @version 1.0
 */
public class Utils {

	public static int LEFT = 1;
    public static int RIGHT = 2;
    public static String DefaultBankCode = "10005";
    public static final String NATIONAL_CURRENCY_ISO = "XAF";

    /**
     * Format de date par defaut utilise sur le wallet
     */
    public static SimpleDateFormat defaultDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    
    public static SimpleDateFormat completedDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    /**
     * Determine le nombre de jours entre 2 dates
     * @param date1 Date de debut
     * @param date2 Date de Fin
     * @return Nbre de Jours
     */
    public static long getNbreJoursBetween(Date date1, Date date2){
        if(date1 == null || date2 == null) return 0;
        return (date2.getTime() - date1.getTime()) / (long)(1000 * 60 * 60 * 24);
    }
    

    /**
     * Utilise pour fabriquer le numero d evenement (de taille lenght caracteres) lors d un virement
     */
    public static String padText(String text, int direction, int lenght, String addString ){
        
        String s = text;
        
        if(s == null){
            
            for(int i=1; i<=lenght; i++) s += addString;
            
        }else{
            
            if(s.length() < lenght){
                
                while(s.length() < lenght){
                    s = direction == LEFT ? addString + s : s + addString;
                }
                
            }
            
        }
        
        s = s.substring(0, lenght);
        
        return s;
    }
    

    public static int nbOfMonthsBetweenTwoDates(Date date1, Date date2)  {
    	
        GregorianCalendar gc1 = new GregorianCalendar();
        gc1.setTime(date1);
        GregorianCalendar gc2 = new GregorianCalendar();
        gc2.setTime(date2);
        int gap = 0;
        gc1.add(GregorianCalendar.MONTH, 1);
        while(gc1.compareTo(gc2)<=0) {
            gap++;
            gc1.add(GregorianCalendar.MONTH, 1);
        }
        return gap;
    }
 
    

	public static String cleanAndCompleteAccount(String acc) {
		if(acc == null || acc.isEmpty()) return DefaultBankCode + "-00000-00000000000-00";
		acc = acc.trim();
		String [] tab = acc.split("-");
		switch(tab.length) {
			case 1 : acc = DefaultBankCode + "-00000-" + acc + "-00"; break;
			case 2 : acc = DefaultBankCode + "-" + acc + "-00"; break;
			case 3 : acc = DefaultBankCode + "-" + acc; break;
		}
		if(acc.startsWith("00019-")) acc = acc.replaceFirst("00019", DefaultBankCode);
		
		if(acc.split("-")[3].equals("00")){
	    	// Calcul de la cle du compte
	    	Long cle = 97 - Math.floorMod((89*Integer.valueOf(acc.split("-")[0])+15*Integer.valueOf(acc.split("-")[1])+3* Long.valueOf(acc.split("-")[2]) ), 97);
	    	acc = acc.substring(0, acc.length()-2) + padText(cle.toString(), LEFT, 2, "0");
		}
		return acc;
	}
	
	public static long differenceEnMilisecondeEntre2Dates(Date date1, Date date2){
 		
 		
 		Calendar debut=Calendar.getInstance();
 		Calendar fin=Calendar.getInstance();
 		debut.setTime(date1);
 		fin.setTime(date2);
 		
 		
 		//JOptionPane.showMessageDialog(null,  "DATE COURANTE : "+dateEnd.getTime( )+"  DERNIERE CONNECTION : "+dateBegin.getTime( ));


        // Calcul de difference
        long diff = fin.getTimeInMillis() - debut.getTimeInMillis();
       
       
        return Math.round(diff);//c'est mieux de prendre la difference de temps en miliseconde
 	}
	
	public static Date getUpdateToStart(Date date) {
		
		try {
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			return sdf2.parse( sdf1.format(date) + " 00:01:01" );
			
		}catch(Exception ex) { return date;}
		
	}

	public static Date getUpdateToEnd(Date date) {
		
		try {
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			
			return sdf2.parse( sdf1.format(date) + " 23:59:59" );
			
		}catch(Exception ex) { return date;}
		
	}
	
	public static Date addDate(Date date, Integer nbJrs) {
		
		if(nbJrs == null || nbJrs == 0) return date;
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE, nbJrs);
		return cal.getTime();
	}


    /**
     * Formatte la Trace d'une Exception en Chaine de caractere
     * @param ex Exception
     * @return Texte
     */
    public static String stackTraceToString(Exception ex) {
    	
    	try {
    		
			// Recuperation de la trace de l'erreur
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace(pw);
	
			// Retourne la trace de l'erreur sous forme de String
			return sw.toString();
    	}catch(Exception e) {return ex.getMessage();}
    }
    
}
