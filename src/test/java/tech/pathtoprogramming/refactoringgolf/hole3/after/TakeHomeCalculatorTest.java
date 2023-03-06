package tech.pathtoprogramming.refactoringgolf.hole3.after;

import org.junit.jupiter.api.Test;
import tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TakeHomeCalculatorTest {

    @Test
    public void canCalculateTax() throws Exception {
        Integer first = new tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator(10).netAmount(new tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator.Money(40, "GBP"), new tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator.Money(50, "GBP"), new tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator.Money(60, "GBP")).value;
        assertEquals(135, first.intValue());
    }

    @Test
    public void cannotSumDifferentCurrencies() throws Exception {
        new tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator(10)
                .netAmount(new tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator.Money(4, "GBP"),
                        new tech.pathtoprogramming.refactoringgolf.hole3.before.TakeHomeCalculator.Money(5, "USD")
                );
    }
}
