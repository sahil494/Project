package voting;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author SAHIL SINGLA
 */
@WebServlet(name = "newservet", urlPatterns = {"/newservet"})
public class newservet extends HttpServlet {

    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        try {
            Connection conn = DBConnection.getConnection();
            Statement st = conn.createStatement();
            String Email = req.getParameter("one");
            String checkQuery = "SELECT id FROM voters;";
            ResultSet rs = st.executeQuery(checkQuery);
            List<String> ids = new ArrayList<>();
            while(rs.next()) {
                ids.add(rs.getString(1));
            }
            HttpSession hs = req.getSession(false);
            if (hs == null) {
                res.sendRedirect("login.jsp");
                return;
            }
            String sessionEmail = (String) hs.getAttribute("email");
            if (sessionEmail == null) {
                res.sendRedirect("login.jsp");
                return;
            } else {
                if (ids.contains(sessionEmail)) {
                    System.out.println("Already voted");
                    req.setAttribute("cannotVote", true);
                    req.getRequestDispatcher("/voteus.jsp").forward(req, res);
                    return;
                }
            }
            System.out.println("break point");
            String query = " update election set votecounts=votecounts+1 where email=(?);";
            PreparedStatement ss = conn.prepareStatement(query);
            ss.setString(1, Email);
            int check = ss.executeUpdate();
            if (check != 0) {
                st.execute("INSERT INTO voters values ('"+Email+"', '"+sessionEmail+"')");
                req.setAttribute("cannotVote", false);
                //st.close();
                //conn.commit();
               req.getRequestDispatcher("/voteus.jsp").forward(req, res);
            } else {
                req.getRequestDispatcher("/voteus.jsp").forward(req, res);

            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(newservet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
