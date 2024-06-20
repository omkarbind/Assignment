
<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="UTF-8">
<title>Home</title>

<link rel="stylesheet" href="./css/home_style.css">
<script type="text/javascript" src="./js/user_script.js"></script>
<link rel="stylesheet" href="./css/data_list.css">
 <link rel="stylesheet" href="./css/operation_page.css">
 <link rel="stylesheet" href="./css/update.css">



</head>



<body >


	<div id="bg"></div>

	<div class="main-container">

       <%@ include file="header.jsp" %>
		

		<div class="content-container">

		<%@ include file="left_menu.jsp" %>


<div class="main-card-container" id="main-card-container" align="center">


<h1>Update Employee Record</h1>


	  
<form   action="update"  method="post" enctype="multipart/form-data">

    <span>Employee Id</span>
    <div class="form-field">
        <input name="eid" type="text" placeholder="Employee Id" readonly required value="${ emp.getEid() }"/>
    </div>

    <span>First Name</span>
    <div class="form-field">
        <input name="fname" type="text" placeholder="First Name" required value="${ emp.getFname() }"/>
    </div>
    
    <span>Last Name</span>
    <div class="form-field">
        <input name="lname" type="text" placeholder="Last Name" required value="${ emp.getLname() }"/>
    </div>
    
    <span>Email</span>
    <div class="form-field">
        <input name="email" type="email" placeholder="Email" required value="${ emp.getEmail() }"/>
    </div>
    
   <div class="form-field">
        <button class="btn" type="submit" >Update</button>
  </div>

  <p>${ status }</p>
    
    
</form>
     
      
	


























</div>

						
</div>

</div>



</div>


</body>
</html>






























 
 


 





