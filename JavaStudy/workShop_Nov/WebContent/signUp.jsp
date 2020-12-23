<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="bean.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="css/user.css">
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
       </div>
   </nav>
</div>
	<main>
	    <article>
	        <h3>Welcom!! We WorkShop Member</h3>
	        <form action="/workShop_october/signUp" method="POST" class="touroku">
	        <i class="fas fa-child"></i>
	        <input type="text" name="user" placeholder="Username" class="name"/>
	        <br>
	        <i class="fas fa-key"></i>
	        <input type="password" name="pass" placeholder="Password" class="pass"/><br>
	        <input type="submit" value="SignUp" id="signUp" name="signUp" class="btn">
	        </form>
	    </article>
	    <div class = "link">
	        <a href="login.jsp" >ログイン画面はこちら</a>
	    </div>
	</main>
	<footer>
	    <p>&copy;Y&I Group.inc</p>
	</footer>
</body>
</html>