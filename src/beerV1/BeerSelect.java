package beerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

/**
 * OkLine(Hangzhou) Co,ltd
 * Created by zhengjun
 * Date: 2019/4/17
 * Mail:zhengjun1987@outlook.com
 */
@WebServlet(name = "BeerSelect")
public class BeerSelect extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("getServletConfig().getServletName() = " + getServletConfig().getServletName());
        Enumeration<String> initParameterNames = getServletConfig().getInitParameterNames();
        while (initParameterNames.hasMoreElements()) {
            String element = initParameterNames.nextElement();
            System.out.println(element +" => "+ getServletConfig().getInitParameter(element));
        }
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("req = [" + req.getParameterNames().toString() + "], res = [" + res + "]");
        super.service(req, res);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String color = request.getParameter("color");
        List<String> advice = new BeerExpert().advice(color);
//        System.out.println("BeerSelect.doPost");
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//        writer.println("Beer Selection Advice<br>");
//        writer.println("<br>Got beer color " + advice);
//        writer.flush();
//        writer.close();

        request.setAttribute("styles",advice);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BeerSelect.doGet");
    }
}
