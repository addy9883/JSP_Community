<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8" %>

<title>구구단</title>
<%
    int dan = 9;
%>
<h1><%=dan%>단</h1>
<%
    for (int i = 1; i <= 9; i++) {%>
<div>
    <%=dan%> * <%=i%> = <%=dan * i%>
</div>
<%
    }
%>






