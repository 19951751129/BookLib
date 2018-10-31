<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<%String path=request.getContextPath();%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- -req   list -->
<title>Insert title here</title>
 <style type="text/css">
td{width: 150px;height: 20px;}
    </style>
</head>

<body>
<table border="1" cellspacing="1" align="center">
 <caption><h1>分类信息</h1></caption>
    <tr>
        <td>分类名称</td>
        <td>分类描述</td>
        <td>操作</td>
    </tr>




<c:forEach   var="b"      items="${booklist}">
<tr>
<td>${b.typeName}</td>
<td>${b.des}</td>
<td><a href="<%=path%>/type?method=delete&id=${b.id}" >删除</a>  <a href="<%=path%>/type?method=select&id=${b.id}" >修改</a></td>
</tr>
</c:forEach>

   
  
    
   
    
 
</table>
</body>
</html>