<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<%@ page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
		<label class="login">
		  login
		  </label>
		  <label class="date">
		  <% Calendar cal = Calendar.getInstance();
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
          out.print(sdf.format(cal.getTime()));
	      %>
    	</label>
	</div>
</body>
</html>