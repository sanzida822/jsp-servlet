<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Statement, java.util.Random" errorPage="error.jsp"%>  
    
<%@page import= "java.util.ArrayList" %>    
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%  //pagecontext mainly set the attribute for current file. but we can set its scope  like session scope, request scope(curret page and whre sent the req)
pageContext.setAttribute("name","nitu", PageContext.SESSION_SCOPE);

	
	int k=9/0;	

		

%>


    <p>Name: <%= application.getInitParameter("name") %></p>
</head>
<body>

</body>
</html>