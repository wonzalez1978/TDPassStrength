package com.eme.passstrenghtmvp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;

import com.eme.passstrenghtmvp.databinding.ActivityMainBinding;
import com.eme.passstrenghtmvp.model.Verifier;
import com.eme.passstrenghtmvp.presenter.IPresenter;
import com.eme.passstrenghtmvp.presenter.IPresenterView;
import com.eme.passstrenghtmvp.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IPresenterView {
    private static final String TAG = "MainActivity";
    ActivityMainBinding binding;
    IPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.editText.addTextChangedListener(new TextWatcher() {


            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                Log.d(TAG, "changed " + s.toString());
                presenter.evaluatePass(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        presenter = new Presenter(this, new Verifier());
    }

    @Override
    public void showWeak() {
        Log.d(TAG, "weak");
        binding.textView.setBackgroundColor(Color.RED);
        binding.textView.setText(R.string.weak);
        binding.textView.setTextColor(Color.WHITE);
    }

    @Override
    public void showMedium() {
        Log.d(TAG, "medium");
        binding.textView.setBackgroundColor(Color.BLUE);
        binding.textView.setText(R.string.medium);
    }

    @Override
    public void showStrong() {
        Log.d(TAG, "Strong");
        binding.textView.setBackgroundColor(Color.YELLOW);
        binding.textView.setText(R.string.strong);
    }

    @Override
    public void showVeryStrong() {
        Log.d(TAG, "very");
        binding.textView.setBackgroundColor(Color.GREEN);
        binding.textView.setText(R.string.very_strong);

    }
}
