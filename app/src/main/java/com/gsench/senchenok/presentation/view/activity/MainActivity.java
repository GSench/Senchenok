package com.gsench.senchenok.presentation.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
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
        viewHolder.progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void loadPost(GifPost gifPost) {
        Glide.with(this)
                .load(gifPost.getGifURL().replace("http", "https"))
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .into(viewHolder.gifImage);
        viewHolder.postText.animateText(gifPost.getDescription());
        viewHolder.progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showLoadingError() {
        viewHolder.errorView.setVisibility(View.VISIBLE);
        viewHolder.postText.setVisibility(View.INVISIBLE);
        viewHolder.gifImage.setVisibility(View.INVISIBLE);
        viewHolder.progressBar.setVisibility(View.GONE);
    }

    @Override
    public void hideLoadingError() {
        viewHolder.errorView.setVisibility(View.GONE);
        viewHolder.postText.setVisibility(View.VISIBLE);
        viewHolder.gifImage.setVisibility(View.VISIBLE);
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