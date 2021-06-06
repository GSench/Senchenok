package com.gsench.senchenok.domain;

import com.gsench.senchenok.domain.model.HttpParams;
import com.gsench.senchenok.domain.utils.Pair;
import com.gsench.senchenok.domain.utils.function;

import java.io.IOException;
import java.net.URL;

public interface SystemInterface {

    public void doOnBackground(function<Void> background);
    public void doOnForeground(function<Void> foreground);
    public Pair<byte[], HttpParams> httpGet(URL url, HttpParams params) throws IOException;
    public String[] getSavedStringArray(String title, String[] def);
    public void saveStringArray(String title, String[] array);
    public String getSavedString(String title, String def);
    public void saveString(String title, String string);
    public void removeSaved(String str);
    public String md5(String s);

}