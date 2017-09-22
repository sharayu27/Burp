package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class new_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!doctype html>\n");
      out.write("<!--[if lt IE 7]>      <html class=\"no-js lt-ie9 lt-ie8 lt-ie7\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 7]>         <html class=\"no-js lt-ie9 lt-ie8\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if IE 8]>         <html class=\"no-js lt-ie9\" lang=\"\"> <![endif]-->\n");
      out.write("<!--[if gt IE 8]><!--> <html class=\"no-js\" lang=\"\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\n");
      out.write("        <title></title>\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <style>\n");
      out.write("            body \n");
      out.write("                {\n");
      out.write("                padding-top: 50px;\n");
      out.write("                padding-bottom: 20px;\n");
      out.write("                }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-theme.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/modernizr-2.8.3-respond-1.4.2.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--[if lt IE 8]>\n");
      out.write("            <p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("        <![endif]-->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("          </button>\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Sentiment Analysis on Yelp Reviews.</a>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("          <form class=\"navbar-form navbar-right\" role=\"form\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"text\" placeholder=\"Email\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <input type=\"password\" placeholder=\"Password\" class=\"form-control\">\n");
      out.write("            </div>\n");
      out.write("            <button type=\"submit\" class=\"btn btn-success\">Sign in</button>\n");
      out.write("          </form>\n");
      out.write("        </div><!--/.navbar-collapse -->\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <h1 align=\"center\">Results</h1>\n");
      out.write("        <br>\n");
      out.write("        <table border=\"1\" width=\"100%\">\n");
      out.write("            <tr>\n");
      out.write("                <th>\n");
      out.write("                    Name\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Ratings\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Review\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Sentiment\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Price       \n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <!-- Example row of columns -->\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <h2>Heading</h2>\n");
      out.write("          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <h2>Heading</h2>\n");
      out.write("          <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("          <h2>Heading</h2>\n");
      out.write("          <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>\n");
      out.write("          <p><a class=\"btn btn-default\" href=\"#\" role=\"button\">View details &raquo;</a></p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <hr>\n");
      out.write("\n");
      out.write("      <footer>\n");
      out.write("        <p>&copy; Company 2015</p>\n");
      out.write("      </footer>\n");
      out.write("    </div> <!-- /container -->        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js\"></script>\n");
      out.write("        <script>window.jQuery || document.write('<script src=\"js/vendor/jquery-1.11.2.min.js\"><\\/script>')</script>\n");
      out.write("\n");
      out.write("        <script src=\"js/vendor/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->\n");
      out.write("        <script>\n");
      out.write("            (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=\n");
      out.write("            function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;\n");
      out.write("            e=o.createElement(i);r=o.getElementsByTagName(i)[0];\n");
      out.write("            e.src='//www.google-analytics.com/analytics.js';\n");
      out.write("            r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));\n");
      out.write("            ga('create','UA-XXXXX-X','auto');ga('send','pageview');\n");
      out.write("        </script>\n");
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
