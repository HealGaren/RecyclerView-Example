package com.example.healgaren.recyclerview_example;

public class TodoVo {
    private String previewImgUrl;
    private String title;
    private String content;
    private boolean isChecked;

    public TodoVo(String title, String content, String previewImgUrl) {
        this.title = title;
        this.content = content;
        this.previewImgUrl = previewImgUrl;
        isChecked = true;
    }

    public TodoVo(String title, String content) {
        this(title, content, null);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getPreviewImgUrl() {
        return previewImgUrl;
    }

    public void setPreviewImgUrl(String previewImgUrl) {
        this.previewImgUrl = previewImgUrl;
    }
}
