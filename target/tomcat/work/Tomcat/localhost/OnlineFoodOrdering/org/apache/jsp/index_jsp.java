/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-10-07 05:48:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("    <title>Home - Brand</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Kaushan+Script\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome-all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/font-awesome.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/fonts/fontawesome5-overrides.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/Team-Boxed.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("    <nav class=\"navbar navbar-dark navbar-expand-lg fixed-top bg-dark\" id=\"mainNav\">\n");
      out.write("        <div class=\"container\"><a class=\"navbar-brand\" href=\"#page-top\">Zippy Meals<br></a><button data-toggle=\"collapse\" data-target=\"#navbarResponsive\" class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toogle=\"collapse\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\"\n");
      out.write("                aria-label=\"Toggle navigation\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto text-uppercase\">\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link js-scroll-trigger\" href=\"Profile_Signup.jsp\">Register</a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link js-scroll-trigger\" href=\"Profile_Login.jsp\">Login</a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link js-scroll-trigger\" href=\"#team\">Team</a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link js-scroll-trigger\" href=\"#contact\">Contact</a></li>\n");
      out.write("                    <li class=\"nav-item\" role=\"presentation\"><a class=\"nav-link js-scroll-trigger\" href=\"Profile_Adminlogin.jsp\">Employee Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <header class=\"masthead\" style=\"background-image: url(&quot;assets/img/eat-2834549_1920.jpg&quot;);\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"intro-text\">\n");
      out.write("                <div class=\"intro-lead-in\"><span>Welcome!</span></div>\n");
      out.write("                <div class=\"intro-heading text-uppercase\"><span><strong>eat fresh live healthy</strong></span>\n");
      out.write("                </div><form action=\"Profile_Login.jsp\" method=\"POST\"><input type=\"submit\" class=\"btn btn-primary btn-xl text-uppercase js-scroll-trigger\" role=\"button\" value=\"View Menu!\"></form></div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("    <section id=\"team\" class=\"bg-light\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"team-member\"><img class=\"rounded-circle mx-auto\" src=\"assets/img/1.jpg\">\n");
      out.write("                        <h4>Vinura udayanga</h4>\n");
      out.write("                        <p class=\"text-muted\">Head Cheff</p>\n");
      out.write("                        <ul class=\"list-inline social-buttons\">\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"team-member\"><img class=\"rounded-circle mx-auto\" src=\"assets/img/head-chef.jpg\">\n");
      out.write("                        <h4>Ramishka</h4>\n");
      out.write("                        <p class=\"text-muted\">Chef</p>\n");
      out.write("                        <ul class=\"list-inline social-buttons\">\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"team-member\"><img class=\"rounded-circle mx-auto\" src=\"assets/img/images%20(2).jpg\">\n");
      out.write("                        <h4>Vidura Deshan&nbsp;</h4>\n");
      out.write("                        <p class=\"text-muted\">Delivery Man</p>\n");
      out.write("                        <ul class=\"list-inline social-buttons\">\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                            <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <section id=\"contact\" style=\"background-image:url('assets/img/map-image.png');\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12 text-center\">\n");
      out.write("                    <h2 class=\"text-uppercase section-heading\">Contact Us</h2>\n");
      out.write("                    <h3 class=\"section-subheading text-muted\">Lorem ipsum dolor sit amet consectetur.</h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <form id=\"contactForm\" name=\"contactForm\" novalidate=\"novalidate\">\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <div class=\"col col-md-6\">\n");
      out.write("                                <div class=\"form-group\"><input class=\"form-control\" type=\"text\" id=\"name\" placeholder=\"Your Name *\" required=\"\"><small class=\"form-text text-danger flex-grow-1 help-block lead\"></small></div>\n");
      out.write("                                <div class=\"form-group\"><input class=\"form-control\" type=\"email\" id=\"email\" placeholder=\"Your Email *\" required=\"\"><small class=\"form-text text-danger help-block lead\"></small></div>\n");
      out.write("                                <div class=\"form-group\"><input class=\"form-control\" type=\"tel\" placeholder=\"Your Phone *\" required=\"\"><small class=\"form-text text-danger help-block lead\"></small></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"form-group\"><textarea class=\"form-control\" id=\"message\" placeholder=\"Your Message *\" required=\"\"></textarea><small class=\"form-text text-danger help-block lead\"></small></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"clearfix\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-lg-12 text-center\">\n");
      out.write("                                <div id=\"success\"></div><button class=\"btn btn-primary btn-xl text-uppercase\" id=\"sendMessageButton\" type=\"submit\">Send Message</button></div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-4\"><span class=\"copyright\">Copyright&nbsp;Â© Brand 2018</span></div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <ul class=\"list-inline social-buttons\">\n");
      out.write("                        <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                        <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                        <li class=\"list-inline-item\"><a href=\"#\"><i class=\"fa fa-linkedin\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <ul class=\"list-inline quicklinks\">\n");
      out.write("                        <li class=\"list-inline-item\"><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                        <li class=\"list-inline-item\"><a href=\"#\">Terms of Use</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assets/bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/agency.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
