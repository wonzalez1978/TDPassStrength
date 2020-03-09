package com.eme.passstrenghtmvp.presenter;

import com.eme.passstrenghtmvp.model.IVerifier;

public class Presenter implements IPresenter {

    private IPresenterView view;
    private IVerifier verifier;

    public Presenter(IPresenterView view, IVerifier verifier) {
        this.view = view;
        this.verifier = verifier;
    }

    @Override
    public void evaluatePass(String password) {

        int resultado = this.verifier.verificar(password);

        switch (resultado) {
            case 0: //weak
                view.showWeak();
                break;

            case 1: //medium
                view.showMedium();
                break;

            case 2: //strong
                view.showStrong();
                break;

            case 3: // very strong
                view.showVeryStrong();
                break;
        }
    }
}
