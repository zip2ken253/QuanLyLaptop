/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-12-21 02:29:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<link rel=\"apple-touch-icon\" sizes=\"76x76\"\r\n");
      out.write("\thref=\"../assets20/img/apple-icon.png\">\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"../assets20/img/favicon.png\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write("<title>Admin Manager Laptop</title>\r\n");
      out.write("<meta\r\n");
      out.write("\tcontent='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no'\r\n");
      out.write("\tname='viewport' />\r\n");
      out.write("<!--     Fonts and icons     -->\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n");
      out.write("<!-- CSS Files -->\r\n");
      out.write("<link href=\"material-dashboard.css?v=2.1.0\" rel=\"stylesheet\" />\r\n");
      out.write("<!-- CSS Just for demo purpose, don't include it in your project -->\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"wrapper \">\r\n");
      out.write("\t\t<div class=\"sidebar\" data-color=\"purple\" data-background-color=\"black\"\r\n");
      out.write("\t\t\tdata-image=\"../assets20/img/sidebar-2.jpg\">\r\n");
      out.write("\t\t\t<!--\r\n");
      out.write("        Tip 1: You can change the color of the sidebar using: data-color=\"purple | azure | green | orange | danger\"\r\n");
      out.write("\r\n");
      out.write("        Tip 2: you can also add an image using data-image tag\r\n");
      out.write("    -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"sidebar-wrapper\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active  \"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"./dashboard.html\"> <i class=\"material-icons\">dashboard</i>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Mục Quản lý</p>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item \"><a class=\"nav-link\" href=\"QuanLyUser\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"material-icons\">person</i>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Quản lý User</p>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item \"><a class=\"nav-link\" href=\"./tables.html\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"material-icons\">content_paste</i>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Quản lý Hóa Đơn</p>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item \"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\thref=\"./typography.html\"> <i class=\"material-icons\">library_books</i>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Quản lý Sách</p>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"nav-item \"><a class=\"nav-link\" href=\"./icons.html\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"material-icons\">bubble_chart</i>\r\n");
      out.write("\t\t\t\t\t\t\t<p>Quản lý loại</p>\r\n");
      out.write("\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- <li class=\"nav-item active-pro \">\r\n");
      out.write("                <a class=\"nav-link\" href=\"./upgrade.html\">\r\n");
      out.write("                    <i class=\"material-icons\">unarchive</i>\r\n");
      out.write("                    <p>Upgrade to PRO</p>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li> -->\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"main-panel\">\r\n");
      out.write("\t\t\t<!-- Navbar -->\r\n");
      out.write("\t\t\t<nav\r\n");
      out.write("\t\t\t\tclass=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \"\r\n");
      out.write("\t\t\t\tid=\"navigation-example\">\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\taria-controls=\"navigation-index\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Toggle navigation\" data-target=\"#navigation-example\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"navbar-toggler-icon icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"navbar-toggler-icon icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"navbar-toggler-icon icon-bar\"></span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t<div class=\"collapse navbar-collapse justify-content-end\">\r\n");
      out.write("\t\t\t\t\t\t<form class=\"navbar-form\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"input-group no-border\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"text\" value=\"\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tplaceholder=\"Search...\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"btn btn-default btn-round btn-just-icon\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"material-icons\">search</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"ripple-container\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:void(0)\"> <i class=\"material-icons\">dashboard</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"d-lg-none d-md-block\">Stats</p>\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javscript:void(0)\" id=\"navbarDropdownMenuLink\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\"\r\n");
      out.write("\t\t\t\t\t\t\t\taria-expanded=\"false\"> <i class=\"material-icons\">notifications</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"notification\">5</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p class=\"d-lg-none d-md-block\">Some Actions</p>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\taria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"javascript:void(0)\">Mike\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tJohn responded to your email</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"javascript:void(0)\">You have 5 new tasks</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"javascript:void(0)\">You're now\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfriend with Andrew</a> <a class=\"dropdown-item\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\thref=\"javascript:void(0)\">Another Notification</a> <a\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"dropdown-item\" href=\"javascript:void(0)\">Another\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tOne</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<li style=\"color: #FF9900; font-size: 25px; class=\"nav-item\"><a style=\"color: #FF9900;\" class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\t\t\t\thref=\"javascript:void(0)\"> <i class=\"material-icons\">person</i>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<p class=\"d-lg-none d-md-block\">Account</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tWelcome, admin\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</nav>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<!-- End Navbar -->\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-4 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card card-chart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-header card-header-success\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"ct-chart\" id=\"dailySalesChart\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-4 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card card-chart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-header card-header-warning\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"ct-chart\" id=\"websiteViewsChart\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-4 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card card-chart\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"card-header card-header-danger\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"ct-chart\" id=\"completedTasksChart\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</br>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<a style=\"text-align: center;\" href=\"ChuyenThemLaptop\"><img\tstyle=\"height: 50px; width: 50px;\" src=\"https://cdn.icon-icons.com/icons2/1244/PNG/512/1492790881-6add_84227.png\"></a></div></div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-xl-4 col-lg-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"card mb-3\">\r\n");
      out.write("\t\t\t\t\t<select class=\"form-select\" aria-label=\"Default select example\"\r\n");
      out.write("\t\t\t\t\t\tonchange=\"genderChanged(this)\">\r\n");
      out.write("\t\t\t\t\t\t<option selected>Chọn loại Laptop</option>\r\n");
      out.write("\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t</select>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t<div style=\"width: 1300px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table table-dark table-striped\" id=\"dataTable\" width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Ảnh</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Tên Laptop</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>RAM</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>CPU</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Ổ cứng</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Màn hình</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Card đồ họa</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Pin</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Giá</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Edit</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Delete</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/view/Admin.jsp(180,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/Admin.jsp(180,6) '${LoaiBean}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${LoaiBean}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/Admin.jsp(180,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("l");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.getMaloai() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${l.getTenloai() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent(null);
    // /WEB-INF/view/Admin.jsp(209,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/view/Admin.jsp(209,9) '${HomeLaptop}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${HomeLaptop}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/view/Admin.jsp(209,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("s");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td><img  style=\"width: 45px;\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.getAnh() }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(" \"></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.tenlaptop}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.RAM}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.CPU}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.ocung}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.manhinh}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.carddohoa}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.pin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.gia}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"AdminUpdate?\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\ttenlaptop=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.tenlaptop}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tRAM=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.RAM}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tCPU=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.CPU}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tocung=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.ocung}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tmanhinh=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.manhinh}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tcarddohoa=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.carddohoa}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tpin=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.pin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tgia=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.gia}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tmaloai=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.maloai}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\tanh=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.anh }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"\" src=\"https://img1.pnghut.com/13/7/7/hb1WGviSDx/logo-scalable-vector-graphics-brand-pen-editing.jpg\" width=\"50px\"></a></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<form action=\"AdminManager\">\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"AdminDelete?masach=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${s.getMaLapTop()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("\"><img\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\talt=\"\" src=\"https://www.seekpng.com/png/small/207-2079550_delete-comments-dailydot-logo.png\" width=\"50px\"></a></form></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }
}