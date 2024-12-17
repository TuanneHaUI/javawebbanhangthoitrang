<%@page import="model.User"%>
<%@page import="model.ChiTietSanPham"%>
<%@page import="model.DanhMuc"%>
<%@page import="model.SanPham"%>
<%@page import="java.util.List"%>
<%@page import="Reponsitory.LaydulieuReponsitory"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta content="width=device-width, initial-scale=1.0" name="viewport">

<title>Admin/Product</title>
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
<style>

/* Che lớp mờ */
#smoke {
	position: fixed;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background: rgba(0, 0, 0, 0.5);
	z-index: 999;
}

/* Modal chính */
#editF {
	position: fixed;
	top: 50%;
	left: 50%;
	transform: translate(-50%, -50%);
	width: 400px;
	background: white;
	padding: 20px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
	z-index: 1000;
	border-radius: 8px;
}

/* Ẩn các phần tử */
.hide {
	display: none;
}

/* Nút đóng */
.close-btn {
	position: absolute;
	top: 10px;
	right: 10px;
	font-size: 20px;
	cursor: pointer;
}
</style>
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
		<!-- End Icons Navigation -->

	</header>
	<!-- End Header -->

	<!-- ======= Sidebar ======= -->

	<aside id="sidebar" class="sidebar">

		<ul class="sidebar-nav" id="sidebar-nav">
			<li class="nav-heading">Tổng quan dữ liệu</li>
			<li class="nav-item"><a class="nav-link "
				href="<%=projectName%>/bieudo.jsp"> <i
					class="bi bi-layout-text-window-reverse"></i> <span>biểu đồ thống kê</span>
			</a></li>
			<li class="nav-heading">Quản lý bán hàng</li>
			<li class="nav-item"><a class="nav-link collapsed"
				href="<%=projectName%>/category.jsp"> <i
					class="bi bi-layout-text-window-reverse"></i> <span>Danh mục</span>
			</a></li>
			<li class="nav-item"><a class="nav-link collapsed" href="<%=projectName%>/Donhangquantri.jsp">
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
	<!-- End Sidebar-->
	<!-- End Sidebar-->

	<main id="main" class="main">

		<div class="col-lg-6">
    <div class="card">
      <div class="card-body">
        <h5 class="card-title">Bar CHart</h5>

        <!-- Bar Chart -->
        <canvas id="barChart" style="max-height: 400px;"></canvas>
        <script>
          document.addEventListener("DOMContentLoaded", () => {
            new Chart(document.querySelector('#barChart'), {
              type: 'bar',
              data: {
                labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
                datasets: [{
                  label: 'Bar Chart',
                  data: [65, 59, 80, 81, 56, 55, 40],
                  backgroundColor: [
                    'rgba(255, 99, 132, 0.2)',
                    'rgba(255, 159, 64, 0.2)',
                    'rgba(255, 205, 86, 0.2)',
                    'rgba(75, 192, 192, 0.2)',
                    'rgba(54, 162, 235, 0.2)',
                    'rgba(153, 102, 255, 0.2)',
                    'rgba(201, 203, 207, 0.2)'
                  ],
                  borderColor: [
                    'rgb(255, 99, 132)',
                    'rgb(255, 159, 64)',
                    'rgb(255, 205, 86)',
                    'rgb(75, 192, 192)',
                    'rgb(54, 162, 235)',
                    'rgb(153, 102, 255)',
                    'rgb(201, 203, 207)'
                  ],
                  borderWidth: 1
                }]
              },
              options: {
                scales: {
                  y: {
                    beginAtZero: true
                  }
                }
              }
            });
          });
        </script>
        <!-- End Bar CHart -->

      </div>
    </div>
  </div>
  <div class="col-lg-6">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">Pie Chart</h5>

              <!-- Pie Chart -->
              <canvas id="pieChart" style="max-height: 400px;"></canvas>
              <script>
                document.addEventListener("DOMContentLoaded", () => {
                  new Chart(document.querySelector('#pieChart'), {
                    type: 'pie',
                    data: {
                      labels: [
                        'Red',
                        'Blue',
                        'Yellow'
                      ],
                      datasets: [{
                        label: 'My First Dataset',
                        data: [300, 50, 100],
                        backgroundColor: [
                          'rgb(255, 99, 132)',
                          'rgb(54, 162, 235)',
                          'rgb(255, 205, 86)'
                        ],
                        hoverOffset: 4
                      }]
                    }
                  });
                });
              </script>
              <!-- End Pie CHart -->

            </div>
          </div>
        </div>
	</main>
	<!-- End #main -->
	<div id="smoke" class="smoke hide"></div>
	<div id="smoke2" class="smoke hide" style="z-index: 2221"></div>
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
	document.getElementById('addb').addEventListener('click', toggleUpload);
	function toggleUpload() {
	    const addForm = document.getElementById('addf');
	    addForm.classList.toggle('hide');
	}

	document.getElementById('adds').addEventListener('click', styleUpload);
	function styleUpload() {
	    const addStyle = document.getElementById('addstyle');
	    addStyle.classList.toggle('hide');
	}

	const form = document.getElementById('inputForm');
	const submitButton = document.getElementById('submitButton');
	const tableBody = document.querySelector('#recordsTable tbody');

	let records = [];
	const updateTable = () => {
	    tableBody.innerHTML = "";
	    if (records.length === 0) {
	        tableBody.innerHTML = `<tr><td>Chưa có kiểu dáng nào được thêm</td></tr>`;
	        return;
	    }
	    records.forEach((record, index) => {
	        const row = document.createElement('tr');
	        row.innerHTML = `
	            <td>${index + 1}</td>
	            <td>${record.color}</td>
	            <td>${record.size}</td>
	            <td>${record.quantity}</td>
	        `;
	        tableBody.appendChild(row);
	    });
	};

	submitButton.addEventListener('click', () => {
	    const color = document.getElementById('inputColor').value.trim();
	    const size = document.getElementById('inputSize').value.trim();
	    const quantity = document.getElementById('inputQuantity').value.trim();

	    if (!color || !size || !quantity) {
	        alert("hãy nhập đầy đủ các mục");
	        return;
	    }

	    records.push({ color, size, quantity });
	    updateTable();
	    form.reset();
	});


/* function editForm() {
    const editF = document.getElementById('editF');
    const smoke = document.getElementById('smoke');
    editF.classList.remove('hide');
    smoke.classList.remove('hide');
} */
//Hàm mở modal
function editForm(button) {
    const editF = document.getElementById('editF'); // Modal chỉnh sửa
    const smoke = document.getElementById('smoke'); // Lớp mờ nền
    const productIdInput = document.getElementById('product-id'); // Ô input chứa ID sản phẩm

    // Lấy ID từ nút bấm và gán vào ô input
    const productId = button.getAttribute('data-id');
    productIdInput.value = productId;

    // Hiển thị modal và lớp mờ nền
    editF.classList.remove('hide');
    smoke.classList.remove('hide');
}

// Hàm đóng modal
function closeModal(event) {
    const editF = document.getElementById('editF');
    const smoke = document.getElementById('smoke');

    // Nếu click vào lớp mờ hoặc nút đóng
    if (!event || event.target === smoke || event.target.classList.contains('close-btn')) {
        editF.classList.add('hide');
        smoke.classList.add('hide');
    }
}

// Xử lý nút lưu
 function handleSave(event) {
   /*  event.preventDefault(); // Ngăn chặn reload trang
    alert('Đã lưu thông tin!'); */
    closeModal(); // Đóng modal sau khi lưu
} 

function detailForm() {
    const detailF = document.getElementById('detailF');
    const smoke = document.getElementById('smoke');
    detailF.classList.remove('hide');
    smoke.classList.remove('hide');
}

document.getElementById('smoke').addEventListener('click', function () {
    document.getElementById('smoke').classList.add('hide');
    document.getElementById('editF').classList.add('hide');
    document.getElementById('detailF').classList.add('hide');
    saveTabState('');
});
 function editsForm() {
    const editS = document.getElementById('editS');
    const smoke = document.getElementById('smoke2');
    editS.classList.remove('hide');
    smoke2.classList.remove('hide');
} 
document.getElementById('smoke2').addEventListener('click', function () {
    document.getElementById('smoke2').classList.add('hide');
    document.getElementById('editS').classList.add('hide');
    saveTabState('');
});

// Lưu trạng thái tab vào Local Storage
function saveTabState(tabId) {
    localStorage.setItem('activeTab', tabId);
}

// Khôi phục trạng thái tab khi load lại trang
window.addEventListener('load', () => {
    const activeTab = localStorage.getItem('activeTab');
    if (activeTab) {
        document.getElementById(activeTab)?.classList.remove('hide');
        document.getElementById('smoke')?.classList.remove('hide');
    }
});
//Sử dụng sự kiện click cho tất cả các nút sửa
document.querySelectorAll('.editB').forEach(button => {
    button.addEventListener('click', function() {
        var productId = this.getAttribute('data-id');
        // Mở form sửa sản phẩm hoặc xử lý các hành động khác
        console.log("Sửa sản phẩm với ID: " + productId);
        // Thực hiện các thao tác liên quan, ví dụ hiển thị form sửa
    });
});

</script>


</body>

</html>