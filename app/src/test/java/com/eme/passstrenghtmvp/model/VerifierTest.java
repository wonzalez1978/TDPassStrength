package com.eme.passstrenghtmvp.model;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class VerifierTest {

    private Verifier verifier;
    @Before
    public void setUp() throws Exception {
        verifier = new Verifier();
    }

    @Test
    public void verificar() {
    }

    @Test
    public void evaluateLenght() {
    }

    @Test
    public void evaluateUpper() {
    }

    @Test
    public void evaluateHasNumber_happyCase() {
        String password = "pass";
        boolean result = verifier.evaluateHasNumber(password);
         assertThat(result).isFalse();
    }
    @Test
    public void evaluateHasNumber_has0() {
        String password = "pass0";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has1() {
        String password = "pass12";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has2() {
        String password = "pass12";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has3() {
        String password = "pass13";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has4() {
        String password = "pass4";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has5() {
        String password = "pass5";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has6() {
        String password = "pass6";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has7() {
        String password = "pass7";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has8() {
        String password = "pass8";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
    @Test
    public void evaluateHasNumber_has9() {
        String password = "pass9";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isTrue();
    }
}