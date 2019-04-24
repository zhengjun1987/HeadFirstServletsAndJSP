package beerV1;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * OkLine(Hangzhou) Co,ltd
 * Created by zhengjun
 * Date: 2019/4/17
 * Mail:zhengjun1987@outlook.com
 */
@WebServlet(name = "BeerSelect")
public class BeerSelect extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("req = [" + req.getParameterNames().toString() + "], res = [" + res + "]");
        super.service(req, res);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BeerSelect.doPost");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("BeerSelect.doGet");
    }
}
