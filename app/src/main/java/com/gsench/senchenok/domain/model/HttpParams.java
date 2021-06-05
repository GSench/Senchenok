package com.gsench.senchenok.domain.model;
import com.gsench.senchenok.domain.utils.Pair;

import java.util.ArrayList;


public class HttpParams {

    private ArrayList<Pair<String, String>> headers;
    private int resultCode=-1;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public ArrayList<Pair<String, String>> getHeaders() {
        return headers;
    }

    public void setHeaders(ArrayList<Pair<String, String>> headers) {
        this.headers = headers;
    }

}