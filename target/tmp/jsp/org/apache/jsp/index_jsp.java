package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<form action=\"add\" method=\"get\">\n");
      out.write("\t\t<label>Imię:<input type=\"text\" id=\"name\" name=\"name\"/></label><br/>\n");
      out.write("\t\t<label>Nazwisko:<input type=\"text\" id=\"surname\" name=\"surname\"/></label><br/>\n");
      out.write("\t\t<label>Pracodawca:<input type=\"text\" id=\"employment\" name=\"employment\"/></label><br/>\n");
      out.write("\t\t<label>Adres email:<input type=\"text\" id=\"email\" name=\"email\"/></label><br/>\n");
      out.write("\t\t<label>Potwierdź adres email:<input type=\"text\" id=\"email\" name=\"confirmemail\"/></label><br/>\n");
      out.write("\t\t<label>Skąd się dowiedziałeś o konferencji:</label><br/>\n");
      out.write("\t\t<label>Ogłoszenie w pracy<input type=\"radio\" name=\"info\" value=\"vork\"/></label><br/>\n");
      out.write("\t\t<label>Ogłoszenie na uczelni<input type=\"radio\" name=\"info\" value=\"school\"/></label><br/>\n");
      out.write("\t\t<label>Facebook<input type=\"radio\" name=\"info\" value=\"facebook\"/></label><br/>\n");
      out.write("\t\t<label>Znajomi<input type=\"radio\" name=\"info\" value=\"friends\"/></label><br/>\n");
      out.write("\t\t<input type=\"submit\" value=\"wyslij\"/>\n");
      out.write("\t</form>\n");
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
