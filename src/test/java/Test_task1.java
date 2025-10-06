import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test_task1 {

    @Test
    public void testSimplePalindromes() {
        task1 checker = new task1();

        assertTrue(checker.isPalindrome("radar"));
        assertTrue(checker.isPalindrome("level"));
        assertTrue(checker.isPalindrome("madam"));
    }

    @Test
    public void testComplexPalindromes() {
        task1 checker = new task1();

        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));
        assertTrue(checker.isPalindrome("No 'x' in Nixon"));
        assertTrue(checker.isPalindrome("Was it a car or a cat I saw?"));
    }

    @Test
    public void testNonPalindromes() {
        task1 checker = new task1();

        assertFalse(checker.isPalindrome("hello"));
        assertFalse(checker.isPalindrome("openai"));
        assertFalse(checker.isPalindrome("Java"));
    }

    @Test
    public void testEdgeCases() {
        task1 checker = new task1();

        assertTrue(checker.isPalindrome(""));
        assertTrue(checker.isPalindrome("   "));
        assertTrue(checker.isPalindrome("A"));
    }
}
