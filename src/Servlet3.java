import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

@WebServlet(name = "Servlet3", value = "/Servlet3")
public class Servlet3 extends HttpServlet {
            @Override
            protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                response.setContentType("text/html;charset=utf-8");
                PrintWriter out = response.getWriter();

                LocalDateTime now = LocalDateTime.now();
                out.println("<html>" + "<body>" + "<button type=\"button\" onclick=\"location.href = '/index.html'\"><strong>메인메뉴</strong></button>" + "</body>" + "</html>");
//                while(true)
                {

                    out.println(now.getYear() + "/" + now.getMonthValue() + "/" + now.getDayOfMonth() + " " + now.getHour() + " : " + now.getMinute());
                }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
