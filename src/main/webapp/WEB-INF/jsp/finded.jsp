<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>






<c:choose>

    <c:when test="${not empty emp}">



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


       

       
    </c:when> 

    <c:otherwise>

    <p>Employee Not found</p>
        
    </c:otherwise>

</c:choose>







    


























</div>

                        
</div>

</div>



</div>


</body>
</html>






























 
 


 





