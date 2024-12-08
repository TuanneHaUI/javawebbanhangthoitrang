package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;
import service.LoginService;

import java.io.IOException;
import java.util.List;

import org.apache.catalina.connector.Response;

import Reponsitory.LaydulieuReponsitory;

/**
 * Servlet implementation class hi
 */
@WebServlet("/dang-nhap")
public class dangnhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private LoginService l = new LoginService();
       private LaydulieuReponsitory ldl = new LaydulieuReponsitory();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhap() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tdn = request.getParameter("tenDangNhap").trim();
		String mk = request.getParameter("matKhau").trim();
		boolean m = l.LoginSoSanh(tdn, mk);
		
		String url ="";
		if(m) {
			int maQuyen = l.getUserRole(tdn,mk);
			HttpSession session = request.getSession();
			List<User> l = ldl.getUser(tdn, mk);
			session.setAttribute("Ghinhotaikhoan", l);
			if(maQuyen == 1 ) {
				url = "/group.jsp";
			}
//				response.getWriter().append("chuc mung ban dang nhap thanh cong");
			if(maQuyen == -1) {
			 url = "/index.html";
				

			}
		
		} else {
			url = "/login.jsp";
		}
		RequestDispatcher rs = getServletContext().getRequestDispatcher(url);
		rs.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
