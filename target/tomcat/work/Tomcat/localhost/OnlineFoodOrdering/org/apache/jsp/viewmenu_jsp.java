/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-07 05:12:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class viewmenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link href=\"stylecss.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"> \r\n");
      out.write("<link rel=\"icon\" href=\"images/logo.png\">\r\n");
      out.write("<title>Food Ordering System</title>\r\n");
      out.write("<style>\r\n");
      out.write("    table {\r\n");
      out.write("      font-family: arial, sans-serif;\r\n");
      out.write("      border-collapse: collapse;\r\n");
      out.write("      width: 80%;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    td, th {\r\n");
      out.write("      border: 1px solid black;\r\n");
      out.write("      text-align: center;\r\n");
      out.write("      padding: 8px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    tr:nth-child(even) {\r\n");
      out.write("      background-color: antiquewhite;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("  $(\"#search\").on(\"keyup\", function() {\r\n");
      out.write("    var value = $(this).val().toLowerCase();\r\n");
      out.write("    $(\"#mytable tr\").filter(function() {\r\n");
      out.write("      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("    \r\n");
      out.write("<body background=\"images/viewmenu.jpg\">\r\n");
      out.write("    <div class=\"main_btns\">\r\n");
      out.write("        <a href=\"index.jsp\"><button class=\"main_btn\">Logout</button></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <a href=\"addfood.jsp\"><button class=\"viewmenu_addbtn\">Add an item</button></a>\r\n");
      out.write("    <a href=\"admin.jsp\"><button class=\"viewmenu_backbtn\">Back</button></a>\r\n");
      out.write("    \r\n");
      out.write("    <input type=\"text\" class=\"searchbar\" id=\"search\" name=\"search\" placeholder=\"Search for names..\">\r\n");
      out.write("    \r\n");
      out.write("    <table class=\"foodtable\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<th>Item Code</th>\r\n");
      out.write("\t\t\t<th>Item Name</th>\r\n");
      out.write("\t\t\t<th>Item type</th>\r\n");
      out.write("\t\t\t<th>Price</th>\r\n");
      out.write("\t\t\t<th>Description</th>\r\n");
      out.write("\t\t\t<th>Edit</th>\r\n");
      out.write("\t\t\t<th>Delete</th>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody class=\"mytable\" id=\"mytable\">\r\n");
      out.write("            ");

			String id = request.getParameter("pid");
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
		
      out.write("\r\n");
      out.write("\t\t");

			try {
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_food", "admin", "12345");
				Statement statement = connection.createStatement();
				String sql = "select * from product";
				ResultSet resultSet = statement.executeQuery(sql);
				while (resultSet.next()) {
		
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>");
      out.print(resultSet.getString("pid"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(resultSet.getString("name"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(resultSet.getString("type"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(resultSet.getString("price"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(resultSet.getString("description"));
      out.write("</td>\r\n");
      out.write("\t\t\t<td><a href=\"updatefood.jsp?pid=");
      out.print(resultSet.getString("pid"));
      out.write("\">Edit</a></td>\r\n");
      out.write("\t\t\t<td><a href=\"deletefood.jsp?pid=");
      out.print(resultSet.getString("pid"));
      out.write("\">Delete</a></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t");

			}
				connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </tbody>    \r\n");
      out.write("    </table>\r\n");
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