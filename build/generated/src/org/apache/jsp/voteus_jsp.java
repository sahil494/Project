package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class voteus_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>vote us</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("      .navbar {\n");
      out.write("      margin-bottom: 0;\n");
      out.write("      border-radius: 0;\n");
      out.write("    }\n");
      out.write(".imgcontainer {\n");
      out.write("    text-align:left;\n");
      out.write("}\n");
      out.write("img.voting {\n");
      out.write("    width: 15%;\n");
      out.write("}\n");
      out.write("     .jumbotron {\n");
      out.write("      margin-bottom: 5;\n");
      out.write("    }\n");
      out.write(".container .btn {\n");
      out.write("    position: absolute;\n");
      out.write("    top: 50%;\n");
      out.write("    left: 50%;\n");
      out.write("    transform: translate(-50%, -50%);\n");
      out.write("    -ms-transform: translate(-50%, -50%);\n");
      out.write("    background-color:#555;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 20px;\n");
      out.write("    padding: 12px 24px;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write(".container .btn:hover {\n");
      out.write("    background-color:black;\n");
      out.write("}\n");
      out.write("#boii {\n");
      out.write("    background-color:black;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("  <script>\n");
      out.write("      ");

          
          Object bool = request.getAttribute("cannotVote");
          boolean cannotVote;
          boolean hasCannotVote = false;
          if (bool == null) {
              cannotVote = false;
          } else {
              cannotVote = (boolean) bool;
              hasCannotVote = true;
          }
          
          if (cannotVote) {
      
      out.write("\n");
      out.write("          alert(\"You have already Voted !\");\n");
      out.write("          ");
} else if (!cannotVote && hasCannotVote){ 
      out.write("\n");
      out.write("          alert(\"Thanks for voting!\");\n");
      out.write("          ");
 } 
      out.write("\n");
      out.write("      </script>\n");
      out.write("</head>\n");
      out.write("<body>   \n");
      out.write("<nav class=\"navbar navbar-inverse\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.html\">HOME</a>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n");
      out.write("      <ul class=\"nav navbar-nav\">\n");
      out.write("      </ul>\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("          <li>\n");
      out.write("              <form action=\"WatchForResults\">\n");
      out.write("                  <button type=\"submit\" class=\"btn\" id=\"boii\">WATCH RESULTS</button>      \n");
      out.write("              </form>\n");
      out.write("          </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<center><p><u><font size=\"40\" color=\"green\">Your Vote is precious for Us! Every Vote counts!</font></u></p></center>\n");
      out.write("<div class=\"container\">\n");
      out.write("  <br>\n");
      out.write("      <div class=\"col-sm-5\">\n");
      out.write("      <div class=\"row-sm-5\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("          <div class=\"panel-body\"><img src=\"us1.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("          <center><div class=\"panel-footer\"><strong>Name:-Jack Jones<br>Age:-22<br>Year:-3rd<br>E-mail:-jack.jones@gmail.com<br>Contact Number:-9898979695<br>Party Name:-CU,H.P.</strong>\n");
      out.write("                  <form method=\"post\" action=\"newservet\">\n");
      out.write("                      <input type=\"hidden\" value=\"jack.jones@gmail.com\" name=\"one\">\n");
      out.write("                      <button type=\"submit\" class=\"btn\">VOTE</button>\n");
      out.write("                  </form>\n");
      out.write("              </div></center>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"col-sm-5\">\n");
      out.write("          <div class=\"row-sm-5\">\n");
      out.write("          <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-body\"><img src=\"us2.jpg\" class=\"img-responsive\" style=\"width:95%\" alt=\"Image\">\n");
      out.write("              <form method=\"post\" action=\"newservet\">\n");
      out.write("                      <input type=\"hidden\" value=\"harry.potter@gmail.com\" name=\"one\">\n");
      out.write("                      <button type=\"submit\" class=\"btn\">VOTE</button>\n");
      out.write("                  </form>\n");
      out.write("        </div>\n");
      out.write("        <center><div class=\"panel-footer\"><strong>Name:-Harry Potter<br>Age:-21<br>Year:-3rd<br>E-mail:-harry.potter@gmail.com<br>Contact Number:-9555947950<br>Party Name:-CU,P.B.</strong></div></center>\n");
      out.write("       </div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<br><br>\n");
      out.write("<div class=\"container\">\n");
      out.write("      <div class=\"col-sm-5\">\n");
      out.write("      <div class=\"row-sm-5\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-body\"><img src=\"us11.jpg\" class=\"img-responsive\" style=\"width:100%\" alt=\"Image\"></div>\n");
      out.write("        <center><div class=\"panel-footer\"><strong>Name:-Shane Watson<br>Age:-22<br>Year:-3rd<br>E-mail:-shane.watson@gmail.com<br>Contact Number:-9833322218<br>Party Name:-SOI</strong>\n");
      out.write("           <form method=\"post\" action=\"newservet\">\n");
      out.write("                      <input type=\"hidden\" value=\"shane.watson@gmail.com\" name=\"one\">\n");
      out.write("                      <button type=\"submit\" class=\"btn\">VOTE</button>\n");
      out.write("                  </form>\n");
      out.write("            </div></center>\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-sm-5\">\n");
      out.write("        <div class=\"row-sm-5\">\n");
      out.write("      <div class=\"panel panel-primary\">\n");
      out.write("        <div class=\"panel-body\"><img src=\"us10.jpg\" class=\"img-responsive\" style=\"width:90%\" alt=\"Image\"></div>\n");
      out.write("        <center><div class=\"panel-footer\"><strong>Name:- Omar Borkan Al Gala<br>Age:-23<br>Year:-3rd<br>E-mail:-omar.gala@gmail.com<br>Contact Number:-7508477528<br>Party Name:-SOPU</strong>\n");
      out.write("         <form method=\"post\" action=\"newservet\">\n");
      out.write("                      <input type=\"hidden\" value=\"omar.gala@gmail.com\" name=\"one\">\n");
      out.write("                      <button type=\"submit\" class=\"btn\">VOTE</button>\n");
      out.write("                  </form>\n");
      out.write("            </div></center>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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
