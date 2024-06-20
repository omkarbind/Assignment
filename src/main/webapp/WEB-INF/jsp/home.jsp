<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.asuni.myapp.POJO.*" %>
<%@ page import="java.util.*" %>

<html lang="en">

<head>

<meta charset="UTF-8">
<title>Home</title>

<link rel="stylesheet" href="./css/home_style.css">
<script type="text/javascript" src="./js/user_script.js"></script>
<link rel="stylesheet" href="./css/data_list.css">
<link rel="stylesheet" href="./css/home.css">



</head>



<body >


  <div id="bg"></div>

  <div class="main-container">

       <%@ include file="header.jsp" %>
    

    <div class="content-container">

    <%@ include file="left_menu.jsp" %>

    <c:set var="list" scope="session" value="${lists}"/>
    
    <div class="main-card-container" id="main-card-container" align="center">

    <%


HttpSession  session1=request.getSession(false);

List<Employee> list = ( List<Employee> ) session1.getAttribute("list");

  
 
    int row = (int) Math.ceil(    (double) list.size() / 3     );

    int cursor = 0;

    for ( int trow = 0; trow < row  ;  trow++ ) {
    	
    	%> <div class="card-container"><%

    	for ( int tcol = 0 ; tcol < 3 ; tcol++  ) {

    		
    		%>
    		
    		    <div class="card-item">

                        <img src="img/img_avatar.png" alt="Avatar" style="width:20%">
                        <div class="item-container">
                            <h4><b>Full Name :  <%= list.get(cursor).getFname() %> <%= list.get(cursor).getLname() %> </b></h4> 
                            <p>E-id : <%= list.get(cursor).getEid() %></p> 
                            <p>Email :  <%= list.get(cursor).getEmail() %> </p>
                        </div>

                    </div>  
                    
                    
    		
    		<%
    		
    		

            cursor++;
    		if( cursor == list.size() )
    			break;

            

    	}
    	
    	out.println("</div>");
    	

        
    }

    %>



</div>
</body>
</html>







