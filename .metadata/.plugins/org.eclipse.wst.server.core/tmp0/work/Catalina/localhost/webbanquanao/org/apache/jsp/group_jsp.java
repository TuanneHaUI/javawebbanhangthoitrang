/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-12-09 19:09:13 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.User;
import model.Quyen;
import java.util.List;
import Reponsitory.LaydulieuReponsitory;

public final class group_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(6);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("model.User");
    _jspx_imports_classes.add("Reponsitory.LaydulieuReponsitory");
    _jspx_imports_classes.add("model.Quyen");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("<title>Admin/Category</title>\r\n");
      out.write("<meta content=\"\" name=\"description\">\r\n");
      out.write("<meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("<!-- Favicons -->\r\n");
      out.write("<link href=\"assetsquantri/img/favicon.png\" rel=\"icon\">\r\n");
      out.write("<link href=\"assetsquantri/img/apple-touch-icon.png\"\r\n");
      out.write("	rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Vendor CSS Files -->\r\n");
      out.write("<link href=\"assetsquantri/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assetsquantri/vendor/bootstrap-icons/bootstrap-icons.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assetsquantri/vendor/boxicons/css/boxicons.min.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assetsquantri/vendor/quill/quill.snow.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assetsquantri/vendor/quill/quill.bubble.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assetsquantri/vendor/remixicon/remixicon.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link href=\"assetsquantri/vendor/simple-datatables/style.css\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- Template Main CSS File -->\r\n");
      out.write("<link href=\"assetsquantri/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<!-- =======================================================\r\n");
      out.write("  * Template Name: NiceAdmin\r\n");
      out.write("  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/\r\n");
      out.write("  * Updated: Apr 20 2024 with Bootstrap v5.3.3\r\n");
      out.write("  * Author: BootstrapMade.com\r\n");
      out.write("  * License: https://bootstrapmade.com/license/\r\n");
      out.write("  ======================================================== -->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	");

	String projectName = request.getContextPath(); // Lấy tên dự án
	HttpSession s = request.getSession(false);
	List<User> list = (session != null) ? (List<User>) session.getAttribute("Ghinhotaikhoan") : null;
	
      out.write("\r\n");
      out.write("	<!-- ======= Header ======= -->\r\n");
      out.write("	<header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"d-flex align-items-center justify-content-between\">\r\n");
      out.write("			<div class=\"logo d-flex align-items-center\">\r\n");
      out.write("				<img src=\"assetsquantri/img/logo.png\" alt=\"\"> <span\r\n");
      out.write("					class=\"d-none d-lg-block\">T3admin</span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<i class=\"bi bi-list toggle-sidebar-btn\"></i>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- End Logo -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<nav class=\"header-nav ms-auto\">\r\n");
      out.write("			<ul class=\"d-flex align-items-center\">\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item dropdown pe-3\">\r\n");
      out.write("					\r\n");
      out.write("			<a class=\"nav-link nav-profile d-flex align-items-center pe-0\"\r\n");
      out.write("					href=\"#\" data-bs-toggle=\"dropdown\"> <i\r\n");
      out.write("						class=\"bi bi-person-circle\"></i> <span\r\n");
      out.write("						");
if(list != null){
						for(User u : list) {
      out.write("\r\n");
      out.write("						class=\"d-none d-md-block dropdown-toggle ps-2\">");
      out.print(u.getHoTen());
      out.write("\r\n");
      out.write("							</span>\r\n");
      out.write("				</a> <!-- End Profile Iamge Icon -->\r\n");
      out.write("\r\n");
      out.write("					<ul\r\n");
      out.write("						class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\r\n");
      out.write("						<li class=\"dropdown-header\">\r\n");
      out.write("							<h6>");
      out.print(u.getTenTaiKhoan());
      out.write("</h6>\r\n");
      out.write("							");
if(u.getMaQuyen() == 1) {
      out.write("\r\n");
      out.write("							<span>Quản trị viên</span>\r\n");
      out.write("							");
} else{
      out.write("\r\n");
      out.write("							<span>Khách hàng</span>\r\n");
      out.write("							");
} 
      out.write("\r\n");
      out.write("						</li>\r\n");
      out.write("						\r\n");
      out.write("						<li>\r\n");
      out.write("							<hr class=\"dropdown-divider\">\r\n");
      out.write("						</li>\r\n");
      out.write("						\r\n");
      out.write("						<li><a class=\"dropdown-item d-flex align-items-center\"\r\n");
      out.write("							href=\"Thongtincanhan.jsp\"> <i class=\"bi bi-person\"></i> <span>Thông tin cá nhân\r\n");
      out.write("									</span>\r\n");
      out.write("						</a></li>\r\n");
      out.write("						<li>\r\n");
      out.write("							<hr class=\"dropdown-divider\">\r\n");
      out.write("						</li>\r\n");
      out.write("						<li><a class=\"dropdown-item d-flex align-items-center\"\r\n");
      out.write("							href=\"Dangxuat\"> <i class=\"bi bi-box-arrow-right\"></i> <span>Đăng\r\n");
      out.write("									xuất</span>\r\n");
      out.write("						</a></li>\r\n");
      out.write("\r\n");
      out.write("					</ul> <!-- End Profile Dropdown Items -->\r\n");
      out.write("				</li>\r\n");
      out.write("				");
} }
      out.write("\r\n");
      out.write("				<!-- End Profile Nav -->\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<!-- End Icons Navigation -->\r\n");
      out.write("\r\n");
      out.write("	</header>\r\n");
      out.write("	<!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("	<!-- ======= Sidebar ======= -->\r\n");
      out.write("	<aside id=\"sidebar\" class=\"sidebar\">\r\n");
      out.write("\r\n");
      out.write("		<ul class=\"sidebar-nav\" id=\"sidebar-nav\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-heading\">Quản lý bán hàng</li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link collapsed\"\r\n");
      out.write("				href=\"");
      out.print(projectName);
      out.write("/category.jsp\"> <i\r\n");
      out.write("					class=\"bi bi-layout-text-window-reverse\"></i> <span>Danh mục</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link collapsed\" href=\"");
      out.print(projectName);
      out.write("/Donhangquantri.jsp\">\r\n");
      out.write("					<i class=\"bi bi-cart\"></i> <span>Đơn hàng</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link collapsed\"\r\n");
      out.write("				href=\"");
      out.print(projectName);
      out.write("/productquantri.jsp\"> <i\r\n");
      out.write("					class=\"bi bi-grid\"></i> <span>Sản phẩm</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-heading\">Quản lý tài khoản</li>\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link collapsed\"\r\n");
      out.write("				href=\"");
      out.print(projectName);
      out.write("/account.jsp\"> <i class=\"bi bi-person\"></i>\r\n");
      out.write("					<span>Tài khoản</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<!-- End Profile Page Nav -->\r\n");
      out.write("\r\n");
      out.write("			<li class=\"nav-item\"><a class=\"nav-link \"\r\n");
      out.write("				href=\"");
      out.print(projectName);
      out.write("/group.jsp\"> <i\r\n");
      out.write("					class=\"bi bi-question-circle\"></i> <span>Phân quyền</span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<!-- End F.A.Q Page Nav -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("\r\n");
      out.write("	</aside>\r\n");
      out.write("\r\n");
      out.write("	<main id=\"main\" class=\"main\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"pagetitle\">\r\n");
      out.write("			<h1>Phân quyền</h1>\r\n");
      out.write("			<nav>\r\n");
      out.write("				<ol class=\"breadcrumb\">\r\n");
      out.write("					<li class=\"breadcrumb-item\"><a href=\"index.html\">Quản lý\r\n");
      out.write("							tài khoản</a></li>\r\n");
      out.write("					<li class=\"breadcrumb-item active\">Phân quyền</li>\r\n");
      out.write("				</ol>\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- End Page Title -->\r\n");
      out.write("\r\n");
      out.write("		<section class=\"section\">\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<div class=\"col-lg-12\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<h3 class=\"card-title\">\r\n");
      out.write("								<b>Phân quyền</b>\r\n");
      out.write("							</h3>\r\n");
      out.write("							<div\r\n");
      out.write("								style=\"display: flex; justify-content: flex-start; padding-left: 20px;\">\r\n");
      out.write("								<div\r\n");
      out.write("									style=\"display: flex; flex-direction: column; align-items: center; justify-content: center;\">\r\n");
      out.write("									<button type=\"button\" id=\"addb\" class=\"btn btn-success\">\r\n");
      out.write("										<i class=\"bi bi-plus-lg\"></i>\r\n");
      out.write("									</button>\r\n");
      out.write("									<p>Thêm mới</p>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"card\">\r\n");
      out.write("								<div class=\"card-body row hide\" id=\"addf\">\r\n");
      out.write("									<h5 class=\"card-title\">Thêm mới</h5>\r\n");
      out.write("\r\n");
      out.write("									<!-- Vertical Form -->\r\n");
      out.write("									<form>\r\n");
      out.write("\r\n");
      out.write("										<label for=\"roleSelect\" class=\"form-label\">Chọn vai\r\n");
      out.write("											trò</label> <select class=\"form-select\" id=\"roleSelect\">\r\n");
      out.write("											<option selected>Chọn vai trò...</option>\r\n");
      out.write("											<option value=\"1\">Quản lý</option>\r\n");
      out.write("\r\n");
      out.write("											<option value=\"2\">Khách hàng</option>\r\n");
      out.write("										</select>\r\n");
      out.write("\r\n");
      out.write("										<div class=\"text-center\">\r\n");
      out.write("											<button type=\"submit\" class=\"btn btn-primary\">Thêm</button>\r\n");
      out.write("\r\n");
      out.write("										</div>\r\n");
      out.write("									</form>\r\n");
      out.write("									<!-- Vertical Form -->\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<!-- Table with stripped rows -->\r\n");
      out.write("							<table class=\"table datatable\">\r\n");
      out.write("								<thead>\r\n");
      out.write("									<tr>\r\n");
      out.write("										<th>ID</th>\r\n");
      out.write("										<th>Vai trò</th>\r\n");
      out.write("										<th>Quyền hạn</th>\r\n");
      out.write("										<th>Hành động</th>\r\n");
      out.write("									</tr>\r\n");
      out.write("								</thead>\r\n");
      out.write("								<tbody>\r\n");
      out.write("									");
LaydulieuReponsitory l= new LaydulieuReponsitory();
                List<Quyen> quyen = l.Laythongtin();
                for(Quyen q : quyen){
                
      out.write("\r\n");
      out.write("									<tr>\r\n");
      out.write("										<td>");
      out.print(q.getMaQuyen());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(q.getTenQuyen());
      out.write("</td>\r\n");
      out.write("										<td>");
      out.print(q.getMoTa() );
      out.write("</td>\r\n");
      out.write("										<td>\r\n");
      out.write("											<button type=\"button\" class=\"btn btn-outline-danger\">xoá</button>\r\n");
      out.write("										</td>\r\n");
      out.write("									</tr>\r\n");
      out.write("									");
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("								</tbody>\r\n");
      out.write("							</table>\r\n");
      out.write("							<!-- End Table with stripped rows -->\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("\r\n");
      out.write("	</main>\r\n");
      out.write("	<!-- End #main -->\r\n");
      out.write("\r\n");
      out.write("	<!-- ======= Footer ======= -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<a href=\"#\"\r\n");
      out.write("		class=\"back-to-top d-flex align-items-center justify-content-center\"><i\r\n");
      out.write("		class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("	<!-- Vendor JS Files -->\r\n");
      out.write("	<script src=\"assetsquantri/vendor/apexcharts/apexcharts.min.js\"></script>\r\n");
      out.write("	<script src=\"assetsquantri/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("	<script src=\"assetsquantri/vendor/chart.js/chart.umd.js\"></script>\r\n");
      out.write("	<script src=\"assetsquantri/vendor/echarts/echarts.min.js\"></script>\r\n");
      out.write("	<script src=\"assetsquantri/vendor/quill/quill.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"assetsquantri/vendor/simple-datatables/simple-datatables.js\"></script>\r\n");
      out.write("	<script src=\"assetsquantri/vendor/tinymce/tinymce.min.js\"></script>\r\n");
      out.write("	<script src=\"assetsquantri/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Template Main JS File -->\r\n");
      out.write("	<script src=\"assetsquantri/js/main.js\"></script>\r\n");
      out.write("	<script> \r\n");
      out.write("	document.getElementById('addb').addEventListener('click', () => {toggleUpload();});\r\n");
      out.write("	function toggleUpload() {\r\n");
      out.write("    const addForm = document.getElementById('addf');\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    if (addForm.classList.contains('hide')) {\r\n");
      out.write("        addForm.classList.remove('hide');\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("    } else {\r\n");
      out.write("        addForm.classList.add('hide');\r\n");
      out.write("       \r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
