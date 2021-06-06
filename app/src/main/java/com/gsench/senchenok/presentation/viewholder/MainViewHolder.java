package com.gsench.senchenok.presentation.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.gsench.senchenok.R;
import com.hanks.htextview.base.HText;
import com.hanks.htextview.base.HTextView;

public class MainViewHolder {

    public ImageView gifImage;
    public HTextView postText;
    public Button nextBtn;
    public Button prevBtn;
    public Button retry;
    public ProgressBar progressBar;
    public View errorView;
    public CardView cardView;

    public MainViewHolder(ViewGroup parent){
        gifImage = parent.findViewById(R.id.gif_post_image);
        postText = parent.findViewById(R.id.post_text);
        nextBtn = parent.findViewById(R.id.button_next);
        prevBtn = parent.findViewById(R.id.button_prev);
        retry = parent.findViewById(R.id.retry_btn);
        progressBar = parent.findViewById(R.id.progress);
        errorView = parent.findViewById(R.id.error_loading_view);
        cardView = parent.findViewById(R.id.post_card);
    }

}
