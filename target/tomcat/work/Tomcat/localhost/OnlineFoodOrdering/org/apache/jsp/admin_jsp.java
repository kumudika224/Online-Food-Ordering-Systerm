/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-03 13:11:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link href=\"stylecss.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"> \r\n");
      out.write("<link rel=\"icon\" href=\"images/logo.png\">\r\n");
      out.write("<title>Food Ordering System</title>\r\n");
      out.write("</head>\r\n");
      out.write("    \r\n");
      out.write("<body background=\"images/adminbk.jpg\">\r\n");
      out.write("    <div class=\"main_btns\">\r\n");
      out.write("        <a href=\"index.jsp\"><button class=\"main_btn\">Logout</button></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"mainpg1\">\r\n");
      out.write("        <p class=\"mainpgfont1\">Online Food Ordering System | Admin </p>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"admin_btns\">\r\n");
      out.write("        <a href=\"#\"><button class=\"admin_btn1\">Customer Details</button></a>\r\n");
      out.write("        <a href=\"viewmenu.jsp\"><button class=\"admin_btn2\">Menu Item Details</button></a>\r\n");
      out.write("        <a href=\"#\"><button class=\"admin_btn3\">Transaction Details</button></a>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <div class=\"top\">\r\n");
      out.write("        <img class=\"call\" src=\"images/call.png\">\r\n");
      out.write("        <img class=\"web\" src=\"images/web.png\">\r\n");
      out.write("        <img class=\"mail\" src=\"images/email.png\">\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"text4\">\r\n");
      out.write("        <p class=\"mainpgfont3\">+94112545145</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"text5\">\r\n");
      out.write("        <a class=\"mainpgfont3\" href=\"www.orderonline.com\">www.orderonline.com</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"text6\">\r\n");
      out.write("        <p class=\"mainpgfont3\">orderonline@online.com</p>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}