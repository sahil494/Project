package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<title>homepage</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<div class=\"w3-top\">\n");
      out.write("  <div class=\"w3-bar w3-white w3-wide w3-padding w3-card\">\n");
      out.write("    <a href=\"#home\" class=\"w3-bar-item w3-button\"><b>POLL</b>TODAY</a>\n");
      out.write("    <div class=\"w3-right w3-hide-small\">\n");
      out.write("      <a href=\"login.jsp\" class=\"w3-bar-item w3-button\">LOGIN</a>\n");
      out.write("      <a href=\"Register.jsp\"class=\"w3-bar-item w3-button\">REGISTER</a>\n");
      out.write("      <a href=\"feedback.jsp\" class=\"w3-bar-item w3-button\">FEEDBACK</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<header class=\"w3-display-container w3-content w3-wide\" style=\"max-width:1500px;\" id=\"home\">\n");
      out.write("  <!--<img class=\"w3-image\" src=\"vote2.jpg\" width=\"1500\" height=\"800\">-->\n");
      out.write("  <div class=\"w3-display-middle w3-margin-top w3-center\">\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write(" <div class=\"w3-content w3-padding\" style=\"max-width:1564px\">\n");
      out.write("  <div class=\"w3-container w3-padding-32\" id=\"about\">\n");
      out.write("    <h3 class=\"w3-border-bottom w3-border-light-grey w3-padding-16\">About</h3>\n");
      out.write("    <p>Nowadays, there are tons of things we do online, from shopping to doing any kind of official arrangement. And you may think, why not voting online too? Whether you are part of a small, medium or large organization, you may have thought at some point about the reasons to choose online voting and how it could benefit your entity.\n");
      out.write("    </p>\n");
      out.write("    <p>PollToday was created in 2018. Our goals at PollToday are to:\n");
      out.write("    <ul>\n");
      out.write("    <li>Provide the best possible experience for both voters and election managers. Getting voters to vote is challenging so we provide a clean and simple user interface for voters. Polltoday is so fast and easy to use and available </li><br>\n");
      out.write("    <li>Provide top-notch security and reliability. PollToday encrypts voting pages with state-of-the-art encryption for security, runs on Google servers for fast responses.</li><br>\n");
      out.write("    <li>Maintain voter privacy. Voter emails are used ONLY for your election..</li><br>\n");
      out.write("    <li>Be cost effective! PollToday is much less expensive than most other providers even though PollToday provides better services.</li><br>\n");
      out.write("    <li>Promote the use of better voting techniques. PollToday specializes in ranked voting because ranked voting provides better outcomes than check-the-box voting.</li>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-container w3-padding-20\" id=\"online voting\">\n");
      out.write("  <h3 class=\"w3-border-bottom w3-border-light-grey w3-padding-16\">Why to choose online voting?</h3>\n");
      out.write("  <ul>\n");
      out.write("      <li><strong>Vote at any time from anywhere: </strong><p>Today's way of living doesn't leave much free time. We have little to no time to do anything or go anywhere. So don't you think that maybe giving the chance to the members of your organization to cast their vote in just a few minutes, without the need to go to a certain place, would be a good option? If your answer is ?yes?, then you should probably consider online voting. Unlike traditional voting, that makes voters go to a specific place at a specific time in order to vote, online voting allows them to cast their vote at any time of the day and from any place, just with the need of an Internet connection.</p></li>\n");
      out.write("      <li><strong>Boost Participation: </strong><p>As a result of the previous point, choosing online voting for your election will more likely boost the participation. You will give the chance to members that otherwise may not be able to vote. At this point, you might be thinking \"what about the people that for any reason can't vote online, wouldn't we lose their participation then?\". I have good news for you: running an electoral process online does not mean that you have to discard traditional voting. This is not one thing or the other.</p></li>\n");
      out.write("      <li><strong>Less Physical Infrastructure</strong><p>When running a voting online, you avoid the need for all the physical infrastructure usually required on a traditional voting. No need of paper, printing, physical urns or staff may, therefore, lead to a lower monetary investment.</p></li>\n");
      out.write("      <li><strong>Fast and easy votes tally</strong><p>Since the tally in online voting is run by machines, you can assure that it will not have human counting errors and that it will in most cases run faster than a count carried out by persons, so the results of your election will be available sooner.</p></li>\n");
      out.write("  </ul>\n");
      out.write("  <div class=\"w3-container w3-padding-20\" id=\"contact\">\n");
      out.write("    <h3 class=\"w3-border-bottom w3-border-light-grey w3-padding-16\">Contact Us</h3>\n");
      out.write("    <form action=\"/action_page.php\" target=\"_blank\">\n");
      out.write("      <input class=\"w3-input w3-border\" type=\"text\" placeholder=\"Name\" required name=\"Name\" minlength=\"3\">\n");
      out.write("      <input class=\"w3-input w3-section w3-border\" type=\"text\" placeholder=\"Email\" required name=\"Email\">\n");
      out.write("      <input class=\"w3-input w3-section w3-border\" type=\"text\" placeholder=\"Subject\" required name=\"Subject\">\n");
      out.write("      <input class=\"w3-input w3-section w3-border\" type=\"text\" placeholder=\"Comment\" required name=\"Comment\" maxlength=\"70\">\n");
      out.write("      <button class=\"w3-button w3-black w3-section\" type=\"submit\">\n");
      out.write("        <i class=\"fa fa-paper-plane\"></i> SEND MESSAGE\n");
      out.write("      </button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("<footer class=\"w3-center w3-black w3-padding-16\">\n");
      out.write("<p>Powered by Sahil Aggarwal</p>\n");
      out.write("</footer>\n");
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
