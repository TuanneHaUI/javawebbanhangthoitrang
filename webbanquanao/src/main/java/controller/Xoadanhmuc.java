package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.SanPham;

import java.io.IOException;
import java.util.List;

import Reponsitory.LaydulieuReponsitory;

/**
 * Servlet implementation class Xoadanhmuc
 */
@WebServlet("/Xoadanhmuc")
public class Xoadanhmuc extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private LaydulieuReponsitory lg = new LaydulieuReponsitory();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Xoadanhmuc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		List<SanPham> sp = lg.Laythongtinsanpham();
		for(SanPham sanpham: sp) {
			if(sanpham.getMaDanhMuc()==id) {
				boolean c = lg.deleteChiSPIdDanhMuc(sanpham.getMaSanpham());
			}
		}
		boolean s = lg.deleteSPIdDanhMuc(id);
		boolean ktra = lg.deleteDanhMucID(id);
		if(ktra) {
			request.getRequestDispatcher("category.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("category.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
