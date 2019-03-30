package org.apache.jsp.adminzone;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Upload Notes</title>\n");
      out.write("        <style>\n");
      out.write("            body{background: url(\"../image/2.jpg\"); background-size: 100% 100vh;}\n");
      out.write("            table\n");
      out.write("            {\n");
      out.write("                margin-top: 10vh;\n");
      out.write("                height: 55vh;\n");
      out.write("                width: 40%;\n");
      out.write("                text-align: center;\n");
      out.write("                border:1px solid grey;\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                color:white;\n");
      out.write("                text-shadow: 0px 10px 15px rgba(0,0,0,1) , 1px -1px 0 black , 1px 1px 0 black , -1px -1px 0 black , -1px 1px 0 black;\n");
      out.write("            }\n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("                color: white;\n");
      out.write("                text-shadow: 0px 5px 10px rgba(0,0,0,1) , 1px -1px 0 black , 1px 1px 0 black , -1px -1px 0 black , -1px 1px 0 black; \n");
      out.write("            }\n");
      out.write("            input[type=\"submit\"]\n");
      out.write("            {\n");
      out.write("                font-size: 20px;\n");
      out.write("                background-color: white;\n");
      out.write("                color: white;\n");
      out.write("                cursor: pointer;\n");
      out.write("                letter-spacing: 2.5px;\n");
      out.write("                width:20%;\n");
      out.write("                font-family: serif;\n");
      out.write("                text-shadow: 0px 5px 10px rgba(0,0,0,1) , 1px -1px 0 black , 1px 1px 0 black , -1px -1px 0 black , -1px 1px 0 black;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Upload Notes</h1>\n");
      out.write("        <form action=\"../upload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"width:50%;\">Subject</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"subject\" required=\"\">\n");
      out.write("                            <option value=\"\">Select subject</option>\n");
      out.write("                            <option value=\"C\">C</option>\n");
      out.write("                            <option value=\"Maths\">Maths</option>\n");
      out.write("                            <option value=\"ABC\">ABC</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Title</td>\n");
      out.write("                    <td><input type=\"text\" name=\"title\" required=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Description</td>\n");
      out.write("                    <td><textarea name=\"description\" required=\"\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Select File</td>\n");
      out.write("                    <td><input style=\"border: 1px solid black;width:70%;\" name=\"myfile\" type=\"file\" required=\"\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\"><input type=\"submit\" value=\"Upload\"/></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </center>\n");
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
