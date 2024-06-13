import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;

abstract class Verificador {

    public String getHash() throws NoSuchAlgorithmException {
        String informacion = LocalDateTime.now().toString();
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(informacion.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }    
}
