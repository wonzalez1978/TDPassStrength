package com.eme.passstrenghtmvp.model;

public class Verifier implements IVerifier {

    public int verificar(String password) {
        boolean largo = evaluateLenght(password);
        boolean mayus = evaluateUpper(password);
        boolean numero = evaluateHasNumber(password);

        if (!largo) {
            return 0;
        } else if (largo && !mayus) {
            return 1;
        } else if (largo && mayus && !numero) {
            return 2;
        } else if (largo && mayus && numero) {
            return 3;
        } else {
            return 0;
        }
    }


    @Override
    public boolean evaluateLenght(String password) {
        return password.length() >= 5;
    }

    @Override
    public boolean evaluateUpper(String password) {
        return !password.toLowerCase().equals(password);
    }

    @Override
    public boolean evaluateHasNumber(String password) {

        return password.contains("0") ||
                password.contains("1") ||
                password.contains("2") ||
                password.contains("3") ||
                password.contains("4") ||
                password.contains("5") ||
                password.contains("6") ||
                password.contains("7") ||
                password.contains("8") ||
                password.contains("9");
    }
}
