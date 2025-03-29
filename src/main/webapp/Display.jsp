<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:forEach items="${students}" var="s">
${s}<br/>

</c:forEach>
<c:set var="str" value="I am Sanzida. I am 26" />
Length:${fn:length(str)}


<c:forEach items="${fn:split(str,' ')}" var="st">
${st}
<br/>
</c:forEach>
index:${fn:indexOf(str,"am")}

contains:${fn:contains(str,"Sanzida")}

<br/>
<c:if test="${fn:contains(str,'Sanzida')}">
 Sanzida there
</c:if>

<br/>

<c:if test="${fn:endsWith(str,'26')}">
ends with 26
</c:if>

<br/>
${fn:toLowerCase(str)}

<br/>
${fn:toUpperCase(str)}

</body>
</html>