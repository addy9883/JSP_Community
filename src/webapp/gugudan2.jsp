<%@ page language="java" contentType="text/html;" pageEncoding="UTF-8" %>
<%@ page import="com.woori.exam.jsp.board.servlet.Rq" %>
<title>구구단</title>
<%
    Rq rq = new Rq(request,response);
    int dan = (int) rq.getAttr("dan"); ;
    int limit = (int) rq.getAttr("limit");
%>
<h1><%=dan%>단</h1>
<%
    for (int i = 1; i <= 9; i++) {%>
<div>
    <%=dan%> * <%=i%> = <%=dan * i%>
</div>
<%}%>






