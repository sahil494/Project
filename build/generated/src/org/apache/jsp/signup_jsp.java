package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Sign-Up Page</title>\n");
      out.write("        <script>\n");
      out.write("            function validate()\n");
      out.write("            {\n");
      out.write("                var Pwd = document.form.password.value;\n");
      out.write("                var Cpwd = document.form.confirm.value;\n");
      out.write("                 if (Pwd != Cpwd)\n");
      out.write("                {\n");
      out.write("                    alert(\"Confirm Password should match with the Password\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\t\t<style>\n");
      out.write("     \tbody {\n");
      out.write("            color:black;\n");
      out.write("        }\n");
      out.write("        {\n");
      out.write("            font-family: Arial, Helvetica, sans-serif;\n");
      out.write("        }\n");
      out.write("        * {box-sizing: border-box}      \n");
      out.write("\t\tinput[type=text], input[type=password],input[type=email],input[type=tel] {\n");
      out.write("        width: 20%;\n");
      out.write("        padding: 10px;\n");
      out.write("        margin: 5px 0 22px 0;\n");
      out.write("        display: inline-block;\n");
      out.write("        border: none;\n");
      out.write("        background: #f1f1f1;\n");
      out.write("}#submit\n");
      out.write("{\n");
      out.write("  background-color: green;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 15%;\n");
      out.write("    opacity: 2.9;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    margin-left: 10px\n");
      out.write("}\n");
      out.write("#submit:hover{\n");
      out.write("            border: none;\n");
      out.write("            background: #943126;\n");
      out.write("}\n");
      out.write("footer{\n");
      out.write("            position: absolute;\n");
      out.write("            bottom: 0px;\n");
      out.write("            right: 0px;\n");
      out.write("            text-align: right;\n");
      out.write("}\n");
      out.write(".container\n");
      out.write("{\n");
      out.write("padding : 25px;\n");
      out.write("}\n");
      out.write(".bg {\n");
      out.write("    background-image: url(\"vote3.jpg\");\n");
      out.write("    height: 119%; \n");
      out.write("    background-position: center;\n");
      out.write("    background-repeat: no-repeat;\n");
      out.write("    background-size: cover;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"bg\">\n");
      out.write("        <form name=\"form\" method=\"post\" action=\"InfoAdd\" onsubmit=\"return validate()\" style=\"border:1px solid #ccc\">\n");
      out.write("             <div class=\"container\">\t\t  \n");
      out.write("                 <h1><center>Register to vote</center></h1>\n");
      out.write("                 <p><center>Please fill in this form to create an account.</center></p>\n");
      out.write("             <br>\n");
      out.write("            <center><label for=\"Name\" ><b>Student Name</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter your Name\"  name=\"Name\" minlength=3 required size=\"5\">\n");
      out.write("            <br><label for=\"email\" ><b>Student Id</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter Student Id\" name =\"email\" required maxlength=\"10\" minlength=\"10\">\n");
      out.write("            <br><label for=\"password\" ><b>Password</b></label><br>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"password\" id=\"myInput\" minlength=\"8\" required><br>\n");
      out.write("            <input type=\"checkbox\" onclick=\"myFunction()\">Show Password\n");
      out.write("            <br>\n");
      out.write("            <script>\n");
      out.write("            function myFunction() {\n");
      out.write("            var x = document.getElementById(\"myInput\");\n");
      out.write("            if (x.type === \"password\") {\n");
      out.write("            x.type = \"text\";\n");
      out.write("            } \n");
      out.write("            else\n");
      out.write("            {\n");
      out.write("        x.type = \"password\";\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("          </script>\n");
      out.write("            <br>\n");
      out.write("            <label for=\"confirm\"><b>Confirm Password</b></label><br>\n");
      out.write("            <input type=\"password\" placeholder=\"Confirm Password\" name=\"confirm\" minlength=\"8\">\n");
      out.write("            <br><label for=\"phone\" ><b>Mobile Number</b></label><br>\n");
      out.write("            <input type=\"tel\" placeholder=\"Enter your Mobile number\"  name=\"phone\" minlength=10 maxlength=10 required>\n");
      out.write("            <br><label for=\"address\" ><b>Address</b></label><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Enter your Address\" name=\"address\" required>\n");
      out.write("            <br>\n");
      out.write("            <center><a href=\"login.jsp\"><input type=\"submit\" id=\"submit\" value =\"Sign Up\"></a></center>\n");
      out.write("             </div></form>\n");
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
