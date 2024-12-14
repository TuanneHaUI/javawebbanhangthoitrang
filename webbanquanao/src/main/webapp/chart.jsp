<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Biểu đồ thống kê số lượng sản phẩm</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <h1>Biểu đồ thống kê số lượng sản phẩm theo danh mục</h1>
    <canvas id="myChart" width="400" height="200"></canvas>

    <script>
        // Lấy dữ liệu JSON từ request attribute "chartData"
        var data = JSON.parse('${chartData}'); // Dữ liệu được truyền từ Servlet

        // Chuyển dữ liệu thành mảng labels (Tên danh mục) và datasets (Số lượng sản phẩm)
        var labels = []; // Mảng chứa các tên danh mục
        var quantities = []; // Mảng chứa số lượng sản phẩm

        data.forEach(function(item) {
            labels.push('Danh mục ' + item.MaDanhMuc); // Bạn có thể thay "Danh mục " bằng tên danh mục nếu có bảng tên danh mục
            quantities.push(item.SoLuong);
        });

        // Vẽ biểu đồ với Chart.js
        var ctx = document.getElementById('myChart').getContext('2d');
        var myChart = new Chart(ctx, {
            type: 'bar', // Loại biểu đồ
            data: {
                labels: labels, // Các danh mục sản phẩm
                datasets: [{
                    label: 'Số lượng sản phẩm',
                    data: quantities, // Số lượng sản phẩm của từng danh mục
                    backgroundColor: 'rgba(75, 192, 192, 0.2)', // Màu nền của cột
                    borderColor: 'rgba(75, 192, 192, 1)', // Màu viền của cột
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true // Đảm bảo trục Y bắt đầu từ 0
                    }
                }
            }
        });
    </script>
</body>
</html>
