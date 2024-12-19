package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.DonHang;
import model.GioHang;
import model.SanPham;
import model.User;

import java.io.IOException;
import java.util.List;

import Reponsitory.Laydulieuchonguoidung;

/**
 * Servlet implementation class Xacnhangiohang
 */
@WebServlet("/Xacnhangiohang")
public class Xacnhangiohang extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private Laydulieuchonguoidung lgn = new Laydulieuchonguoidung();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Xacnhangiohang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String huy = request.getParameter("Huy");
		String datHang = request.getParameter("Dathang");
		String[] gia = request.getParameterValues("gia");
		String[] tenSanPham = request.getParameterValues("Tensanpham");
		String[] maGiamGia = request.getParameterValues("discount1");
		
		if(datHang != null && datHang.equals("Dathang")) {
			List<GioHang> d = lgn.LayHetThongTinGioHang();
			HttpSession s = request.getSession(false);
			List<User> u = (List<User>) request.getAttribute("Ghinhotaikhoan");
			if(d != null && u != null) {
				int idNguoiDung = 0;
				for(User user : u) {
					idNguoiDung = user.getMaTaiKhoan();
					}
//				lấy mã khuyến mãi với tên sản phẩm
				List<SanPham> sp = lgn.LayMaGiamGiaoIdUser(idNguoiDung);
				
				for(SanPham ss : sp) {
					for(String tensp : tenSanPham) {
						if(ss.equals(tensp)) {
							
						}
					}
				}
			}
			request.setAttribute("gia",gia);
			request.setAttribute("tenSanPham",tenSanPham);
			request.getRequestDispatcher("Xacnhan.jsp");
		}
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
