package voting;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
   @Override
   public void service (HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
   {
       String Email =req.getParameter("email");
       String Password = req.getParameter("password");
       LoginBean LB = new LoginBean();
       LB.setEmail(Email);
       LB.setPassword(Password);
       loginDao LDD = new loginDao();
       Boolean check=LDD.getLogIn(LB);
        if(check==true)
            req.getRequestDispatcher("/Home.jsp").forward(req, res);
        else
        {
            req.setAttribute("errMessage", check);
            req.getRequestDispatcher("/login.jsp").forward(req, res);
        }
   }
}
