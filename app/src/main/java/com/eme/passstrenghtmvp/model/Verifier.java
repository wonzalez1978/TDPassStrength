package com.eme.passstrenghtmvp.model;

public class Verifier implements IVerifier{

    public int verificar (String password) {
       return 0;
    }


    @Override
    public boolean evaluateLenght(String password) {
        return false;
    }

    @Override
    public boolean evaluateUpper(String password) {
        return false;
    }

    @Override
    public boolean evaluateHasNumber(String password) {
        return false;
    }
}
