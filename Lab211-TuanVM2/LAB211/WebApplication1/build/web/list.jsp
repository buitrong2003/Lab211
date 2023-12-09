<%-- 
    Document   : newjsplist
    Created on : Feb 10, 2022, 2:47:38 PM
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
       <h1>The list of employees</h1>
        <c:set var="did" value="${requestScope.did}"/>
        <form id="f" action="list">
            <select name="did" onchange="document.getElementById('f').submit()">
                <option value="0">Please choose a department</option>
                <c:forEach items="${requestScope.depts}" var="d">
                    <option <c:if test="${d.id==did}"> selected</c:if> 
                        value ="${d.id}">${d.name}</option>
                </c:forEach>
            </select>
        </form>
        <table border="1px">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>DOB</th>
                <th>Department</th>
                <th>Action</th>
            </tr>
         <c:forEach items="${requestScope.emps}" var="e">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.name}</td>
                 
                    <c:if test="${e.gender}">
                        <td><img src="images/male-icon.png"></td>
                    </c:if>
                    <c:if test="${!e.gender}">
                    <td><img src="images/female-icon.png"></td>
                    </c:if>
                       <td>${e.dob}</td>
                    <td>${e.dept.name}</td>
                    <td>
                        <a href="update?id=${e.id}" onclick="doDelete()">Edit</a> 
                    </td>
                </tr>
                    
            </c:forEach>
        </table>
    </body>
</html>
