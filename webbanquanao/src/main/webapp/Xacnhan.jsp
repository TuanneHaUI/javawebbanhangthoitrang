<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Xác Nhận Đơn Hàng</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f9f9f9;
        }
        .container {
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            background: #fff;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }
        h1 {
            text-align: center;
            color: #333;
        }
        .order-item {
            display: flex;
            justify-content: space-between;
            padding: 10px 0;
            border-bottom: 1px solid #ddd;
        }
        .order-item:last-child {
            border-bottom: none;
        }
        .order-item span {
            display: inline-block;
            width: 30%;
            text-align: center;
        }
        .total {
            font-weight: bold;
            font-size: 18px;
            margin-top: 20px;
        }
        .buttons {
            display: flex;
            justify-content: space-between;
            margin-top: 20px;
        }
        .buttons button {
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        .btn-cancel {
            background-color: #f44336;
            color: white;
        }
        .btn-confirm {
            background-color: #4caf50;
            color: white;
        }
        .btn-cancel:hover {
            background-color: #d32f2f;
        }
        .btn-confirm:hover {
            background-color: #388e3c;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Xác Nhận Đơn Hàng</h1>
        <div id="order-list">
            <!-- Sản phẩm 1 -->
            <%
            String 
            %>
            <div class="order-item">
                <span>Tên sản phẩm</span>
                <span>Giá trước giảm</span>
                <span>Giá sau giảm</span>
            </div>
            <div class="order-item">
                <span>Sản phẩm A</span>
                <span>200,000 VND</span>
                <span>180,000 VND</span>
            </div>
            <div class="order-item">
                <span>Sản phẩm B</span>
                <span>150,000 VND</span>
                <span>135,000 VND</span>
            </div>
        </div>
        <div class="total">Tổng cộng: <span>315,000 VND</span></div>
        <div class="buttons">
            <button class="btn-cancel" onclick="cancelOrder()">Hủy</button>
            <button class="btn-confirm" onclick="confirmOrder()">Xác nhận</button>
        </div>
    </div>

    <script>
        function cancelOrder() {
            if (confirm("Bạn có chắc muốn hủy đơn hàng?")) {
                window.location.href = "TrangGioHang.jsp"; // Chuyển hướng về giỏ hàng
            }
        }

        function confirmOrder() {
            alert("Đơn hàng đã được xác nhận!");
            window.location.href = "TrangCamOn.jsp"; // Chuyển hướng đến trang cảm ơn
        }
    </script>
</body>
</html>
    