package voting;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import voting.DBConnection;
import voting.ListingBean;

@WebServlet(name = "WatchForResults", urlPatterns = {"/WatchForResults"})
public class WatchForResults extends HttpServlet {
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try
         {
             Connection conn = DBConnection.getConnection();
             String que="select name,email,party_name,votecounts from election;";
             Statement st = conn.createStatement();
             ResultSet resultSet=st.executeQuery(que);
                           ArrayList<ListingBean> Arr = new ArrayList<ListingBean>(); 
             while(resultSet.next()){
                Arr.add(new ListingBean(resultSet.getString("name"),resultSet.getString("email"),resultSet.getString("party_name"),resultSet.getString("votecounts")));
               }
             // out.println("");
              request.setAttribute("Lord", Arr);
              request.getRequestDispatcher("/results.jsp").include(request, response);
          } 
          
         catch (IOException | ClassNotFoundException | SQLException | ServletException ex) {
             System.out.print(ex);
         }
    }
    
     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         processRequest(req,resp);
     }
     
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         processRequest(req,resp);
     }
}
