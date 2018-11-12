package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>register Page</title>\n");
      out.write("\t\t<style>\n");
      out.write("   .center {\n");
      out.write("    text-align:center;\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    border: 10px solid blue;\n");
      out.write("    padding: 10px;\n");
      out.write("    width: 500px;\n");
      out.write("    height: 950px;\n");
      out.write("    margin-right: 150px;\n");
      out.write("    margin-left: 350px;\n");
      out.write("}\n");
      out.write("     \tbody \n");
      out.write("        {                     \n");
      out.write("            color:darkblue;\n");
      out.write("        }\n");
      out.write("        label\n");
      out.write("        {\n");
      out.write("            color:darkblue;\n");
      out.write("        }\n");
      out.write("        {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("        {box-sizing: border-box}\n");
      out.write("\t\t\n");
      out.write("\tinput[type=text],input[type=email] {\n");
      out.write("        width: 40%;\n");
      out.write("        padding: 10px;\n");
      out.write("        margin: 5px 0 22px 0;\n");
      out.write("        display: inline-block;\n");
      out.write("        border: none;\n");
      out.write("        background: #f1f1f1;\n");
      out.write("}#submit\n");
      out.write("{\n");
      out.write("  background-color:brown;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 2px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 20%;\n");
      out.write("    opacity: 2.9;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    margin-left: 10px\n");
      out.write("}\n");
      out.write("footer{\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 0px;\n");
      out.write("            right: 0px;\n");
      out.write("            text-align: right;\n");
      out.write("}\n");
      out.write(".container\n");
      out.write("{\n");
      out.write("padding : 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<center><img src=\"vote6.jpg\" width=\"1300\" height=\"300\"></center>\n");
      out.write("        <form name=\"form\" method=\"post\" action=\"InfoAdd\" onsubmit=\"return validate()\">\n");
      out.write("                 <div class=\"container\">\n");
      out.write("                 <div class=\"center\">\n");
      out.write("                 <center> <h1><b><u>Voter Register</u></b></h1><br>\n");
      out.write("                 <label for=\"Name\" ><b>Aadhar Card No:-</b></label><br>\n");
      out.write("                 <input type=\"text\" placeholder=\"Enter Aadhar Card No\"  name=\"Aadhar Card No\" minlength=\"12\" maxlength=\"12\">\n");
      out.write("            <br><label for=\"Name\"><b>Voter Card No:-</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Voter Card No\" name =\"Voter Card No\" minlength=\"11\" maxlength=\"11\"><br>\n");
      out.write("            <label for=\"Name\"><b>Voter Name:-</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Voter Name\" name =\"Voter Name\" required><br>\n");
      out.write("            <label for=\"Name\"><b>Gender:-</b></label><br><br>\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"male\" checked>Male &nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"female\">Female &nbsp;&nbsp;&nbsp;\n");
      out.write("            <input type=\"radio\" name=\"gender\" value=\"other\">Other<br><br>\n");
      out.write("            <label for=\"D.O.B\"><b>D.O.B.:-</b></label><br>\n");
      out.write("            <input type=\"date\" name=\"bday\"><br><br>\n");
      out.write("            <label for=\"Name\"><b>Mobile Number:-</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Mobile Number\" name =\"mobile number\" minlength=\"10\" maxlength=\"10\"><br>\n");
      out.write("            <label for=\"Name\"><b>Address:-</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Address\" name =\"Address\" required><br>\n");
      out.write("            <label for=\"Name\"><b>City:-</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter City\" name =\"City\" required><br>\n");
      out.write("            <label for=\"Name\"><b>State:-</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter State\" name =\"state\" required><br>\n");
      out.write("            <label for=\"Name\"><b>Country:-</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Country\" name =\"Country\" required><br>\n");
      out.write("                 <center><input type=\"Submit\" id=\"submit\" value =\"Submit\"></center>\n");
      out.write("             </div>\n");
      out.write("             </div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
