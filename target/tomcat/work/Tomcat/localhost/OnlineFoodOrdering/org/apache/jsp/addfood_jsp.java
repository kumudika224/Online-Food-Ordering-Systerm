/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-07 05:49:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addfood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\r\n");
      out.write("    input[type=text], select {\r\n");
      out.write("      width: 350px;\r\n");
      out.write("      padding: 12px 20px;\r\n");
      out.write("      margin: 8px 0;\r\n");
      out.write("      border: 1px solid green;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .addfood_form{\r\n");
      out.write("      border-radius: 5px;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("    }\r\n");
      out.write("    \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction checkForm(addfoodform){\r\n");
      out.write("\t\t//check if any input is empty..\r\n");
      out.write("\t\t//if(addfoodform.code.value == \"\"){\r\n");
      out.write("\t\t\t//alert(\"ItemCode cannot be empty! \");\r\n");
      out.write("\t\t\t//addfoodform.focus();\r\n");
      out.write("\t\t\t//return false;\r\n");
      out.write("\t//}\r\n");
      out.write("\t\tif(addfoodform.name.value == \"\"){\r\n");
      out.write("\t\t\talert(\"Item Name cannot be empty!\");\r\n");
      out.write("\t\t\taddfoodform.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\tif(addfoodform.price.value == \"\"){\r\n");
      out.write("\t\t\talert(\"Item Price cannot be empty!\");\r\n");
      out.write("\t\t\taddfoodform.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\tif(addfoodform.cost.value == \"\"){\r\n");
      out.write("\t\t\talert(\"Item Cost cannot be empty!\");\r\n");
      out.write("\t\t\taddfoodform.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tvar rea = /^[a-zA-Z ]+$/;\r\n");
      out.write("\tvar rei = /^\\d*$/;\r\n");
      out.write("\r\n");
      out.write("\t//checks if input matches with given regular expressions\r\n");
      out.write("\tif(!rea.test(addfoodform.name.value)){\r\n");
      out.write("\t\talert(\"Name field contains invalid characters..\" );\r\n");
      out.write("\t\taddfoodform.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(!rei.test(addfoodform.price.value)){\r\n");
      out.write("\t\talert(\"Price field contain invalid characters..\");\r\n");
      out.write("\t\taddfoodform.focus();\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\treturn true;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction autoFill() {\r\n");
      out.write("\r\n");
      out.write("\t    document.getElementById('addfoodname').value = \"Chocolate Chip\"\r\n");
      out.write("\t    document.getElementById('addfoodimage').value = \"pudding.jpg\";\r\n");
      out.write("\t    document.getElementById('addfooddesc').value = \"Pudding \";\r\n");
      out.write("\t    document.getElementById('addfoodprice').value = \"350\";\r\n");
      out.write("\t    document.getElementById('addfoodtype').value = \"Dessert\";\r\n");
      out.write("\t   \r\n");
      out.write("\t    \r\n");
      out.write("\t    }\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"images/addfood.jpg\">\r\n");
      out.write("    <div class=\"main_btns\">\r\n");
      out.write("        <a href=\"index.jsp\"><button class=\"main_btn\">Logout</button></a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <a href=\"viewmenu.jsp\"><button class=\"viewmenu_backbtn\">Back</button></a>\r\n");
      out.write("    \r\n");
      out.write("    <div class=\"addfood_form\">\r\n");
      out.write("        <form action=\"addfoodServlet\" method=\"POST\" name=\"addfoodform\" onsubmit=\"return checkForm(this)\">\r\n");
      out.write("            <h1 style=\"font-family:arial;\">Add an item to the menu</h1>\r\n");
      out.write("            Item Name:<br> <input class=\"addfood_name\" id=\"addfoodname\" name=\"name\" type=\"text\" required autocomplete=\"off\"><br>\r\n");
      out.write("            Item image:<br> <input class=\"addfood_image\" id=\"addfoodimage\" name=\"image\" type=\"text\" required autocomplete=\"off\"><br> \r\n");
      out.write("            Description:<br> <input class=\"addfood_description\" id=\"addfooddesc\" name=\"description\" type=\"text\" required autocomplete=\"off\"><br>  \r\n");
      out.write("            Price:<br> <input class=\"addfood_price\" id=\"addfoodprice\" name=\"price\" type=\"text\" required autocomplete=\"off\"><br>\r\n");
      out.write("            Item Type:<br> <input class=\"addfood_type\" id=\"addfoodtype\" name=\"type\" type=\"text\" required autocomplete=\"off\"><br> \r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" id=\"submitbtn\" value=\"Submit\" class=\"addfood_submit\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        <button id=\"demo1\" onclick=\"autoFill()\" class=\"demo_btn\">Demo</button>\r\n");
      out.write("    </div>    \r\n");
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
