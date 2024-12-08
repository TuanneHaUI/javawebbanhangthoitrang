package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@WebServlet("/Suasanphamproductquantri")
@MultipartConfig
public class Suasanphamproductquantri extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String IMAGE_DIRECTORY = "D:\\img\\lotat\\";

    public Suasanphamproductquantri() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Bạn có thể chuyển hướng người dùng đến một trang khác sau khi xử lý (nếu cần).
        response.sendRedirect("productquantri.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String productId = request.getParameter("product-id");
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String price = request.getParameter("price");
        String description = request.getParameter("description");

        // Lấy ảnh từ form (tên trường input là "image")
        Part imagePart = request.getPart("image");
        
        // Kiểm tra nếu có ảnh tải lên
        if (imagePart != null) {
            String fileName = Path.of(imagePart.getSubmittedFileName()).getFileName().toString();
            System.out.println("Đã tải lên ảnh: " + fileName);

            // Tạo thư mục nếu chưa tồn tại
            File uploadDir = new File(IMAGE_DIRECTORY);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();  // Tạo thư mục nếu chưa có
            }

            // Lưu ảnh vào thư mục đã chỉ định
            String filePath = IMAGE_DIRECTORY + fileName;
            imagePart.write(filePath);
            System.out.println("Ảnh đã được lưu vào: " + filePath);

            // Trả về đường dẫn ảnh để sử dụng trong database hoặc hiển thị trong ứng dụng
            String imagePath = "/uploads/" + fileName;

            // Tiến hành lưu các thông tin khác (ví dụ: vào database)
            // Giả sử là lưu vào cơ sở dữ liệu (không triển khai chi tiết ở đây)

            // Chuyển hướng người dùng trở lại trang quản lý sản phẩm (hoặc thực hiện các thao tác khác)
            request.setAttribute("imagePath", imagePath);
            request.getRequestDispatcher("productquantri.jsp").forward(request, response);  // Điều hướng về trang
        }
    }
}
