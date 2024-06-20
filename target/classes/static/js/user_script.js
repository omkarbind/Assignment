

function checkUser(){
	
	
	var eid=document.addform.eid.value.trim();
	
	document.getElementById("userid_error").innerHTML=""; 
	document.getElementById("sub_btn").disabled = false;
	document.getElementById("status").innerHTML=""; 
	

	var xmlhttp=new XMLHttpRequest();


	xmlhttp.onreadystatechange = function(){

	if( xmlhttp.readyState==4 && xmlhttp.status==200 ){
		
		var status = xmlhttp.responseText;
		
	  
	
	    if( status != "Already Registered" ){
	    	document.getElementById("sub_btn").disabled = false;
	    	document.getElementById("userid_error").innerHTML="Employee id avialable"; 
	    }else{
	    	document.getElementById("sub_btn").disabled = true;
	    	document.getElementById("userid_error").innerHTML=status;;
	    }
	    
	
	}
	
  }

	xmlhttp.open( "GET" , "/checkeid?eid="+eid ,  true);
	xmlhttp.send(  );  

	return false;
	
}






function find(){

	var eid = myform.eid.value.trim();
	
	var result = document.getElementById('result');
	
	var xmlhttp=new XMLHttpRequest();
   

	xmlhttp.onreadystatechange = function(){

	    if( xmlhttp.readyState==4 && xmlhttp.status==200 ){
		
	    	result.innerHTML = xmlhttp.responseText ;
		
	    }
	    
	}
	    	  	
	xmlhttp.open( "POST" , "/find?eid="+eid ,  true);
	xmlhttp.send(  );  
	

	return false;
	
}









function find1(){

	var eid = myform.eid.value.trim();
	
	var result = document.getElementById('result');
	
	var xmlhttp=new XMLHttpRequest();
   

	xmlhttp.onreadystatechange = function(){

	    if( xmlhttp.readyState==4 && xmlhttp.status==200 ){
		
	    	result.innerHTML = xmlhttp.responseText ;
		
	    }
	    
	}
	    	  	
	xmlhttp.open( "POST" , "/find1?eid="+eid ,  true);
	xmlhttp.send(  );  
	

	return false;
	
}


function delete1(){

	var eid = myform.eid.value.trim();

	var result = document.getElementById('status');
	
	var xmlhttp=new XMLHttpRequest();
   

	xmlhttp.onreadystatechange = function(){

	    if( xmlhttp.readyState==4 && xmlhttp.status==200 ){
		
	    	result.innerHTML = xmlhttp.responseText ;
	    	myform.eid.value = " ";

		
	    }
	    
	}
	    	  	
	xmlhttp.open( "POST" , "/delete1?eid="+eid ,  true);
	xmlhttp.send(  );  
	

	return false;
	
}