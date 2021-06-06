package com.gsench.senchenok.presentation.presenter;

import com.gsench.senchenok.domain.SystemInterface;
import com.gsench.senchenok.domain.interactor.MainInteractor;
import com.gsench.senchenok.domain.model.GifPost;
import com.gsench.senchenok.presentation.view.MainView;

public class MainPresenter {

    private final MainView view;
    private final MainInteractor interactor;

    public MainPresenter(MainView view, SystemInterface system){
        this.view=view;
        interactor = new MainInteractor(this, system);
    }

    //-------------- Interactor commans ----------------

    public void showImageLoading() {
        view.showImageLoading();
        view.hideLoadingError();
    }

    public void PostLoaded(GifPost gifPost) {
        view.hideLoadingError();
        view.loadPost(gifPost);
    }

    public void OnPostDataError() {
        view.showLoadingError();
    }

    public void lockNextBtn() {
        view.lockNextBtn();
    }

    public void unlockNextBtn() {
        view.unlockNextBtn();
    }

    public void lockPrevBtn() {
        view.lockPrevBtn();
    }

    public void unlockPrevBtn() {
        view.unlockPrevBtn();
    }

    //-------------View commands ---------------
    public void start(){
        interactor.onNextPost();
    }

    public void onNextBtnPressed(){
        interactor.onNextPost();
    }

    public void onPrevBtnPressed(){
        interactor.onPrevPost();
    }

    public void onRetryBtnPressed(){
        interactor.onNextPost();
    }
}
