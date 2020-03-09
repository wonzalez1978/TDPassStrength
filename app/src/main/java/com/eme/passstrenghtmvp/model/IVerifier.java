package com.eme.passstrenghtmvp.model;

public interface IVerifier {

    boolean evaluateLength(String password);

    boolean evaluateUpper (String password);

    boolean evaluateHasNumber (String password);

    int verificar(String password);
}
