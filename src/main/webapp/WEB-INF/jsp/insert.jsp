
<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="UTF-8">
<title>Home</title>

<link rel="stylesheet" href="./css/home_style.css">
<script type="text/javascript" src="./js/user_script.js"></script>
<link rel="stylesheet" href="./css/data_list.css">
 <link rel="stylesheet" href="./css/operation_page.css">
 <link rel="stylesheet" href="./css/insert.css">



</head>



<body >


	<div id="bg"></div>

	<div class="main-container">

       <%@ include file="header.jsp" %>
		

		<div class="content-container">

		<%@ include file="left_menu.jsp" %>


<div class="main-card-container" id="main-card-container" align="center">


<h1>Add Employee Record</h1>


	  
<form  name="addform" action="add"  method="post" enctype="multipart/form-data">

    <span>Employee Id</span>
    <div class="form-field">
        <input name="eid" type="text" placeholder="Employee Id" required onkeyup="checkUser()"/>
    </div>
    <p id="userid_error" name="userid_error"></p>

    <span>First Name</span>
    <div class="form-field">
        <input name="fname" type="text" placeholder="First Name" required />
    </div>
    
    <span>Last Name</span>
    <div class="form-field">
        <input name="lname" type="text" placeholder="Last Name" required />
    </div>
    
    <span>Email</span>
    <div class="form-field">
        <input name="email" type="email" placeholder="Email" required />
    </div>
    
   <div class="form-field">
        <button class="btn" id="sub_btn" type="submit" onclick="addOper()">Add</button>
  </div>

  <p id="status">${ status }</p>
    
    
</form>
     
      
	


























</div>

						
</div>

</div>



</div>


</body>
</html>






























 
 


 





