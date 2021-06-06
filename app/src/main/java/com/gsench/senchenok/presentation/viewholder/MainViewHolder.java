package com.gsench.senchenok.presentation.viewholder;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.gsench.senchenok.R;

public class MainViewHolder {

    public ImageView gifImage;
    public TextView postText;
    public Button nextBtn;
    public Button prevBtn;

    public MainViewHolder(ViewGroup parent){
        gifImage = parent.findViewById(R.id.gif_post_image);
        postText = parent.findViewById(R.id.post_text);
        nextBtn = parent.findViewById(R.id.button_next);
        prevBtn = parent.findViewById(R.id.button_prev);
    }

}
