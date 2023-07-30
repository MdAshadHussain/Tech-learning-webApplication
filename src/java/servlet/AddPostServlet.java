/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tech.blog.servlets;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.SocketMetadata.Helper;
import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.Post;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Durgesh
 */
@MultipartConfig
public class AddPostServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String category=request.getParameter("categories");
                String pTitle=request.getParameter("pTitle");
                String pContent=request.getParameter("pContent");
                String pCode=request.getParameter("pCode");
               
                
                
                //session for login user
                 HttpSession session = request.getSession();
            User user = (User) session.getAttribute("currentUser");
                //create user object and set all the data in user object
                Post p=new Post(user.getId(),category,pTitle,pContent,pCode);
                
                //create a user dao object
                PostDao dao=new PostDao((Connection) ConnectionProvider.getConnection());
                if(dao.savePost(p)){
                    out.println(" <div class=\"container text-center\" style=\"height: 50%\">");
                    out.println("<img src=\"img/success.png\" class=\"img-fluid\">");
                    out.println("<p class=\"display-3\"></p>");
                    out.println("&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                            + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                            + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                            + "&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp"
                            
                            );
//                    out.println("")
                     out.println("<button type=\"button\" class=\"btn btn-primary\">");
                    out.println(" <a href=\"profile.jsp\" class=\"btn primary-background btn-lg text-white\">Home</a>");
                    out.println("</button>");
                    out.println(" </div>");
//                     <div class="container text-center" style="height: 50%">
//            <img src="img/success.png" class="img-fluid">
//            <p class="display-3"></p>
//            <%--<%=exception %>--%>
//            <a href="index.jsp" class="btn primary-background btn-lg text-white">Home</a>
//            </div>
//                    
//                    ");
                }
                else{
                    out.println("error");
                }
            
            
            
           
           
      

        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}