/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-12-09 08:19:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import model.SanPham;
import java.util.List;
import Reponsitory.LaydulieuReponsitory;
import model.ChiTietSanPham;

public final class Chitietproductquantri_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("model.ChiTietSanPham");
    _jspx_imports_classes.add("Reponsitory.LaydulieuReponsitory");
    _jspx_imports_classes.add("model.SanPham");
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
      out.write("<html lang=\"vi\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Sản phẩm</title>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("	font-family: 'Arial', sans-serif;\r\n");
      out.write("	background-color: #f4f4f4;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	padding: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product {\r\n");
      out.write("	max-width: 1200px;\r\n");
      out.write("	margin: 50px auto;\r\n");
      out.write("	padding: 30px;\r\n");
      out.write("	background-color: #ffffff;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	box-shadow: 0 8px 30px rgba(0, 0, 0, 0.1);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-title {\r\n");
      out.write("	font-size: 3rem;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #333;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-image {\r\n");
      out.write("	width: 150px; /* Set a specific width for the image */\r\n");
      out.write("	height: 150px; /* Set the same height to maintain a perfect circle */\r\n");
      out.write("	border-radius: 50%; /* Makes the image circular */\r\n");
      out.write("	object-fit: cover;\r\n");
      out.write("	/* Ensures the image covers the circle without distortion */\r\n");
      out.write("	box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".variants {\r\n");
      out.write("	margin-bottom: 40px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".variant {\r\n");
      out.write("	background-color: #f9f9f9;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	padding: 25px;\r\n");
      out.write("	margin-bottom: 25px;\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: space-between;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".variant:hover {\r\n");
      out.write("	background-color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".color-box {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	width: 40px;\r\n");
      out.write("	height: 40px;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	margin-right: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".yellow {\r\n");
      out.write("	background-color: yellow;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".purple {\r\n");
      out.write("	background-color: purple;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".red {\r\n");
      out.write("	background-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".blue {\r\n");
      out.write("	background-color: blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".variant-details {\r\n");
      out.write("	font-size: 1.4rem;\r\n");
      out.write("	color: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".size, .quantity {\r\n");
      out.write("	font-size: 1.3rem;\r\n");
      out.write("	color: #777;\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".actions {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	gap: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".edit, .delete, .save {\r\n");
      out.write("	padding: 12px 20px;\r\n");
      out.write("	font-size: 1.3rem;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	transition: background 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".edit {\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".edit:hover {\r\n");
      out.write("	background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete {\r\n");
      out.write("	background-color: #f44336;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".delete:hover {\r\n");
      out.write("	background-color: #e53935;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".save {\r\n");
      out.write("	background-color: #008CBA;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".save:hover {\r\n");
      out.write("	background-color: #007B9E;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".input-field {\r\n");
      out.write("	display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-price {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 2rem;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #333;\r\n");
      out.write("	margin-top: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Button \"Quay lại\" */\r\n");
      out.write(".back-button {\r\n");
      out.write("	display: inline-flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	margin: 20px auto;\r\n");
      out.write("	font-size: 1.4rem;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #ffffff;\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	padding: 12px 25px;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	transition: background 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-button img {\r\n");
      out.write("	width: 20px;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-button:hover {\r\n");
      out.write("	background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cangiua {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	margin-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantBtn {\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("	padding: 12px 25px;\r\n");
      out.write("	margin: 20px auto;\r\n");
      out.write("	background-color: #008CBA;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	font-size: 1.2rem;\r\n");
      out.write("	transition: background 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantBtn:hover {\r\n");
      out.write("	background-color: #007B9E;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Form thêm variant */\r\n");
      out.write("#addVariantForm {\r\n");
      out.write("	display: none;\r\n");
      out.write("	background-color: #fff;\r\n");
      out.write("	padding: 30px;\r\n");
      out.write("	margin-top: 20px;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("	box-shadow: 0 8px 30px rgba(0, 0, 0, 0.1);\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	max-width: 600px;\r\n");
      out.write("	margin-left: auto;\r\n");
      out.write("	margin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantForm h3 {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	font-size: 2rem;\r\n");
      out.write("	margin-bottom: 20px;\r\n");
      out.write("	color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantForm input {\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	margin: 10px 0;\r\n");
      out.write("	border: 1px solid #ccc;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	font-size: 1rem;\r\n");
      out.write("	color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantForm button {\r\n");
      out.write("	width: 48%;\r\n");
      out.write("	padding: 12px;\r\n");
      out.write("	margin: 10px 1%;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	font-size: 1.1rem;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	transition: background 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantForm button[type=\"submit\"] {\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantForm button[type=\"submit\"]:hover {\r\n");
      out.write("	background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantForm button[type=\"button\"] {\r\n");
      out.write("	background-color: #f44336;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantForm button[type=\"button\"]:hover {\r\n");
      out.write("	background-color: #e53935;\r\n");
      out.write("}\r\n");
      out.write("/* Sử dụng Flexbox để căn chỉnh các nút (Quay lại và Thêm variant mới) */\r\n");
      out.write(".button-container {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: space-between; /* Đặt các nút ở 2 đầu đối diện */\r\n");
      out.write("	align-items: center; /* Căn giữa theo chiều dọc */\r\n");
      out.write("	margin: 20px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Nút \"Thêm variant mới\" */\r\n");
      out.write("#addVariantBtn {\r\n");
      out.write("	display: inline-flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	padding: 12px 25px;\r\n");
      out.write("	background-color: #008CBA;\r\n");
      out.write("	color: white;\r\n");
      out.write("	border: none;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	font-size: 1.2rem;\r\n");
      out.write("	transition: background 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantBtn img {\r\n");
      out.write("	width: 20px;\r\n");
      out.write("	margin-right: 10px; /* Khoảng cách giữa biểu tượng và văn bản */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#addVariantBtn:hover {\r\n");
      out.write("	background-color: #007B9E;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Nút \"Quay lại\" */\r\n");
      out.write(".back-button {\r\n");
      out.write("	display: inline-flex;\r\n");
      out.write("	align-items: center;\r\n");
      out.write("	font-size: 1.4rem;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	color: #ffffff;\r\n");
      out.write("	background-color: #4CAF50;\r\n");
      out.write("	padding: 12px 25px;\r\n");
      out.write("	border-radius: 8px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	cursor: pointer;\r\n");
      out.write("	transition: background 0.3s ease;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-button img {\r\n");
      out.write("	width: 20px;\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".back-button:hover {\r\n");
      out.write("	background-color: #45a049;\r\n");
      out.write("}\r\n");
      out.write("/* Hiệu ứng fade-in khi form xuất hiện */\r\n");
      out.write("@\r\n");
      out.write("keyframes fadeIn {from { opacity:0;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("	opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#addVariantForm {\r\n");
      out.write("	display: none;\r\n");
      out.write("	animation: fadeIn 0.5s ease-out; /* Thêm hiệu ứng fade-in */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Hiệu ứng fade-out khi form biến mất */\r\n");
      out.write("@\r\n");
      out.write("keyframes fadeOut {from { opacity:1;\r\n");
      out.write("	\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("	opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#addVariantForm.fade-out {\r\n");
      out.write("	animation: fadeOut 0.5s ease-out;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".cachnhau {\r\n");
      out.write("	margin-bottom: 150px\r\n");
      out.write("}\r\n");
      out.write("/* Style the select box */\r\n");
      out.write(".styled-select {\r\n");
      out.write("	width: 200px; /* Increase the width */\r\n");
      out.write("	padding: 10px; /* Add padding for more space inside */\r\n");
      out.write("	font-size: 16px; /* Increase font size */\r\n");
      out.write("	border: 1px solid #ccc; /* Add a light border */\r\n");
      out.write("	border-radius: 8px; /* Rounded corners */\r\n");
      out.write("	background-color: #f9f9f9; /* Light background color */\r\n");
      out.write("	box-shadow: 0 0 5px rgba(0, 0, 0, 0.1); /* Add a subtle shadow */\r\n");
      out.write("	transition: all 0.3s ease; /* Smooth transition for focus effect */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".styled-select:focus {\r\n");
      out.write("	border-color: #4CAF50; /* Green border when focused */\r\n");
      out.write("	outline: none; /* Remove the default outline */\r\n");
      out.write("	box-shadow: 0 0 8px rgba(0, 123, 255, 0.5);\r\n");
      out.write("	/* Add shadow when focused */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add some spacing for labels and inputs */\r\n");
      out.write("form label {\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	margin-bottom: 5px;\r\n");
      out.write("	display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add some spacing between form elements */\r\n");
      out.write("form input, .styled-select {\r\n");
      out.write("	margin-bottom: 15px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	String projectName = request.getContextPath(); // Lấy tên dự án
	
      out.write('\r');
      out.write('\n');
      out.write('	');

	HttpSession s = request.getSession(false); // false để không tạo session mới
	int id = (Integer) s.getAttribute("idthamchieu");
	String error = (String) request.getAttribute("loi");
	
      out.write("\r\n");
      out.write("	<!-- Form thêm variant mới (ẩn ban đầu) -->\r\n");
      out.write("	<div class=\"cachnhau\" id=\"addVariantForm\">\r\n");
      out.write("		");

		if (error != null) {
		
      out.write("\r\n");
      out.write("		<div style=\"color: red;\">");
      out.print(error);
      out.write("</div>\r\n");
      out.write("		");

		}
		
      out.write("\r\n");
      out.write("		<h3>Thêm Variant Mới</h3>\r\n");
      out.write("\r\n");
      out.write("		<form action=\"Themchitietsanpham\" method=\"GET\">\r\n");
      out.write("			<input type=\"hidden\" value=");
      out.print(id);
      out.write(" name=\"id\"> <label\r\n");
      out.write("				for=\"color\">Màu sắc:</label> <input type=\"text\" id=\"color\"\r\n");
      out.write("				name=\"color\" placeholder=\"Nhập màu sắc\" required><br>\r\n");
      out.write("			<br> <label for=\"size\">Kích cỡ:</label> <br> <select\r\n");
      out.write("				id=\"size\" required class=\"styled-select\" name=\"addKichco\">\r\n");
      out.write("				<option value=\"\">Chọn kích cỡ</option>\r\n");
      out.write("				<option value=\"S\">S</option>\r\n");
      out.write("				<option value=\"M\">M</option>\r\n");
      out.write("				<option value=\"L\">L</option>\r\n");
      out.write("				<option value=\"XL\">XL</option>\r\n");
      out.write("				<option value=\"XXL\">XXL</option>\r\n");
      out.write("			</select><br>\r\n");
      out.write("			<br> <label for=\"quantity\">Số lượng:</label> <input\r\n");
      out.write("				type=\"number\" id=\"quantity\" name=\"adSoluong\"\r\n");
      out.write("				placeholder=\"Nhập số lượng\" required><br>\r\n");
      out.write("			<br>\r\n");
      out.write("\r\n");
      out.write("			<button type=\"submit\" class=\"btn btn-primary\">Lưu</button>\r\n");
      out.write("			<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("				onclick=\"cancelAddVariant()\">Hủy</button>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	");

	LaydulieuReponsitory l = new LaydulieuReponsitory();

	System.out.println("id product quan tri trong phan lay id jsp " + id);
	List<ChiTietSanPham> chitiet = l.Laythongtinchitietsanpham();
	List<SanPham> sp = l.Laythongtinsanpham();
	
      out.write("\r\n");
      out.write("	<div class=\"product\">\r\n");
      out.write("		<div class=\"button-container\">\r\n");
      out.write("			<!-- Nút quay lại -->\r\n");
      out.write("			<a href=\"");
      out.print(projectName);
      out.write("/productquantri.jsp\" class=\"back-button\"> <img\r\n");
      out.write("				src=\"https://img.icons8.com/ios/452/left.png\" alt=\"Quay lại\">\r\n");
      out.write("				Quay lại\r\n");
      out.write("			</a>\r\n");
      out.write("\r\n");
      out.write("			<!-- Nút \"Thêm variant mới\" -->\r\n");
      out.write("			<button id=\"addVariantBtn\" class=\"btn btn-success\">\r\n");
      out.write("				<img src=\"https://img.icons8.com/ios/452/plus.png\" alt=\"Thêm\">\r\n");
      out.write("				Thêm\r\n");
      out.write("			</button>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- Nút quay lại -->\r\n");
      out.write("		<!--  <a href=\"productquantri.jsp\" class=\"back-button\">\r\n");
      out.write("            <img src=\"https://img.icons8.com/ios/452/left.png\" alt=\"Quay lại\"> Quay lại\r\n");
      out.write("        </a>\r\n");
      out.write("        <button id=\"addVariantBtn\" class=\"btn btn-success\">Thêm variant mới</button> -->\r\n");
      out.write("\r\n");
      out.write("		");

		for (SanPham sanpham : sp) {
			if (sanpham.getMaSanpham() == id) {
		
      out.write("\r\n");
      out.write("		<h1 class=\"product-title\">");
      out.print(sanpham.getTenSanPham());
      out.write("</h1>\r\n");
      out.write("		<div class=\"cangiua\">\r\n");
      out.write("			<img src=");
      out.print(sanpham.getDuongDanAnh());
      out.write(" alt=\"Áo thun nam\"\r\n");
      out.write("				class=\"product-image\">\r\n");
      out.write("		</div>\r\n");
      out.write("		");

		}
		}
		
      out.write("\r\n");
      out.write("		");

		for (ChiTietSanPham c : chitiet) {
			if (c.getMaSanPham() == id) {
		
      out.write("\r\n");
      out.write("		<div class=\"variants\">\r\n");
      out.write("			<!-- Các sản phẩm với màu sắc và kích cỡ khác nhau -->\r\n");
      out.write("			<div class=\"variant\">\r\n");
      out.write("				<div class=\"variant-details\">\r\n");
      out.write("					<span style=\"magrin-top: 10px; font-size: 1.3rem; color: #777\">Màu\r\n");
      out.write("						sắc: ");
      out.print(c.getMauSac());
      out.write("</span>\r\n");
      out.write("					<div class=\"size\">\r\n");
      out.write("						Kích cỡ: <span class=\"size-value\">");
      out.print(c.getKichCo());
      out.write("</span>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"quantity\">\r\n");
      out.write("						Số lượng:\r\n");
      out.write("						");
      out.print(c.getSoLuong());
      out.write("</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"actions\">\r\n");
      out.write("					<button class=\"edit\" onclick=\"editVariant(this)\">Sửa</button>\r\n");
      out.write("					<form action=\"Xoachitietproductquantri\" method=\"POST\"\r\n");
      out.write("						class=\"d-inline\">\r\n");
      out.write("						<input type=\"hidden\" name=\"id\"\r\n");
      out.write("							value=\"");
      out.print(c.getIdChiTietSanPham());
      out.write("\">\r\n");
      out.write("						<button class=\"delete\" type=\"submit\">Xóa</button>\r\n");
      out.write("					</form>\r\n");
      out.write("					<form class=\"input-field\" action=\"SuachitietsanphamproductQT\"\r\n");
      out.write("						method=\"POST\">\r\n");
      out.write("						");
      out.write("\r\n");
      out.write("						<input type=\"number\" class=\"quantity-input\" placeholder=\"Số lượng\"\r\n");
      out.write("							name=\"soluong\" value=\"");
      out.print(c.getSoLuong());
      out.write("\"> <input\r\n");
      out.write("							type=\"hidden\" name=\"id\" value=\"");
      out.print(c.getIdChiTietSanPham());
      out.write("\">\r\n");
      out.write("						<button class=\"save\" onclick=\"saveChanges(this) type=\"submit\">Lưu</button>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<!-- Các variant khác tương tự... -->\r\n");
      out.write("		</div>\r\n");
      out.write("		");

		}
		}
		
      out.write("\r\n");
      out.write("		");

		for (SanPham sanpham : sp) {
			if (sanpham.getMaSanpham() == id) {
		
      out.write("\r\n");
      out.write("		<div class=\"product-price\">\r\n");
      out.write("			<p>\r\n");
      out.write("				Giá:\r\n");
      out.write("				");
      out.print(sanpham.getGia());
      out.write("</p>\r\n");
      out.write("		</div>\r\n");
      out.write("		");

		}
		}
		
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		// Hàm hiển thị ô input khi nhấn \"Sửa\"\r\n");
      out.write("		function editVariant(button) {\r\n");
      out.write("			const variant = button.closest('.variant');\r\n");
      out.write("			const inputField = variant.querySelector('.input-field');\r\n");
      out.write("			inputField.style.display = 'block';\r\n");
      out.write("\r\n");
      out.write("			// Hiển thị các giá trị cũ vào các ô input\r\n");
      out.write("			const color = variant.querySelector('.color-box').style.backgroundColor;\r\n");
      out.write("			const size = variant.querySelector('.size-value').textContent;\r\n");
      out.write("			const quantity = variant.querySelector('.quantity').textContent\r\n");
      out.write("					.split(\": \")[1];\r\n");
      out.write("\r\n");
      out.write("			variant.querySelector('.color-input').value = color;\r\n");
      out.write("			variant.querySelector('.size-input').value = size;\r\n");
      out.write("			variant.querySelector('.quantity-input').value = quantity;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		// Hàm lưu thông tin và ẩn các ô input\r\n");
      out.write("		function saveChanges(button) {\r\n");
      out.write("			const variant = button.closest('.variant');\r\n");
      out.write("			const colorInput = variant.querySelector('.color-input').value;\r\n");
      out.write("			const sizeInput = variant.querySelector('.size-input').value;\r\n");
      out.write("			const quantityInput = variant.querySelector('.quantity-input').value;\r\n");
      out.write("\r\n");
      out.write("			// Cập nhật thông tin hiển thị\r\n");
      out.write("			variant.querySelector('.color-box').style.backgroundColor = colorInput;\r\n");
      out.write("			variant.querySelector('.size-value').textContent = sizeInput;\r\n");
      out.write("			variant.querySelector('.quantity').textContent = `Số lượng: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${quantityInput}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("`;\r\n");
      out.write("\r\n");
      out.write("			// Ẩn các ô input và nút Lưu\r\n");
      out.write("			const inputField = variant.querySelector('.input-field');\r\n");
      out.write("			inputField.style.display = 'none';\r\n");
      out.write("		}\r\n");
      out.write("		document.getElementById('addVariantBtn').addEventListener('click', function() {\r\n");
      out.write("			  var addVariantForm = document.getElementById('addVariantForm');\r\n");
      out.write("			  addVariantForm.style.display = 'block';  // Hiển thị form\r\n");
      out.write("			  addVariantForm.classList.remove('fade-out'); // Xóa hiệu ứng fade-out nếu có\r\n");
      out.write("			  addVariantForm.classList.add('fade-in');  // Thêm hiệu ứng fade-in để form xuất hiện mượt mà\r\n");
      out.write("			});\r\n");
      out.write("\r\n");
      out.write("			function cancelAddVariant() {\r\n");
      out.write("			  var addVariantForm = document.getElementById('addVariantForm');\r\n");
      out.write("			  addVariantForm.classList.add('fade-out'); // Thêm hiệu ứng fade-out để form biến mất mượt mà\r\n");
      out.write("			  setTimeout(function() {\r\n");
      out.write("			    addVariantForm.style.display = 'none'; // Ẩn form sau khi hiệu ứng fade-out hoàn tất\r\n");
      out.write("			    addVariantForm.classList.remove('fade-out'); // Reset hiệu ứng fade-out\r\n");
      out.write("			  }, 500); // Thời gian phù hợp với độ dài của hiệu ứng fade-out\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("	</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
