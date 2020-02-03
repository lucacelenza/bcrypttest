import org.junit.Assert;
import org.junit.Test;

public class BCryptHashManagerTests {

    @Test
    public void validateHashTest() {
        HashManager sut = new BCryptHashManager();

        boolean result = sut.validateHash(
                "$2y$12$OPE8ACrZuoe5okYxlnCI2eD11F5n8F1xPmf26n3g9OBqFqvCIlHMm",
                "Aa123456");

        Assert.assertTrue(result);
    }
}
