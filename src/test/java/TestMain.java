import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMain {

    public Main main;

    @BeforeEach
    public void setUp() {
        main = new Main();
        assertNotEquals(main, null);
    }

    // UNIT TESTS

    @Test
    public void testLengthWord() {
        main = new Main();
        assertEquals(5, main.lengthWord("music"));
    }

    @Test
    public void testCountVowels() {
        main = new Main();
        assertEquals(3, main.countVowels("magenta"));
    }

    @Test
    public void testCountConsonants() {
        main = new Main();
        assertEquals(4, main.countConsonants("magenta"));
    }

    @Test
    public void testCountUpperCase() {
        main = new Main();
        assertEquals(2, main.countUpperCase("SpiderMan"));
    }

    @Test
    public void testCountLowerCase() {
        main = new Main();
        assertEquals(4, main.countLowerCase("Blues"));
    }

    @Test
    public void testCountOnlyA() {
        main = new Main();
        assertEquals(3, main.countOnlyA("alphaRomeoAndBently"));
    }

    @Test
    public void testCountWordsStartingWithVowels() {
        main = new Main();
        assertEquals(1, main.countWordsStartingWithVowels("The quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void testReverseVowelCount() {
        main = new Main();
        assertEquals(5, main.reverseVowelCount("aeiou"));
    }
    @Test
    public void testCountOnlyB() {
        main = new Main();
        assertEquals(1, main.countOnlyB("alphaRomeBently"));
    }
    @Test
    public void testCountOnlyC() {
        main = new Main();
        assertEquals(0, main.countOnlyC("alphaRomeBently"));

    }
    @Test
    public void countNumbers() {
        main = new Main();
        assertEquals(6, main.countNumbers("alphaRome122345"));

    }
    @Test
    public void countSpaces() {
        main = new Main();
        assertEquals(2, main.countSpaces("alpha Rome 122345"));

    }
    @Test
    public void countspecialSymbols() {
        main = new Main();
        assertEquals(6, main.countSpecialSymbols("alpha,Rome,122345@!;/"));

    }

}
//NEW CHANGES
