package calculator;

import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Rule;

class StringCalculatorShould {
	@Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_two_number_should_return_number_as_sum() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(2, stringCalculator.add("1,1"));
    }
    
    @Test
    void string_with_more_number_should_return_number_as_sum()  {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(3, stringCalculator.add("1,1,1"));
    }
    
    @Test
    void string_with_two_number_with_newLine_should_return_number_as_sum()  {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(2, stringCalculator.add("1\n1"));
    }
    
    @Test
    void string_containig_negative_number() throws Exception {
    	StringCalculator stringCalculator = new StringCalculator();
    	thrown.expect(IllegalArgumentException.class);
    	assertEquals(2, stringCalculator.add("-1,1"));
    }
    
    @Test
    void string_ignore_numbers_greater_than_1000() {
    	StringCalculator stringCalculator = new StringCalculator();
    	assertEquals(500, stringCalculator.add("1002,250,250"));
    }
}
