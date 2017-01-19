package de.hundertneun;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;


public class IntegerFactorizerTest {

    @Test
    public void factorize(){
        IntegerFactorizer integerFactorizer = new IntegerFactorizer();

        //check for primes of 12 (3 and 2)
        assertThat(integerFactorizer.factorize(12)).containsExactly(3, 2);
    }
}