public interface HashManager {
    String generateHash(String clearText);
    boolean validateHash(String hashedText, String clearText);
}
