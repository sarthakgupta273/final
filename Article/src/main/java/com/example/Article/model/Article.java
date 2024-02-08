package com.example.Article.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Article {
    @Id
    private int id;
    private String title;
    private String author;
    private String content;
    private String tags;
    private String date;
    private byte[] url;

    public Article(int id, String title, String author, String content, String tags, String date, byte[] url) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
        this.tags = tags;
        this.date = date;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public byte[] getUrl() {
        return url;
    }

    public void setUrl(byte[] image) {
        this.url = image;
    }
}
