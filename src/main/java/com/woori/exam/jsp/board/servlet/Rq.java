package com.woori.exam.jsp.board.servlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    private final HttpServletRequest req;
    private final HttpServletResponse resp;

    public Rq(HttpServletRequest req, HttpServletResponse resp) {
        this.req = req;
        this.resp = resp;

        try {
            req.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html; charset UTF-8");
    }

    public int getIntParam(String paramName, int defaultValue) {
        String value = req.getParameter(paramName);

        if(value == null) {
            return defaultValue;
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    public void appendBody(String str) {
        try {
            resp.getWriter().append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Object getAttr(String name){
       return req.getAttribute(name);
    }

    public void setAttr(String name,Object value){
        req.setAttribute(name,value);
    }
}