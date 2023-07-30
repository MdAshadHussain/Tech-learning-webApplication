/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tech.blog.dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.tech.blog.entities.Category;
import com.tech.blog.entities.Post;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Ashad
 */
public class PostDao {
  private Connection con;

    public PostDao(Connection con) {
        this.con = con;
    }
    
    //method to insert user to database
    
    
    
    
    //save data in database through post
    
     public boolean savePost(Post p) {
        boolean f = false;
        try {

            String q = "insert into post1(userId,category,pTitle,pContent,pCode) values(?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, p.getUserId());
            pstmt.setString(2, p.getCategory());
            pstmt.setString(3, p.getpTitle());
            pstmt.setString(4, p.getpContent());
            pstmt.setString(5, p.getpCode());
            
           
            
            pstmt.executeUpdate();
            f = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return f;
    }

}