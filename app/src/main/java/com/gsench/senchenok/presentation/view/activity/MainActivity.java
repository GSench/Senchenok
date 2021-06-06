package com.gsench.senchenok.presentation.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.gsench.senchenok.R;
import com.gsench.senchenok.domain.model.GifPost;
import com.gsench.senchenok.presentation.AndroidInterface;
import com.gsench.senchenok.presentation.presenter.MainPresenter;
import com.gsench.senchenok.presentation.view.MainView;
import com.gsench.senchenok.presentation.viewholder.MainViewHolder;

public class MainActivity extends AppCompatActivity implements MainView {

    private MainPresenter presenter;
    private MainViewHolder viewHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewHolder = new MainViewHolder(findViewById(R.id.main_view));
        presenter = new MainPresenter(this, new AndroidInterface(this));
        presenter.start();
    }

    public void onNextBtnClick(View v){
        presenter.onNextBtnPressed();
    }

    public void onPrevBtnClick(View v){
        presenter.onPrevBtnPressed();
    }

    @Override
    public void showImageLoading() {

    }

    @Override
    public void loadPost(GifPost gifPost) {
        Glide.with(this)
                .load(gifPost.getGifURL().replace("http", "https"))
                .into(viewHolder.gifImage);
        viewHolder.postText.setText(gifPost.getDescription());
    }

    @Override
    public void showLoadingError() {

    }

    @Override
    public void hideLoadingError() {

    }

    @Override
    public void lockNextBtn() {
        viewHolder.nextBtn.setClickable(false);
    }

    @Override
    public void unlockNextBtn() {
        viewHolder.nextBtn.setClickable(true);
    }

    @Override
    public void lockPrevBtn() {
        viewHolder.prevBtn.setClickable(false);
    }

    @Override
    public void unlockPrevBtn() {
        viewHolder.prevBtn.setClickable(true);
    }
}