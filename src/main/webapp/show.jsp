<%@page import="com.bean.Student"%>
<%@page import="com.dao.StudentDao"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<style type="text/css">
tr,td{
padding : 10px;
}
</style>
<body>
<table border="1" width="100%" >
<tr>
<th>ID</th>
<th>FIRST NAME</th>
<th>LAST NAME</th>
<th>EMAIL</th>
<th>MOBILE</th>
<th>ADDRESS</th> 
<th>GENDER</th>
</tr>
<%
  List<Student> list = StudentDao.getAllStudent();
  for(Student s:list){
%>	
<tr>
<td><%=s.getId()%></td>
<td><%=s.getFname() %></td>
<td><%=s.getLname() %></td>
<td><%=s.getEmail() %></td>
<td><%=s.getMobile() %></td>
<td><%=s.getAddress() %></td>
<td><%=s.getGender() %></td>
</tr>

<% 
  }

%>
<tr>
</tr>

</table>



</body>
</html>