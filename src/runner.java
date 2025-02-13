import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class runner {
    public static void main(String args[]) {
        System.out.println("Starting");
        
        Date d = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        
        Card card = new Card();
        card.setName("Fist Name and Last Name");
        card.setCode("1234 5678 9012 3456");
        card.setValidity(sdf.format(d).toString());
        card.setSecurityCode(123);
        
        System.out.println("1: " + card.getName());
        System.out.println("2: " + card.getCode());
        System.out.println("3: " + card.getValidity());
        System.out.println("4: " + card.getSecurityCode());
        
    }
    
    public static byte[] convertObjectToBytes(Object obj) {
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	
    	try {
    		ObjectOutputStream oos = new ObjectOutputStream(baos);
    		oos.writeObject(obj);
    		return baos.toByteArray();
    	} catch(IOException ioe) {
    		ioe.printStackTrace();
    	}

    	throw new RuntimeException();
    }
    
}
