<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bean.*" %>
<%@ page import="java.util.ArrayList" %>
<%
	ArrayList<ShohinBean> shohin = (ArrayList<ShohinBean>) application.getAttribute("shohin");
	UserBean userInfo = (UserBean) session.getAttribute("userInfo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="css/common.css">
<title>ワークショップEC</title>
</head>
<body>
<div class="nav">
    <nav class="navbar navbar-expand bg-white">
        <div class="navbar-brand ml-2"><h2>WorkShop</h2></div>
        <div class="row ml-2 my-auto">
            <ul class="navbar-nav mr-auto align-items-center">
                <li class="nav-item p-2 font-weight-bold">ITEMS</li>
                <li class="nav-item p-2 font-weight-bold">FEATURE</li>
                <li class="nav-item p-2 font-weight-bold">COORDINATE</li>
                <li class="nav-item p-2 font-weight-bold">SHOP</li>
                <li class="nav-item p-2 font-weight-bold">CONTENT</li>
                <li class="nav-item p-2 ml-3"><img src="img/icon/hart.png" alt=""></li>
                <li class="nav-item p-2">
                	<a href="login.jsp"><img src="img/icon/man.png" alt=""></a>
                </li>
                <li class="nav-item p-2"><img src="img/icon/cart.png" alt=""></li>
            </ul>
            <form class="form-inline my-1 my-lg-0 px-2">
                <input class="form-control mr-sm-1" type="search" placeholder="Search">
                <img src="img/icon/search.png" alt="" type="submit">
            </form>
            <% if(userInfo != null){ %>
			<span><%=userInfo.getName() %></span>
			<%} %>
        </div>
    </nav>
</div>
<div class="container">
    <h2 class="category-title mx-auto p-3">
        <div class="en">ITEMS</div>
        <div class="ja">商品</div>
    </h2>
	<div class="row">
	<% for(ShohinBean list : shohin){ %>
		<form action="/workShop_october/detail" method="get" class="col-md-4 mx-atuo p-5 items">
			<input type="hidden" name="id" value="<%=list.getId() %>">
	       <button type="submit" class="btn bg-white">
	           <div class="img mx-auto"><img src="<%=list.getImageUrl() %>" alt="商品画像"></div>
	           <div class="item-info">
	               <span class="item-title"><%=list.getName()  %></span><br/>
	               <span class="price">￥ <%=list.getPrice() %>(税込)</span>
	           </div>
	       </button>
       </form>
    <% }%>
    </div>
</div>
</body>
</html>