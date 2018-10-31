<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%String path=request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="du" action="<%=path%>/type?method=add" method="post">
     分类名称：<input type="text"  name="TypeName"  }><br><br>
     <input type="hidden" name="Id" value=${b.id }>
    分类描述：<textarea name="TypeDes" style="width: 200px; height:100px"  }></textarea>
    <input type="submit" name="添加" value="添加">
</form>
</body>
</html>