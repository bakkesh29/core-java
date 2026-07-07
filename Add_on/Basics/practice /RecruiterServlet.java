import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RecruiterServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        ServletConfig config = getServletConfig();
        String email = config.getInitParameter("Email");

        PrintWriter out = response.getWriter();
        out.println("Recruiter Contact Email: " + email);
    }
}