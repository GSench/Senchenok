package com.gsench.senchenok.presentation.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gsench.senchenok.R;
import com.gsench.senchenok.domain.model.GifPost;
import com.gsench.senchenok.presentation.AndroidInterface;
import com.gsench.senchenok.presentation.presenter.MainPresenter;
import com.gsench.senchenok.presentation.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this, new AndroidInterface(this));
        presenter.start();
    }

    @Override
    public void showImageLoading() {

    }

    @Override
    public void loadPost(GifPost gifPost) {

    }

    @Override
    public void showLoadingError() {

    }

    @Override
    public void hideLoadingError() {

    }

    @Override
    public void lockNextBtn() {

    }

    @Override
    public void unlockNextBtn() {

    }

    @Override
    public void lockPrevBtn() {

    }

    @Override
    public void unlockPrevBtn() {

    }
}