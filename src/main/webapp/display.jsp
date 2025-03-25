<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
hello
<%
   // Object labelObj = request.getAttribute("label");
 //   String name = (labelObj != null) ? labelObj.toString() : "No label provided";
  //  out.println(name);
  
  
%>

${student.name}
<br>



<c:out value="${label}" />





<c:catch></c:catch>
</body>
</html>
