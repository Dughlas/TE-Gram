package com.techelevator.model;

public class PostDTO {
    private int photoId;
    private String url;
    private int userId;
    private String username;
    private String caption;

    public PostDTO(int userId, int photoId, String url, String username, String caption) {
        this.userId = userId;
        this.photoId = photoId;
        this.url = url;
        this.caption = caption;
        this.username = username;
    }
    public PostDTO(){}

    public int getUserId() {
        return userId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public String getUrl() {
        return url;
    }

    public String getCaption() {
        return caption;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
