<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Statement, java.util.Random"%>  
    
<%@page import= "java.util.ArrayList" %>    
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% 
//pagecontext mainly set the attribute for current file. but we can set its scope  like session scope
pageContext.setAtribute("name","nitu", PageContext.SESSION_SCOPE);
%>
</head>
<body>

</body>
</html>