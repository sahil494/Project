package voting;
import java.sql.*;
public class RegisterDao {

 public boolean getRegistered(RegisterBean RR)
 {
     String Name10 = RR.getName();
     String Email10 = RR.getEmail();
     String Password10 = RR.getPassword();
     String Mobile10 = RR.getMobile();
     String Address10 = RR.getAddress();
     try
     {
         Connection conn=DBConnection.getConnection();
         String query1="select Email from signup where Email=?";
         PreparedStatement Ps1=conn.prepareStatement(query1);
         Ps1.setString(1,Email10);
         Ps1.execute();
         ResultSet f=Ps1.getResultSet();
         if(f.next()){
        conn.close();
          return false;}
         String query="insert into signup values(?,?,?,?,?)";
         PreparedStatement pS = conn.prepareStatement(query);
         pS.setString(1, Name10);
         pS.setString(2, Email10);
         pS.setString(3, Password10);
         pS.setString(4, Mobile10);
         pS.setString(5, Address10);
         int i= pS.executeUpdate();
         conn.close();
         if(i!=0)
             return true;
         else
             return false;
     }
     catch(Exception e)
     {
         System.out.println(e);
     }
     return false;
 }
}
