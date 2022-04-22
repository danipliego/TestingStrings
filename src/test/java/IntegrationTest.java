import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class IntegrationTest {
    public Main main;
    @BeforeEach
    public void setUp() {
        main = new Main();
        assertNotEquals(main, null);
    }
    @Test
    public void testVowelsAndConsonants() {
        main = new Main();
        assertEquals(main.lengthWord("great"), main.countConsonants("great") + main.countVowels("great"));
    }

    @Test
    public void testLowerAndUpperCase() {
        main = new Main();
        assertEquals(main.lengthWord("great"), main.countLowerCase("great") + main.countUpperCase("great"));
    }
    @Test
    public void testNumbersandSpecialSymbols() {
        main = new Main();
        assertEquals(main.lengthWord("alpha,R,1223"), main.countNumbers("alpha,R,122345@!;/") + main.countSpecialSymbols("alpha,R,122345@!;/"));
    }
    @Test
    public void testSpacesandNumbers() {
        main = new Main();
        assertEquals(main.lengthWord("he will"), main.countSpaces("hello alpha R") + main.countNumbers("12345"));
    }

}