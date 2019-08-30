package com.xpeppers;

import org.junit.Test;

public class StringCalculatorTest
{
    @Test(expected = UnsupportedOperationException.class)
    public void aTest()
    {
        // Given
        final StringCalculator stringCalculator = new StringCalculator();

        // When
        stringCalculator.add("");

        // Then ...
    }

}
