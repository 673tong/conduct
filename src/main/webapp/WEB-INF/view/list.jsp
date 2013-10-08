<%@ page import="com.qianyan.entity.Menu" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<body>
<%
    List<Menu> list =( List<Menu>)request.getAttribute("list");
    for(Menu menu:list){
          out.print(menu.getId()+":"+menu.getName()+"<br>");
    }
%>
</body>
</html>