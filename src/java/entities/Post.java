/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tech.blog.entities;

import java.sql.Timestamp;

/**
 *
 * @author Ashad
 */
public class Post {
    
    private int userId;
    private String category;
    private String pTitle;
    private String pContent;
    private String pCode;
   
    private Timestamp dateTime;

    public Post() {
    }

    public Post(String category, String pTitle, String pContent, String pCode) {
        this.category = category;
        this.pTitle = pTitle;
        this.pContent = pContent;
        this.pCode = pCode;
    }

    public Post(int userId, String category, String pTitle, String pContent, String pCode) {
        this.userId = userId;
        this.category = category;
        this.pTitle = pTitle;
        this.pContent = pContent;
        this.pCode = pCode;
    }

    public Post(String category, String pTitle, String pContent, String pCode, Timestamp dateTime) {
        this.category = category;
        this.pTitle = pTitle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.dateTime = dateTime;
    }

    public Post(int userId, String category, String pTitle, String pContent, String pCode, Timestamp dateTime) {
        this.userId = userId;
        this.category = category;
        this.pTitle = pTitle;
        this.pContent = pContent;
        this.pCode = pCode;
        this.dateTime = dateTime;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle;
    }

    public String getpContent() {
        return pContent;
    }

    public void setpContent(String pContent) {
        this.pContent = pContent;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String gCode) {
        this.pCode = gCode;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }
    
    
    
}
