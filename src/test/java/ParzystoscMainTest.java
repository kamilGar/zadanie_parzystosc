import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ParzystoscMainTest {
    @Test
    void ShouldShowEquals(){
        String result = ParzystoscMain.IsEven(14);
        Assertions.assertEquals("parzysta", result);
    }
}
