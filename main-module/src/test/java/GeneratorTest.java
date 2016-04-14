import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratorTest {

    @Test
    public void testGenerate() {

        Generator generator = new Generator("A");
        int value = generator.generate();
        assertEquals(value,2);

    }
}
