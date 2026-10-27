package demo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/calculate")
public class MarksServlet extends HttpServlet {

    private final GradeCalculator calculator = new GradeCalculator();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            int a = Integer.parseInt(request.getParameter("m1"));
            int b = Integer.parseInt(request.getParameter("m2"));
            int c = Integer.parseInt(request.getParameter("m3"));

            request.setAttribute("total", calculator.total(a, b, c));
            request.setAttribute("average", calculator.average(a, b, c));
            request.setAttribute("grade", calculator.grade(a, b, c));
        } catch (RuntimeException ex) {
            request.setAttribute("error", "Enter valid whole-number marks from 0 to 100.");
        }
        request.getRequestDispatcher("/marks-result.jsp").forward(request, response);
    }
}
