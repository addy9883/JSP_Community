<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8" %>
<%@ page import="com.woori.exam.jsp.board.Rq" %>
<title>구구단</title>
<%
    Rq rq = new Rq(request,response);
    int dan = rq.getIntParam("dan",9);
    int limit = rq.getIntParam("limit",10);
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






