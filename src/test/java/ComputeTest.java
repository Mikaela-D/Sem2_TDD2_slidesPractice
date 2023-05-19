import ie.atu.Compute;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputeTest {

    @Test
    void calc() {
        Compute myCompute = new Compute();
        assertEquals(12, myCompute.calc(1, 2));
    }
}
