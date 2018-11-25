package voting;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/InfoAdd"})
public class InfoAdd extends HttpServlet {

    @Override
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException ,ServletException
    {
        String name = req.getParameter("Name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String mobile = req.getParameter("phone");
        String address = req.getParameter("address");
        RegisterBean Reg = new RegisterBean();
        Reg.setName(name);
        Reg.setEmail(email);
        Reg.setPassword(password);
        Reg.setMobile(mobile);
        Reg.setAddress(address);
        RegisterDao rDao = new RegisterDao();
        Boolean check=rDao.getRegistered(Reg);
        if(check==true)
            req.getRequestDispatcher("voteus.jsp").forward(req, res);
        else {
            PrintWriter out = res.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Already have an account!');");
            out.println("location='signup.jsp';");
            out.println("</script>");
        }
    }
    
}
