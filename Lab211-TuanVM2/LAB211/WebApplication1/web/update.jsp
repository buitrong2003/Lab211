<%-- 
    Document   : newjspupdate
    Created on : Feb 10, 2022, 2:48:25 PM
    Author     : Nam Ast
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Update a Employee</h1>
        <c:set var="e" value="${requestScope.emp}"/>
        <form action="update" method="post">
            Enter ID:<input type="text" readonly name="id" value ="${e.id}"/><br/>
            Enter name:<input type="text"  name="name" value ="${e.name}"/><br/>
            Enter DOB:<input type="text"  name="dob" value ="${e.dob}"/><br/>
            Select gender:<input type="radio"  name="gender" 
                                 <c:if test="${e.gender}" >checked</c:if>
                                 value ="1"/>Male
                          <input type="radio" name="gender" 
                                 value ="0"/>Female
           <br/>
           Department:
           <select name="did">
           <jsp:useBean id="dao" class="dal.DAO"/>
           <c:forEach items="${dao.all}" var="d">
               <option <c:if test="${d.id==e.dept.id}">selected</c:if>
                       value="${d.id}">${d.name}</option>
               </c:forEach>
           </select><br/>
           <input type="submit" value="UPDATE">
           
        </form>
    </body>
</html>
