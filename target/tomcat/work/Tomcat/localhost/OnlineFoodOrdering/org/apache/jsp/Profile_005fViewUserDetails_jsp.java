/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-07 04:12:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Profile_005fViewUserDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!DOCTYPE html>  \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>View User Detail</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/fonts/ionicons.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/styles.css\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    html {\r\n");
      out.write("  height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tcolor:white;\r\n");
      out.write("\tbackground-color: white; /* For browsers that do not support gradients */\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h1{\r\n");
      out.write("\tfont-size:2.1vw;\r\n");
      out.write("}\r\n");
      out.write(".nav{\r\n");
      out.write("    \r\n");
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
      out.write(".aaa{\r\n");
      out.write("    width: 50px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    right: 40px;\r\n");
      out.write("    top: 30px;\r\n");
      out.write("}\r\n");
      out.write("#top_div{\r\n");
      out.write("\twidth:95%;\r\n");
      out.write("\theight:10vw;\r\n");
      out.write("\tpadding-top:20px;\r\n");
      out.write("\tmargin:auto;\r\n");
      out.write("\t/*background-color:red;*/\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#logo{\r\n");
      out.write("\theight:120px;\r\n");
      out.write("\twidth:250px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#top_left{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("    top: 20px;\r\n");
      out.write("\twidth:15%;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("\tdisplay:block; \r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#top_right{\r\n");
      out.write("\twidth:85%;\r\n");
      out.write("\theight:100%;\r\n");
      out.write("\tdisplay:block; \r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#top{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:55%;\r\n");
      out.write("}\r\n");
      out.write("#topic{\r\n");
      out.write("\twidth:80%;\r\n");
      out.write("\theight:auto;\r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\ttext-align:center;\r\n");
      out.write("}\r\n");
      out.write("#detail{\r\n");
      out.write("\twidth:20%;\r\n");
      out.write("\theight:auto;\r\n");
      out.write("\tdisplay:block; \r\n");
      out.write("\tfloat:left;\r\n");
      out.write("\ttext-align:left;\r\n");
      out.write("\tfont-size:1vw;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav ul{\r\n");
      out.write("\t position: relative;\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("    top: 5px;\r\n");
      out.write("    left:60px;\r\n");
      out.write("\tbackground-color: #333;\r\n");
      out.write("\tfont-size:1.1vw;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav li {\r\n");
      out.write("  float: left;\r\n");
      out.write("  width:15vw;\r\n");
      out.write("  border-right:1px solid #bbb;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav li:last-child {\r\n");
      out.write("  border-right: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav li a:hover:not(.active) ,#access li a:hover:not(.active)  {\r\n");
      out.write("  background-color: gray;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#nav .active , #access .active {\r\n");
      out.write("  background-color: #e64a19;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("i{\r\n");
      out.write("  border: solid white;\r\n");
      out.write("  border-width: 0 3px 3px 0;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  padding: 3px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".down {\r\n");
      out.write("  transform: rotate(180deg);\r\n");
      out.write("  -webkit-transform: rotate(45deg);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown{\r\n");
      out.write("  display: none;\r\n");
      out.write("  background-color: lack;\r\n");
      out.write("  min-width: 160px;\r\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("  z-index: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown a {\r\n");
      out.write("  float: none;\r\n");
      out.write("  color: white;\r\n");
      out.write("  padding: 12px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  display: block;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".d:hover .dropdown {\r\n");
      out.write("  display: block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#body_cont{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tpadding-top:20px;\r\n");
      out.write("\tmargin-left:20px;\r\n");
      out.write("\tmargin-right:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#access{\r\n");
      out.write("\twidth:15%;\r\n");
      out.write("\theight:auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#access ul{\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tfont-size:1.2vw;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#access li a {\r\n");
      out.write("  display: block;\r\n");
      out.write("  color: white;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 15px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("#update {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write(" \t background-color:grey;\r\n");
      out.write(" \t padding: 12px 20px;\r\n");
      out.write(" \t color:white;\r\n");
      out.write("  \tborder: none;\r\n");
      out.write("  \tborder-radius: 4px;\r\n");
      out.write("  \t\r\n");
      out.write("   \twidth: 80px;\r\n");
      out.write("   \theight:40px;\r\n");
      out.write("   \t\r\n");
      out.write("}\r\n");
      out.write("#update:hover{\r\n");
      out.write("color:black;\r\n");
      out.write("background-color:green;\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("#id1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write(" #fname1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("#lname1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("        \r\n");
      out.write("#address1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write(" #gender1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write(" #email1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("#contactno1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("       \r\n");
      out.write("#contactno2{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("       \r\n");
      out.write(" #password1{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    height:45px;\r\n");
      out.write("    width: 30%;\r\n");
      out.write("    left:2px;\r\n");
      out.write("    background: transparent;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-color:dimgrey;\r\n");
      out.write("    font-size:15px;\r\n");
      out.write("    font-family:sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("               \r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("<body background=\"13885.jpg\">\r\n");
      out.write("</div>\r\n");
      out.write("\t    <div class=\"nav\">\r\n");
      out.write("        \r\n");
      out.write("        </div>\r\n");
      out.write("           <a href=\"index.jsp\">\r\n");
      out.write("           <img src=\"homes.png\" class=\"aa\">\r\n");
      out.write("           </a>\r\n");
      out.write("         \r\n");
      out.write("           <a href=\"index.jsp\">\r\n");
      out.write("           <img src=\"1.png\" class=\"aaa\">\r\n");
      out.write("           </a>\r\n");
      out.write("           \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<h1 align=\"center\">Update Customer Personal Details</h1>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<div><form action=\"Menu\" method=\"POST\"><input type=\"submit\" class=\"btn btn-primary btn-xl text-uppercase js-scroll-trigger\" role=\"button\" value=\"View Menu!\"></form></div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form >\r\n");
      out.write(" \r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("User Id:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"id\" id=\"id1\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"  >\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("First Name:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"fname\" id=\"fname1\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" >\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Last Name:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"lname\" id=\"lname1\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${lname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Gender:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"gender\" id=\"gender1\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${gender}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Address:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"address\"  id=\"address1\"  readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Contact No 1:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"contactno1\"  id=\"contactno1\"  readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contact1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Contact No 2:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"contactno2\"  id=\"contactno2\"  readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contact2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Email:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"text\" name=\"email\" id=\"email1\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("Password:<br>\r\n");
      out.write("\r\n");
      out.write("<input type=\"password\" name=\"password\" id=\"password1\" readonly id=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${password}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write(" <a href=\"UserDetails.jsp\">Update</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
