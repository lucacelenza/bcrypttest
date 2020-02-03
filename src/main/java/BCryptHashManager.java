import org.springframework.security.crypto.bcrypt.BCrypt;

public class BCryptHashManager implements HashManager{
    public String generateHash(String clearText) {
        return BCrypt.hashpw(clearText, BCrypt.gensalt());
    }

    public boolean validateHash(String hashedText, String clearText) {
        return BCrypt.checkpw(clearText, hashedText);
    }
}
