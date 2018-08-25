package com.example.healgaren.recyclerview_example;

public class TodoVo {
    private String title;
    private String content;
    private boolean isChecked;

    public TodoVo(String title, String content) {
        this.title = title;
        this.content = content;
        isChecked = true;
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
}
