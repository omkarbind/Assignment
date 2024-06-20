<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html lang="en">

<head>

<meta charset="UTF-8">
<title>Home</title>

<link rel="stylesheet" href="./css/home_style.css">
<script type="text/javascript" src="./js/user_script.js"></script>
<link rel="stylesheet" href="./css/data_list.css">
<link rel="stylesheet" href="./css/list.css">



</head>



<body >


	<div id="bg"></div>

	<div class="main-container">

       <%@ include file="header.jsp" %>
		

		<div class="content-container">

		<%@ include file="left_menu.jsp" %>


<div class="main-card-container" id="main-card-container" align="center">









<c:choose>

    <c:when test="${not empty lists}">




	  <table id="data-list">
	          
	  <tr data-list-header> <th>Serial No.</th> <th>Employee Id</th> <th>First Name</th> <th>Last Name</th>  <th>Email</th>   <th class="op-btn">Action</th> </tr>
	  


 <c:forEach items="${lists}" var="lists1" varStatus="i">
 
 
 
          <tr id="data-list-data"> 
     
	          <td>${i.index}</td>
	          <td>${lists1.getEid()}</td>
	          <td>${lists1.getFname()}</td>
	          <td>${lists1.getLname()}</td>
	          <td>${lists1.getEmail()}</td>
	      	         
	      	 <td class="op-btn"> 
	      	       <a class="operation-btn" href="delete?eid=${lists1.getEid()}"  >Delete</a>   
	      	       <a class="operation-btn" href="update?eid=${lists1.getEid()}"   >Update</a>  
	      	 </td>
	      	 
	      </tr>
	       
       
</c:forEach>

 </table>
	   


   
    </c:when> 

    <c:otherwise>

    <p>Employee Data Not found</p>
        
    </c:otherwise>

</c:choose>


</div>

						
</div>

</div>



</div>


</body>
</html>








