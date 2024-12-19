package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DonHang;
import model.SanPham;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import Reponsitory.LaydulieuReponsitory;
import Reponsitory.Laydulieuchonguoidung;

@WebServlet("/Bieudodoanhthu")
public class Bieudo extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private Laydulieuchonguoidung lgn = new Laydulieuchonguoidung();
    private LaydulieuReponsitory lg = new LaydulieuReponsitory();
    public Bieudo() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("đã chạy vô servlet chơi");
    	  List<DonHang> donHangList = lgn.LayThongTinDonHang();
    	  System.out.println("Danh sách đơn hàng: " + donHangList); // Debug danh sách đơn hàng
    	    // Kiểm tra danh sách không bị null
    	    if (donHangList == null || donHangList.isEmpty()) {
    	        request.setAttribute("doanhThuMap", null); // Gán null nếu không có dữ liệu
    	    } else {
    	        // Tạo map từ danh sách
    	        Map<String, Double> doanhThuMap = donHangList.stream()
    	            .filter(dh -> dh.getNgayDatHang() != null) // Loại bỏ null
    	            .collect(Collectors.groupingBy(
    	                DonHang::getNgayDatHang,
    	                Collectors.summingDouble(dh -> dh.getSoLuong() * dh.getGia())
    	            ));
    	        System.out.println("doanh thu là: "+ doanhThuMap);
    	        request.setAttribute("doanhThuMap", doanhThuMap);
    	    }
    	    
//    	    Thống kê số lượng hàng bán chạy nhất theo thứ tự từ lớn đến nhỏ
    	    List<SanPham> listSanPham = lg.SanPhamDuocBanChayNhat();
    	    request.setAttribute("soLuongHangBanChay", listSanPham);
    	    request.getRequestDispatcher("bieudo.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
