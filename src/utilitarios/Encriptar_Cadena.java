package utilitarios;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encriptar_Cadena {
	
	//MODO DE CIFRADO AES (Esquema de cifrado por bloques)
	public byte[] encriptar(String llaveEspecifica, String cadena){
		SecretKeySpec llaveSecreta = new SecretKeySpec(llaveEspecifica.getBytes(), "AES");
		byte[] cadenaCifrada = null;
		try {
			Cipher cifrado = Cipher.getInstance("AES");
			cifrado.init(Cipher.ENCRYPT_MODE, llaveSecreta);
			cadenaCifrada = cifrado.doFinal(cadena.getBytes());
			return cadenaCifrada;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cadenaCifrada;
	}
     
    public String desencriptar(String llaveEspecifica, byte[] cadena2){
    	SecretKeySpec llaveSecreta = new SecretKeySpec(llaveEspecifica.getBytes(), "AES");
    	try {
    		Cipher descifrado = Cipher.getInstance("AES");
    		descifrado.init(Cipher.DECRYPT_MODE, llaveSecreta);
    		byte[] cadenadescifrada = descifrado.doFinal(cadena2);
    		String cadenaOriginal = new String(cadenadescifrada);
    		return cadenaOriginal;
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	return "";
    }
}

