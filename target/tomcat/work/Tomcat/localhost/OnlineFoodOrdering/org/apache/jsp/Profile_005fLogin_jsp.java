/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-03 13:19:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_005fLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>User Login</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <script type=\"text/javascript\">\r\n");
      out.write(" \r\n");
      out.write(" /*function Validation(){\r\n");
      out.write("\r\n");
      out.write("\t  var name = document.getElementById(\"name\").value;\r\n");
      out.write("\t  var password = document.getElementById(\"password\").value;\r\n");
      out.write("\t  var char= /^[a-zA-Z]*$/;\r\n");
      out.write("\r\n");
      out.write("\t  if(name.match(char)){\r\n");
      out.write("\t    return true;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t  else {\r\n");
      out.write("\t\t    alert(\"name should only contain letters!!\");\r\n");
      out.write("\t\t    return false;\r\n");
      out.write("\t\t  }\r\n");
      out.write("\t  \r\n");
      out.write("\t  var \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("\t  if(name == null || name == \"\"){\r\n");
      out.write("\t    alert(\"name Cannot be empty!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  if (password == null || password == \"\" ) {\r\n");
      out.write("\t    alert(\"password Cannot be empty!\");\r\n");
      out.write("\t    return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t}*/\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("  </head>\r\n");
      out.write("\t<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".nav{\r\n");
      out.write("    background-color: beige;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 90px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    opacity: 0.3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".aa{\r\n");
      out.write("    width: 65px;\r\n");
      out.write("    height: 65px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 20px;\r\n");
      out.write("    left: 30px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cart{\r\n");
      out.write("    width: 50px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    right: 120px;\r\n");
      out.write("    top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".air{\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    height: 100px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    left: 150px;\r\n");
      out.write("    top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".homebutt{\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    height: 100px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 90px;\r\n");
      out.write("    left: 16%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".loginbox{\r\n");
      out.write("    width: 320px;\r\n");
      out.write("    height: 420px;\r\n");
      out.write("    background-color: black;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    top: 60%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    opacity: 0.7;\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    padding: 70px 25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".avatar{\r\n");
      out.write("    width: 100px;\r\n");
      out.write("    height: 100px;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: -50px;\r\n");
      out.write("    left: calc(50% - 50px);\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".loginbox p{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox input{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox input[type=\"text\"], input[type=\"password\"]\r\n");
      out.write("{\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-bottom: 1px solid #fff;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox input[type=\"submit\"]\r\n");
      out.write("{\r\n");
      out.write("    border: none;\r\n");
      out.write("    outline: none;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    color: black;\r\n");
      out.write("    font-size: 18px;\r\n");
      out.write("    border-radius: 20px;\r\n");
      out.write("        \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox input[type=\"submit\"]:hover\r\n");
      out.write("{\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    background-color: grey;\r\n");
      out.write("    color: #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox a{\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    font-size: 12px;\r\n");
      out.write("    line-height: 20px;\r\n");
      out.write("    color: azure;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".loginbox a:hover{\r\n");
      out.write("    color: darkgrey\r\n");
      out.write("}\r\n");
      out.write("#my{\r\n");
      out.write(" color: black;\r\n");
      out.write(" position:absolute;\r\n");
      out.write(" top: 60%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("  \r\n");
      out.write(" <body background=\"13885.jpg\">\r\n");
      out.write("        \r\n");
      out.write("           <div class=\"nav\">\r\n");
      out.write("           </div>\r\n");
      out.write("           <a href=\"index.jsp\">\r\n");
      out.write("           <img src=\"homes.png\" class=\"aa\">\r\n");
      out.write("           </a>\r\n");
      out.write("      \r\n");
      out.write("            <div class=\"loginbox\">\r\n");
      out.write("              <img src=\"1.png\" class=\"avatar\" height=\"150\" width=\"150\">\r\n");
      out.write("                <h1 align=\"center\" top=\"60%\"> User Login </h1>\r\n");
      out.write("                 <form action =\"Profile_Loginservelet\" method=\"post\">\r\n");
      out.write("               \r\n");
      out.write("                    <p>Email</p>\r\n");
      out.write("                    <input type=\"text\" name=\"email\" id=\"email\" value=\"\" placeholder=\"Enter username\">\r\n");
      out.write("                    <p>Password</p>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\" value=\"\" placeholder=\"Enter password\">\r\n");
      out.write("\r\n");
      out.write("                   \r\n");
      out.write("                   \r\n");
      out.write("\t\t\t\t <input type=\"submit\" name=\"submit\" value=\"login\">\r\n");
      out.write("        <br>\r\n");
      out.write("                    </form>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                   \r\n");
      out.write("                    <a href=\"Profile_Signup.jsp\"> Don't have an account? </a>\r\n");
      out.write("                    \r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("    </body>\r\n");
      out.write("   \r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("               ");
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
