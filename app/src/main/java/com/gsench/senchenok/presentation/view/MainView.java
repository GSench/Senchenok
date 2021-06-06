package com.gsench.senchenok.presentation.view;

import com.gsench.senchenok.domain.model.GifPost;

public interface MainView {
    void showImageLoading();

    void loadPost(GifPost gifPost);

    void showLoadingError();

    void hideLoadingError();

    void lockNextBtn();

    void unlockNextBtn();

    void lockPrevBtn();

    void unlockPrevBtn();
}
