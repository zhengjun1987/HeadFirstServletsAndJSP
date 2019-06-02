package beerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
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
            System.out.println(element + " => " + getServletConfig().getInitParameter(element));
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("================================ ServletConfig ================================");
        System.out.println("getServletContext().getMajorVersion() = " + getServletContext().getMajorVersion());
        System.out.println("getServletContext().getServerInfo() = " + getServletContext().getServerInfo());
        String adminEmail = getServletConfig().getInitParameter("adminEmail");
        System.out.println("adminEmail = " + adminEmail);

        Enumeration<String> attributeNames = getServletContext().getAttributeNames();
        while (attributeNames.hasMoreElements()) {
            String element = attributeNames.nextElement();
            System.out.println(element + " => " + getServletContext().getAttribute(element));
        }

        System.out.println("================================ ServletContext ================================");
        String mainEmail = getServletContext().getInitParameter("mainEmail");
        System.out.println("mainEmail = " + mainEmail);
        String color = request.getParameter("color");
        System.out.println("color = " + color);
        String body = request.getParameter("body");
        System.out.println("body = " + body);
        String[] sizes = request.getParameterValues("sizes");
        System.out.println("sizes = " + Arrays.toString(sizes));
        System.out.println("================================ HttpSession ================================");
        HttpSession httpSession = request.getSession();
        System.out.println("httpSession.getId() = " + httpSession.getId());
        System.out.println("httpSession.isNew() = " + httpSession.isNew());
        List<String> advice = new BeerExpert().advice(color);
//        System.out.println("BeerSelect.doPost");
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//        writer.println("Beer Selection Advice<br>");
//        writer.println("<br>Got beer color " + advice);
//        writer.flush();
//        writer.close();

        request.setAttribute("styles", advice);
        request.setAttribute("adminEmail", adminEmail);
//        request.setAttribute("mainEmail",mainEmail);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("result.jsp");

//        response.addHeader("foo","bar");
//        response.setHeader("foo","bar");
//        response.sendRedirect("");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BeerSelect.doGet");
        response.setContentType("text/html");
        Cookie cookie = new Cookie("username", "ZhengJun");
        cookie.setMaxAge(30 * 60);
        response.addCookie(cookie);
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>");
        String encodeURL = response.encodeURL("/checkcookie.do");
        int activeSessions = BeerSessionCounter.getActiveSessions();
        System.out.println("activeSessions = " + activeSessions);
        writer.println("<a href=\"" + encodeURL + "\">Click Me</a>");
        writer.println("</body></html>");

    }
}
