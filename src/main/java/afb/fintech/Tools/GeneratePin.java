package afb.fintech.Tools;

public class GeneratePin {
	
	public static String generate()
	{
		    String chars = "1234567890"; 
		    String pass = "";
		    int length = 4;
		    for(int x=0;x<length;x++)
		    {
		       int i = (int)Math.floor(Math.random() * 10); 
		       pass += chars.charAt(i);
		    }
//		    System.out.println(pass);
		    return pass;
	}

}
