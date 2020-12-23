<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<link rel="stylesheet" href="./css/style.css">
<link rel="stylesheet" href="./css/common.css">
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
	<form action="/workShop_october/newItem" method="post" class="newItemPost">
	        <label class="item-label">商品名<input type="text" name="item"class="item"/></label>
	        <br>
	        <label class="price-label">値段<input type="text" name="price" class="price"/></label>
	        <br>
	        <label class="img-label">商品画像<br><span class="description">(※画像のリンクを添付してください)</span></label><input type="file"  name="img" class="img">
			<br>
			<label class="category-label">カテゴリ
			<select name="category" size="1" class="category">
			<option value="1">机</option>
			<option value="2">椅子</option>
			<option value="3">棚 </option>
			<option value="9">その他</option>
			</select>
			</label>
			<br>
			<input type="submit" value="登録する" class="newItem-submit">
	</form>
</main>
<footer>
    <div class="footer-main">
        <div class="footer-text">
            <p>©Y&I Group.inc</p>
        </div>
    </div>
</footer>
</body>
</html>