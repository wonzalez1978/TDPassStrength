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
    public void verificar_weak() {
        // Given
        String password = "pass";

        // When
        int verificar = verifier.verificar(password);

        // Then
        assertThat(verificar).isEqualTo(0);
    }

    @Test
    public void verificar_medium() {
        // Given
        String password = "password";

        // When
        int verificar = verifier.verificar(password);

        // Then
        assertThat(verificar).isEqualTo(1);
    }


    @Test
    public void verificar_strong() {
        // Given
        String password = "Password";

        // When
        int verificar = verifier.verificar(password);

        // Then
        assertThat(verificar).isEqualTo(2);
    }


    @Test
    public void verificar_veryStrong() {
        // Given
        String password = "123Password";

        // When
        int verificar = verifier.verificar(password);

        // Then
        assertThat(verificar).isEqualTo(3);
    }

    @Test
    public void verificar_veryStrong9() {
        // Given
        String password = "1Poi";

        // When
        int verificar = verifier.verificar(password);

        // Then
        assertThat(verificar).isEqualTo(0);
    }

    @Test
    public void evaluateLenght() {
        // Given
        String password = "password";

        // When
        boolean result = verifier.evaluateLenght(password);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    public void evaluateLength_fail() {
        // Given
        String password = "pass";

        // When
        boolean result = verifier.evaluateLenght(password);

        // Then
        assertThat(result).isFalse();
    }


    @Test
    public void evaluateUpper_happyCase() {
        // Given
        String password = "Password";

        // When
        boolean result = verifier.evaluateUpper(password);

        // Then
        assertThat(result).isTrue();
    }

    @Test
    public void evaluateUpper_fail() {
        // Given
        String password = "password";

        // When
        boolean result = verifier.evaluateUpper(password);

        // Then
        assertThat(result).isFalse();
    }

    @Test
    public void evaluateHasNumber_happyCase() {
        String password = "pass";
        boolean result = verifier.evaluateHasNumber(password);
        assertThat(result).isFalse();
    }

    @Test
    public void evaluateHasNumber_has0() {
        // Given
        String password = "pass0";

        // When
        boolean result = verifier.evaluateHasNumber(password);

        // Then
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