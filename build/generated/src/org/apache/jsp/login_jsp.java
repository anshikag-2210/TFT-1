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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Only For Admin</h1>\n");
      out.write("        <h3>If you are not an admin, then <b>go back</b> immediately</h3>\n");
      out.write("     <form action=\"generalcode/logincode.jsp\" method=\"post\">\n");
      out.write("      <table border=\"0\" id=\"ttt\" style=\"border: 1px solid silver;margin-top: 10%;margin:0 auto;\">\n");
      out.write("        <tr><td><img src=\"images/avatar.png\" class=\"avatar\"/></td></tr>\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"text-align: center;font-size: 22px;padding-top: 20px;padding-bottom: 10px;\">LOGIN HERE</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>User ID</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input class=\"logini\" type=\"text\" name=\"userid\" required=\"\" placeholder=\"Enter Contact Number\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Password</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td><input class=\"logini\" type=\"password\" name=\"password\" required=\"\" placeholder=\"Enter Your Password\"/></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td style=\"padding-bottom: 30px;padding-top: 20px;\"><input type=\"submit\" value=\"Login\"/></td>\n");
      out.write("        </tr>\n");
      out.write("      </table> \n");
      out.write("     </form>\n");
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
