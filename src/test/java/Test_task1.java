    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testSimplePalindromes() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("level"));
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    public void testComplexPalindromes() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("No 'x' in Nixon"));
        assertTrue(checker.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testNonPalindromes() {
        PalindromeChecker checker = new PalindromeChecker();

        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
        assertFalse(checker.isPalindrome("Java"));
    }

    @Test
    public void testEdgeCases() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome(""));
        assertTrue(checker.isPalindrome("   "));
        assertTrue(checker.isPalindrome("A"));
    }
}
