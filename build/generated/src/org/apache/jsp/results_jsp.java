package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import voting.ListingBean;
import java.util.ArrayList;

public final class results_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
 ArrayList<ListingBean> ar = (ArrayList<ListingBean>)request.getAttribute("Lord"); 
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>voting</title>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  <script>\n");
      out.write("      </script>\n");
      out.write("  <style>\n");
      out.write("    p {\n");
      out.write("    font-family: \"Times New Roman\", Times, serif;\n");
      out.write("    font-size: 30px;\n");
      out.write("}\n");
      out.write("  #lol {\n");
      out.write("    background-color: #E0F2F1;\n");
      out.write("}\n");
      out.write(".colorgraph {\n");
      out.write("  height: 5px;\n");
      out.write("  border-top: 0;\n");
      out.write("  background: #c4e17f;\n");
      out.write("  border-radius: 5px;\n");
      out.write("  background-image: -webkit-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: -moz-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: -o-linear-gradient(left, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("  background-image: linear-gradient(to right, #c4e17f, #c4e17f 12.5%, #f7fdca 12.5%, #f7fdca 25%, #fecf71 25%, #fecf71 37.5%, #f0776c 37.5%, #f0776c 50%, #db9dbe 50%, #db9dbe 62.5%, #c49cde 62.5%, #c49cde 75%, #669ae1 75%, #669ae1 87.5%, #62c2e4 87.5%, #62c2e4);\n");
      out.write("}\n");
      out.write("\n");
      out.write("   .rainbow {\n");
      out.write("  \n");
      out.write("   /* Font options */\n");
      out.write("  font-family: 'Pacifico', cursive;\n");
      out.write("  text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px black;\n");
      out.write("  \n");
      out.write("   /* Chrome, Safari, Opera */\n");
      out.write("  -webkit-animation: rainbow 3s infinite; \n");
      out.write("  \n");
      out.write("  /* Internet Explorer */\n");
      out.write("  -ms-animation: rainbow 3s infinite;\n");
      out.write("  \n");
      out.write("  /* Standar Syntax */\n");
      out.write("  animation: rainbow 3s infinite; \n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Chrome, Safari, Opera */\n");
      out.write("@-webkit-keyframes rainbow{\n");
      out.write("  0%{color: orange;}\t\n");
      out.write("  10%{color: purple;}\t\n");
      out.write("\t20%{color: red;}\n");
      out.write("\t40%{color: yellow;}\n");
      out.write("\t60%{color: green;}\n");
      out.write("\t100%{color: blue;}\n");
      out.write("\t100%{color: orange;}\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Internet Explorer */\n");
      out.write("@-ms-keyframes rainbow{\n");
      out.write("  0%{color: orange;}\t\n");
      out.write("  10%{color: purple;}\t\n");
      out.write("\t20%{color: red;}\n");
      out.write("\t40%{color: yellow;}\n");
      out.write("\t60%{color: green;}\n");
      out.write("\t100%{color: blue;}\n");
      out.write("\t100%{color: orange;}\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Standar Syntax */\n");
      out.write("@keyframes rainbow{\n");
      out.write("  0%{color: orange;}\t\n");
      out.write("  10%{color: purple;}\t\n");
      out.write("\t20%{color: red;}\n");
      out.write("\t40%{color: yellow;}\n");
      out.write("\t60%{color: green;}\n");
      out.write("\t100%{color: blue;}\n");
      out.write("\t100%{color: orange;}\n");
      out.write("}\n");
      out.write("#boii {\n");
      out.write("    background-color:black;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 20px;\n");
      out.write("    margin: 8px 0;\n");
      out.write("    border: none;\n");
      out.write("    cursor: pointer;\n");
      out.write("    width: 100%;\n");
      out.write("    float:right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\" >\n");
      out.write("    <div class=\"navbar-nav mr-auto\">\n");
      out.write("        <div class=\"navbar-right\">\n");
      out.write("      <form action=\"logout\" method=\"post\"><button type=\"submit\" class=\"btn\" id=\"boii\">Logout</button></form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("      ");
  if(!ar.isEmpty()){
          for(int i=0;i<ar.size();i++)
      { 
      out.write("\n");
      out.write("      <div style=\"height:250px;\" id=\"lol\">\n");
      out.write("      <p style=\"color:#9C27B0;\">Name :");
      out.print( ar.get(i).getName());
      out.write("</p>\n");
      out.write("      <p style=\"color:#9C27B0;\">Email :");
      out.print( ar.get(i).getEmail());
      out.write("</p>\n");
      out.write("      <p style=\"color:#9C27B0;\">Partyname :");
      out.print( ar.get(i).getPartyname());
      out.write("</p>\n");
      out.write("      <p style=\"color:#9C27B0;\"> Votecount:");
      out.print( ar.get(i).getVotecount());
      out.write("</p>\n");
      out.write("      </div>\n");
      out.write("      <hr class=\"colorgraph\">\n");
      out.write("      ");
}}
      out.write("\n");
      out.write("    \n");
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
