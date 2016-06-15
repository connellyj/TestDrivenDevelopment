package TDD;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class CurrencyTest {

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
