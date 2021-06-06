package com.gsench.senchenok.domain.model;

import org.json.JSONException;
import org.json.JSONObject;

public class GifPost {

    private int id;
    private String description;
    private int votes;
    private String author;
    private String date;
    private String gifURL;
    private int gifSize;
    private String previewURL;
    private String videoURL;
    private String videoPath;
    private int videoSize;
    private String type;
    private String width;
    private String height;
    private int commentsCount;
    private int fileSize;
    private boolean canVote;

    public GifPost(String json){
        try {
            JSONObject jObject = new JSONObject(json);
            id =            jObject.getInt(     "id");
            description=    jObject.getString(  "description");
            votes =         jObject.getInt(     "votes");
            author =        jObject.getString(  "author");
            date =          jObject.getString(  "date");
            gifURL =        jObject.getString(  "gifURL");
            gifSize =       jObject.getInt(     "gifSize");
            previewURL=     jObject.getString(  "previewURL");
            videoURL =      jObject.getString(  "videoURL");
            videoPath =     jObject.getString(  "videoPath");
            videoSize =     jObject.getInt(     "videoSize");
            type =          jObject.getString(  "type");
            width =         jObject.getString(  "width");
            height =        jObject.getString(  "height");
            commentsCount = jObject.getInt(     "commentsCount");
            fileSize =      jObject.getInt(     "fileSize");
            canVote =       jObject.getBoolean( "canVote");
        } catch (JSONException e) {
            //UNEXPECTED BEHAVIOUR
            e.printStackTrace();
        }

    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getVotes() {
        return votes;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getGifURL() {
        return gifURL;
    }

    public int getGifSize() {
        return gifSize;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public String getVideoPath() {
        return videoPath;
    }

    public int getVideoSize() {
        return videoSize;
    }

    public String getType() {
        return type;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getFileSize() {
        return fileSize;
    }

    public boolean isCanVote() {
        return canVote;
    }

}
