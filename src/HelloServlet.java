import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * OkLine(Hangzhou) Co,ltd
 * Created by zhengjun
 * Date: 2019/4/13
 * Mail:zhengjun1987@outlook.com
 */
@WebServlet(name = "HelloServlet")
public class HelloServlet extends HttpServlet {
    private static final String TAG="HelloServlet";
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("request = [" + request.toString() + "], response = [" + response + "]");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.write("<html>");
        writer.write("<body>");
        writer.write("<h1>"+TAG+"<h1>");
        writer.write("<h2>"+new Date() +"<h2>");
        writer.write("</body>");
        writer.write("</html>");
        writer.flush();
        writer.close();
    }


}
