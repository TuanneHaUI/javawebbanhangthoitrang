<%@page import="model.ChiTietSanPham"%>
<%@page import="Reponsitory.LaydulieuReponsitory"%>
<%@page import="model.DonHang"%>
<%@page import="Reponsitory.Laydulieuchonguoidung"%>
<%@page import="controller.Donhang"%>
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
<link href="assetsquantri/img/apple-touch-icon.png"
	rel="apple-touch-icon">

<!-- Google Fonts -->
<link href="https://fonts.gstatic.com" rel="preconnect">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Vendor CSS Files -->
<link href="assetsquantri/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<link href="assetsquantri/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet">
<link href="assetsquantri/vendor/boxicons/css/boxicons.min.css"
	rel="stylesheet">
<link href="assetsquantri/vendor/quill/quill.snow.css" rel="stylesheet">
<link href="assetsquantri/vendor/quill/quill.bubble.css"
	rel="stylesheet">
<link href="assetsquantri/vendor/remixicon/remixicon.css"
	rel="stylesheet">
<link href="assetsquantri/vendor/simple-datatables/style.css"
	rel="stylesheet">

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
				<img src="assetsquantri/img/logo.png" alt=""> <span
					class="d-none d-lg-block">T3admin</span>
			</div>
			<i class="bi bi-list toggle-sidebar-btn"></i>
		</div>
		<!-- End Logo -->



		<nav class="header-nav ms-auto">
			<ul class="d-flex align-items-center">

				<li class="nav-item dropdown pe-3"><a
					class="nav-link nav-profile d-flex align-items-center pe-0"
					href="#" data-bs-toggle="dropdown"> <i
						class="bi bi-person-circle"></i> <span
						<%if (listt != null) {
	for (User u : listt) {%>
						class="d-none d-md-block dropdown-toggle ps-2"><%=u.getHoTen()%>
					</span>
				</a> <!-- End Profile Iamge Icon -->

					<ul
						class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
						<li class="dropdown-header">
							<h6><%=u.getTenTaiKhoan()%></h6> <%
 if (u.getMaQuyen() == 1) {
 %> <span>Quản
								trị viên</span> <%
 } else {
 %> <span>Khách hàng</span> <%
 }
 %>
						</li>

						<li>
							<hr class="dropdown-divider">
						</li>

						<li><a class="dropdown-item d-flex align-items-center"
							href="Thongtincanhan.jsp"> <i class="bi bi-person"></i> <span>Thông
									tin cá nhân </span>
						</a></li>
						<li>
							<hr class="dropdown-divider">
						</li>
						<li><a class="dropdown-item d-flex align-items-center"
							href="Dangxuat"> <i class="bi bi-box-arrow-right"></i> <span>Đăng
									xuất</span>
						</a></li>

					</ul> <!-- End Profile Dropdown Items --></li>
				<%
				}
				}
				%>
				<!-- End Profile Nav -->

			</ul>
		</nav>

	</header>
	<!-- End Header -->

	<!-- ======= Sidebar ======= -->
	<aside id="sidebar" class="sidebar">

		<ul class="sidebar-nav" id="sidebar-nav">
<li class="nav-heading">Tổng quan dữ liệu</li>
			<li class="nav-item"><a class="nav-link collapsed"
				href="<%=projectName%>/Bieudodoanhthu"> <i
					class="bi bi-layout-text-window-reverse"></i> <span>Biểu đồ
						thống kê</span>
			</a></li>

			<li class="nav-heading">Quản lý bán hàng</li>
			<li class="nav-item"><a class="nav-link collapsed"
				href="<%=projectName%>/category.jsp"> <i
					class="bi bi-layout-text-window-reverse"></i> <span>Danh mục</span>
			</a></li>
			<li class="nav-item"><a class="nav-link "
				href="<%=projectName%>/Donhangquantri.jsp"> <i
					class="bi bi-cart"></i> <span>Đơn hàng</span>
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
						<div id="editSection" style="display: none;">
							<form action="SuavaXoaDonHanQuanTri" >
								<input type="hidden" id="itemId" name="idDonHangCanSua"/> <label for="status">Trạng
									thái:</label> <select id="status" name="trangThai">
									<option value="Đang giao đến bạn">Đang giao đến bạn</option>
									<option value="Tạm dừng">Tạm dừng</option>
									<option value="Đang chuẩn bị hàng">Đang chuẩn bị hàng</option>
									<option value="Hoàn thành">Hoàn thành</option>
								</select>
								<button type="submit" class="btn btn-primary" name="Luu" value="Luu">Lưu 
									</button>
							</form>
						</div>
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
								<%
								Laydulieuchonguoidung lgn = new Laydulieuchonguoidung();
								List<DonHang> l = lgn.LayThongTinDonHang();
								LaydulieuReponsitory lg = new LaydulieuReponsitory();
								List<ChiTietSanPham> listChiTiet = lg.Laythongtinchitietsanpham();
								for (DonHang h : l) {
								%>
								<tr>
									<th scope="row"><%=h.getMaDonHang()%></th>
									<td><%=h.getTenKhachHang()%></td>
									<td><%=h.getMaChiTietSanPham()%></td>
									<td><%=h.getSoLuong()%></td>
									<td><%=h.getSoDienThoai()%></td>
									<td><%=h.getGia()%></td>
									<td><%=h.getNgayDatHang()%></td>
									<td><%=h.getDiaChiGiaoHang()%></td>
									<td><span class="badge bg-warning"><%=h.getTrangThai()%></span></td>
									<td>
										<button class="btn btn-warning btn-sm"
											onclick="editStatus('<%=h.getMaDonHang() %>')">Sửa</button>
											<form action="SuavaXoaDonHanQuanTri">
											<input type="hidden" value="<%=h.getMaDonHang()%>"
										name="idDonHang">
										<button class="btn btn-danger btn-sm" name="Xoa" value="Xoa"
											onclick="confirmDelete()">Xóa</button>
											</form>
											</td>
								</tr>
								<%
								}
								%>
							</tbody>
						</table>
					</div>
				</div>
			</section>

		</main>
	
	<div id="editSection" style="display: none;">
		<form>
			<input type="hidden" id="itemId" /> <label for="status">Trạng
				thái:</label> <select id="status">
				<option value="1">Đang hoạt động</option>
				<option value="0">Tạm dừng</option>
			</select>
			<button type="submit" class="btn btn-primary">Lưu thay đổi</button>
		</form>
	</div>



	<!-- End #main -->
	<div id="smoke" class="smoke hide"></div>
	<!-- ======= Footer ======= -->


	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i></a>

	<!-- Vendor JS Files -->
	<script src="assetsquantri/vendor/apexcharts/apexcharts.min.js"></script>
	<script src="assetsquantri/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
	<script src="assetsquantri/vendor/chart.js/chart.umd.js"></script>
	<script src="assetsquantri/vendor/echarts/echarts.min.js"></script>
	<script src="assetsquantri/vendor/quill/quill.js"></script>
	<script
		src="assetsquantri/vendor/simple-datatables/simple-datatables.js"></script>
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
	 function confirmDelete() {
		    const confirmed = confirm("Bạn có chắc chắn muốn xóa mục này không?");
		    if (confirmed) {
		      // Thực hiện hành động xóa, ví dụ gửi form hoặc gọi API
		      alert("Mục đã được xóa thành công!");
		    } else {
		      // Người dùng hủy bỏ hành động
		      alert("Hành động đã bị hủy.");
		    }
		  }
	 function editStatus(id) {
		    // Hiển thị phần sửa trạng thái, ví dụ hiển thị form hoặc div để sửa
		    const editSection = document.getElementById("editSection");
		    editSection.style.display = "block";  // Hiển thị phần sửa

		    // Điền giá trị ID vào trường ẩn hoặc hiển thị
		    const idInput = document.getElementById("itemId");
		    idInput.value = id;

		    // Hoặc bạn có thể sử dụng ID để tải thông tin mục cần sửa từ server, v.v.
		    alert("Bạn chắc chắn muốn sửa chứ? ");
		  }
  </script>

</body>

</html>