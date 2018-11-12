package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<title>Login Page</title>\n");
      out.write("<style>\n");
      out.write("body {font-family: Arial, Helvetica, sans-serif;}\n");
      out.write("form {border: 4px solid #f1f1f1;\n");
      out.write("     text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=email], input[type=password] {\n");
      out.write("    width: 30%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("    border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#log {\n");
      out.write("    background-color: green;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 15%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 24px 0 12px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img.voting {\n");
      out.write("    width: 25%;\n");
      out.write("    border-radius: 50%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("    padding: 20px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body bgcolor=\"#E6E6FA\">\n");
      out.write("\n");
      out.write("<h2> <center> Login Form</center></h2>\n");
      out.write("<form id=\"form\" action=\"LoginServlet\" method=\"POST\">\n");
      out.write("<div class=\"imgcontainer\">\n");
      out.write("<img src=\"vote.jpg\" alt=\"vote\" class=\"voting\">\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <label for=\"email\"><b>&nbsp;Email-ID:</b></label>\n");
      out.write("<input type=\"email\" placeholder=\"Enter Email\" name=\"email\"/>\n");
      out.write("<br>\n");
      out.write("<label for=\"password\"><b>Password:</b></label>\n");
      out.write("<input type=\"password\" placeholder=\"Enter password\" name=\"password\"/>\n");
      out.write("<br><br>\n");
      out.write("<center><input type=\"Submit\" id=\"log\" value=\"Login\"/></center>\n");
      out.write("<h4><center><a href=\"signup.jsp\" style=\"color:blue\">Don't have an account</center></a></h4>\n");
      out.write("</div>\t\t\t\t\n");
      out.write("</form>\t\n");
      out.write("</body>\n");
      out.write("</html>");
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
