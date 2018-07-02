import org.junit.Test;

import static org.junit.Assert.*;

public class DuplicateEncoderTest {
    @Test
    public void test() {
        assertEquals("(((",DuplicateEncoder.encode("din"));
        assertEquals("))((",DuplicateEncoder.encode("aabc"));
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }
}