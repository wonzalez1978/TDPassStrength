package com.eme.passstrenghtmvp.model;

public interface IVerifier {

    public boolean evaluateLenght (String password);

    public boolean evaluateUpper (String password);

    public boolean evaluateHasNumber (String password);
}
