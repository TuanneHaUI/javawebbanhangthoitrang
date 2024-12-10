package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Reponsitory.LaydulieuReponsitory;

/**
 * Servlet implementation class Themchitietsanpham
 */
@WebServlet("/Themchitietsanpham")
public class Themchitietsanpham extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private LaydulieuReponsitory lg = new LaydulieuReponsitory();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Themchitietsanpham() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String mauSac = request.getParameter("color");
		String kichCo = request.getParameter("addKichco");
		int soLuong = Integer.parseInt(request.getParameter("adSoluong"));
		
		
		System.out.println("ID: " + id);
		System.out.println("Màu sắc: " + mauSac);
		System.out.println("Kích cỡ: " + kichCo);
		System.out.println("Số lượng: " + soLuong);
		
		boolean ktra = lg.addChiTietSP(Integer.parseInt(id), mauSac, kichCo, soLuong);
		if(ktra) {
			  response.sendRedirect("Chitietproductquantri.jsp");
		}else {
			request.setAttribute("loi", "Sản phẩm đã tồn tại");

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
