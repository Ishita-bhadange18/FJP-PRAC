import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CalculatorServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Calculator</title></head>");
        out.println("<body>");

        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        if (num1Str != null && num2Str != null && operation != null) {
            try {
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);
                int result = 0;

                if (operation.equals("add")) {
                    result = num1 + num2;
                } else if (operation.equals("subtract")) {
                    result = num1 - num2;
                } else if (operation.equals("multiply")) {
                    result = num1 * num2;
                } else if (operation.equals("divide")) {
                    result = num1 / num2;
                }

                out.println("<h2>Result: " + result + "</h2>");
            } catch (NumberFormatException e) {
                out.println("<h2>Invalid numbers</h2>");
            } catch (ArithmeticException e) {
                out.println("<h2>Cannot divide by zero</h2>");
            }
        }

        out.println("<form action=\"\" method=\"GET\">");
        out.println("Number 1: <input type=\"text\" name=\"num1\"><br>");
        out.println("Number 2: <input type=\"text\" name=\"num2\"><br>");
        out.println("Operation: <select name=\"operation\">");
        out.println("<option value=\"add\">Add</option>");
        out.println("<option value=\"subtract\">Subtract</option>");
        out.println("<option value=\"multiply\">Multiply</option>");
        out.println("<option value=\"divide\">Divide</option>");
        out.println("</select><br>");
        out.println("<input type=\"submit\" value=\"Calculate\">");
        out.println("</form>");

        out.println("</body></html>");
        out.close();
    }
}

