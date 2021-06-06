package com.gsench.senchenok.domain.interactor;

import com.gsench.senchenok.domain.SystemInterface;
import com.gsench.senchenok.domain.model.GifPost;
import com.gsench.senchenok.domain.model.HttpParams;
import com.gsench.senchenok.domain.utils.Pair;
import com.gsench.senchenok.presentation.presenter.MainPresenter;

import java.net.URL;
import java.util.ArrayList;

public class MainInteractor {

    private final String requestURL = "https://developerslife.ru/random?json=true";

    private final MainPresenter presenter;
    private final SystemInterface system;

    private final ArrayList<GifPost> postList;
    private int currentPost = -1;

    public MainInteractor(MainPresenter presenter, SystemInterface system) {
        this.presenter = presenter;
        this.system = system;
        postList = new ArrayList<>();
    }

    public void onNextPost(){
        if(currentPost==-1 || currentPost==postList.size()-1)
            appendNewPost();
        else
            presenter.PostLoaded(postList.get(++currentPost));
    }

    public void onPrevPost(){
        if(currentPost<1) {
            presenter.lockPrevBtn();
            return;
        }
        presenter.PostLoaded(postList.get(--currentPost));
        if(currentPost<1) presenter.lockPrevBtn();
    }

    private void appendNewPost(){
        presenter.showImageLoading();
        presenter.lockNextBtn();
        system.doOnBackground(params -> {
            try {
                URL url = new URL(requestURL);
                Pair<byte[], HttpParams> rawPost = system.httpGet(url, null);
                String postJson = new String(rawPost.f);
                GifPost gifPost = new GifPost(postJson);
                postList.add(gifPost);
                currentPost = postList.size()-1;
                system.doOnForeground(params1 -> {
                    presenter.PostLoaded(gifPost);
                    presenter.unlockNextBtn();
                    presenter.unlockPrevBtn();
                });
            } catch (Exception e) {
                e.printStackTrace();
                presenter.OnPostDataError();
            }
        });
    }


}
