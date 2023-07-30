<%-- 
    Document   : error_page
    Created on : May 9, 2023, 2:51:13 AM
    Author     : Ashad
--%>
<%@page isErrorPage="true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sorry ! Some things wrong</title>
        
        <!--css code-->

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link href="css/mycss.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{
                clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 94%, 70% 100%, 32% 95%, 0 100%, 0 0);
            }
        </style>
    </head>
    <body>
        
        <div class="container text-center" style="height: 50%">
            <img src="img/success.png" class="img-fluid">
            <p class="display-3"></p>
            <%--<%=exception %>--%>
            <a href="index.jsp" class="btn primary-background btn-lg text-white">Home</a>
            </div>
    </body>
</html>
