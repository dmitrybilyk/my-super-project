package servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by RUSLAN77 on  11.06.2018 in Ukraine
 */
public class AddServlet1 extends HttpServlet {
//    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*Как видим, этот метод принимает два обьекта: req (запрос) и resp (ответ). Это те самые объекты, которые создаст и наполнит нам Tomcat, когда вызовет соответствующий метод в этом сервлете. Для начала давайте сделаем простейшие ответы. Для этого возьмем объект resp и получим из него объект PrintWriter-а, которым можно составлять ответы. Ну и при помощи него выведем какую-нибудь простую строку.*/
//        PrintWriter writer = resp.getWriter();
//        writer.println("Method GET from AddServlet1");


        /*получаем из объекта запроса объект диспетчера запросов, куда передаем адрес jsp странички, которой мы хотим передать управление;
используя полученный объект — передаем управление в указанную jsp страницу, и не забываем вложить туда те объекты запроса и ответа, которые мы получили от Tomcat.*/
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/add.jsp");
        requestDispatcher.forward(req, resp);
    }
}
