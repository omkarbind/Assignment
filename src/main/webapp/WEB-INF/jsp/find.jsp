
<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="UTF-8">
<title>Home</title>

<link rel="stylesheet" href="./css/home_style.css">
<script type="text/javascript" src="./js/user_script.js"></script>
<link rel="stylesheet" href="./css/data_list.css">
 <link rel="stylesheet" href="./css/operation_page.css">
 <link rel="stylesheet" href="./css/find.css">


</head>


<body >


	<div id="bg"></div>

	<div class="main-container">

    <%@ include file="header.jsp" %>
		

	<div class="content-container">

	<%@ include file="left_menu.jsp" %>


<div class="main-card-container" id="main-card-container" align="center">


<h1>Find Employee Record</h1>


	  
<form  name="myform" action="#" onsubmit="return find()"  method="post" enctype="multipart/form-data">

    <span>Employee Id</span>
    <div class="form-field">
        <input name="eid" type="text" placeholder="Employee Id" required />
    </div>
    
   <div class="form-field">
        <button class="btn" type="submit" onclick="find()">Find</button>
  </div>

	
    
    
</form>

<div id="result" name="result">  </div>


</div>

						
</div>

</div>



</div>


</body>
</html>

