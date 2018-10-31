<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="<%=path%>/js/jquery-1.12.0.min.js" ></script>

</head>
<body>
<ul>
    <div class="d1">
    <li><span class="class1">分类管理</span><br>
         <div class="d2">
             <a href="<%=path%>/booktype/addType.jsp"   target="right" >添加分类</a><br>
             <a href="<%=path%>/type?method=list"  target="right">查看分类</a>
         </div>
    </li>
    </div>
<div class="d3">
        <li><span class="class2">图书管理</span></li>
    <div class="d4">
         <a href="<%=path%>/book/addBook.jsp"    target="right">添加图书</a><br>
         <a href="<%=path%>/book?method=list"    target="right">查看图书</a>
    </div>
</div>
</ul>
</body>
</html>