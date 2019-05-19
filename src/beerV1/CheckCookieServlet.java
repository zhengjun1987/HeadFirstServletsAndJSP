package beerV1;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by zhengjun
 * Date: 2019/5/2
 * Mail:zhengjun1987@outlook.com
 */
public class CheckCookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        Cookie[] cookies = req.getCookies();
        writer.println("<html><body>");
        for (Cookie cookie : cookies) {
            System.out.println("cookie = " + cookie);
            if (cookie.getName().equals("username")) {
                String value = cookie.getValue();
                System.out.println("value = " + value);
                writer.println("<h1>Hello, "+ value+"</h1>");
                break;
            }
        }
        writer.println("</body></html>");
        writer.flush();
        writer.close();
    }
}
