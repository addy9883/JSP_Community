package com.woori.exam.jsp.board;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.woori.exam.jsp.board.Rq;



@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Rq rq = new Rq(req, resp);

        int dan = rq.getIntParam("dan", 9);
        int limit = rq.getIntParam("limit", 9);


        // request에 정보를 담는다.
        // 왜냐하면 나중에 우리가 gugudan2.jsp 에서 해당 내용을 꺼내 쓰기 위해서
        rq.setAttr("dan",dan);
        rq.setAttr("limit",limit);


        // gugudan2.jsp에게 나머지 작업을 토스
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/gugudan2.jsp");
        requestDispatcher.forward(req,resp);

    }
}
