<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Admin/Category</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assetsquantri/img/favicon.png" rel="icon">
  <link href="assetsquantri/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assetsquantri/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assetsquantri/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assetsquantri/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assetsquantri/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="assetsquantri/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="assetsquantri/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assetsquantri/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assetsquantri/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: NiceAdmin
  * Template URL: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/
  * Updated: Apr 20 2024 with Bootstrap v5.3.3
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body>
	<%
	String projectName = request.getContextPath(); // Lấy tên dự án
	HttpSession s = request.getSession(false);
	List<User> listt = (session != null) ? (List<User>) session.getAttribute("Ghinhotaikhoan") : null;
	%>
  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <div class="logo d-flex align-items-center">
        <img src="assetsquantri/img/logo.png" alt="">
        <span class="d-none d-lg-block">T3admin</span>
      </div>
      <i class="bi bi-list toggle-sidebar-btn"></i>
    </div><!-- End Logo -->

   

   <nav class="header-nav ms-auto">
			<ul class="d-flex align-items-center">

				<li class="nav-item dropdown pe-3">
					
			<a class="nav-link nav-profile d-flex align-items-center pe-0"
					href="#" data-bs-toggle="dropdown"> <i
						class="bi bi-person-circle"></i> <span
						<%if(listt != null){
						for(User u : listt) {%>
						class="d-none d-md-block dropdown-toggle ps-2"><%=u.getHoTen()%>
							</span>
				</a> <!-- End Profile Iamge Icon -->

					<ul
						class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
						<li class="dropdown-header">
							<h6><%=u.getTenTaiKhoan()%></h6>
							<%if(u.getMaQuyen() == 1) {%>
							<span>Quản trị viên</span>
							<%} else{%>
							<span>Khách hàng</span>
							<%} %>
						</li>
						
						<li>
							<hr class="dropdown-divider">
						</li>

							<li><a class="dropdown-item d-flex align-items-center"
							href="Thongtincanhan.jsp"> <i class="bi bi-person"></i> <span>Thông tin cá nhân
									</span>
						</a></li>
						<li>
							<hr class="dropdown-divider">
						</li>
						<li><a class="dropdown-item d-flex align-items-center"
							href="Dangxuat"> <i class="bi bi-box-arrow-right"></i> <span>Đăng
									xuất</span>
						</a></li>

					</ul> <!-- End Profile Dropdown Items -->
				</li>
				<%} }%>
				<!-- End Profile Nav -->

			</ul>
		</nav>

  </header><!-- End Header -->

  <!-- ======= Sidebar ======= -->
 <aside id="sidebar" class="sidebar">

		<ul class="sidebar-nav" id="sidebar-nav">


			<li class="nav-heading">Quản lý bán hàng</li>
			<li class="nav-item"><a class="nav-link collapsed"
				href="<%=projectName%>/category.jsp"> <i
					class="bi bi-layout-text-window-reverse"></i> <span>Danh mục</span>
			</a></li>
			<li class="nav-item"><a class="nav-link " href="<%=projectName%>/Donhangquantri.jsp">
					<i class="bi bi-cart"></i> <span>Đơn hàng</span>
			</a></li>
			<li class="nav-item"><a class="nav-link collapsed"
				href="<%=projectName%>/productquantri.jsp"> <i
					class="bi bi-grid"></i> <span>Sản phẩm</span>
			</a></li>

			<li class="nav-heading">Quản lý tài khoản</li>

			<li class="nav-item"><a class="nav-link collapsed"
				href="<%=projectName%>/account.jsp"> <i class="bi bi-person"></i>
					<span>Tài khoản</span>
			</a></li>
			<!-- End Profile Page Nav -->

			<li class="nav-item"><a class="nav-link collapsed"
				href="<%=projectName%>/group.jsp"> <i
					class="bi bi-question-circle"></i> <span>Phân quyền</span>
			</a></li>
			<!-- End F.A.Q Page Nav -->



		</ul>

	</aside>

  <main id="main" class="main">
    <section class="section orders">
        <div class="card">
          <div class="card-body">
            <h5 class="card-title">Danh sách đơn hàng</h5>
            <table class="table table-bordered">
              <thead>
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">Khách hàng</th>
                  <th scope="col">Sản phẩm</th>
                  <th scope="col">Số lượng</th>
                  <th scope="col">Số điện thoại</th>
                  <th scope="col">Tổng giá trị</th>
                  <th scope="col">Ngày đặt</th>
                  <th scope="col">Địa chỉ giao</th>
                  <th scope="col">Trạng thái</th>
                  <th scope="col">Hành động</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td>Nguyễn Văn A</td>
                  <td>Áo Thun</td>
                  <td>2</td>
                  <td>12345678</td>
                  <td>400,000 VND</td>
                  <td>2024-12-01</td>
                  <td>Lãng công sông lô vĩnh phúc</td>
                  <td><span class="badge bg-warning">Đang xử lý</span></td>
                  <td>
                    <button class="btn btn-primary btn-sm" id="detailB">Xem</button>
                    <button class="btn btn-warning btn-sm">Sửa</button>
                    <button class="btn btn-danger btn-sm">Xóa</button>
                  </td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td>Trần Thị B</td>
                  <td>Quần Jean</td>
                  <td>1</td>
                  <td>750,000 VND</td>
                  <td>2024-12-05</td>
                  <td><span class="badge bg-success">Hoàn thành</span></td>
                  <td>
                    <button class="btn btn-primary btn-sm" id="detailB">Xem</button>
                    <button class="btn btn-warning btn-sm">Sửa</button>
                    <button class="btn btn-danger btn-sm">Xóa</button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </section>
   
  </main><!-- End #main -->
<div id="smoke" class="smoke hide"></div>
  <!-- ======= Footer ======= -->


  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assetsquantri/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assetsquantri/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assetsquantri/vendor/chart.js/chart.umd.js"></script>
  <script src="assetsquantri/vendor/echarts/echarts.min.js"></script>
  <script src="assetsquantri/vendor/quill/quill.js"></script>
  <script src="assetsquantri/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assetsquantri/vendor/tinymce/tinymce.min.js"></script>
  <script src="assetsquantri/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assetsquantri/js/main.js"></script>
  <script> 
	document.getElementById('addb').addEventListener('click', () => {toggleUpload();});
	function toggleUpload() {
		const addForm = document.getElementById('addf');
		

		if (addForm.classList.contains('hide')) {
			addForm.classList.remove('hide');
	   

		} else {
			addForm.classList.add('hide');
		   
		}
	}

	document.getElementById('editB').addEventListener('click', () => {editForm();});
	function editForm() {
		const editF = document.getElementById('editF');
		const smoke = document.getElementById('smoke');
		
		if (editF.classList.contains('hide')) {
			editF.classList.remove('hide');
			smoke.classList.remove('hide');
		}
	}
	document.getElementById('detailB').addEventListener('click', () => {detailForm();});
	function detailForm() {
		const detailF = document.getElementById('detailF');
		const smoke = document.getElementById('smoke');
		
		if (detailF.classList.contains('hide')) {
			detailF.classList.remove('hide');
			smoke.classList.remove('hide');
		}
	}
	document.getElementById('smoke').addEventListener('click', function() {
	  document.getElementById('smoke').classList.add('hide');
	  document.getElementById('editF').classList.add('hide');
	  document.getElementById('detailF').classList.add('hide');  
	});
	
  </script>

</body>

</html>