package foo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ELTestServlet")
public class ELTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Person person = new Person();
        person.setName("LeeLu");
        Dog dog = new Dog();
        dog.setName("Clyde");
        person.setDog(dog);
        Toy toy1 = new Toy();
        toy1.setName("stick");
        Toy toy2 = new Toy();
        toy2.setName("neighbor's cat");
        Toy toy3 = new Toy();
        toy3.setName("Barbie™ doll head");
        dog.setToys(new Toy[]{toy1,toy2,toy3});
        request.setAttribute("person",person);
        getServletContext().setAttribute("currentTip","Tags make things bold!");
        RequestDispatcher requestDispatcher =
                request.getRequestDispatcher("elTest.jsp");
        requestDispatcher.forward(request,response);
    }
}
