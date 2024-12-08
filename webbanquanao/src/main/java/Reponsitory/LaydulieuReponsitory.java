package Reponsitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import configg.ConnectionSql;
import model.ChiTietSanPham;
import model.DanhMuc;
import model.Quyen;
import model.SanPham;
import model.User;

public class LaydulieuReponsitory implements Thaotac {

	@Override
	public List<User> getUser(String tenTaiKhoan, String tenMatKhau) {
		List<User> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "SELECT * FROM NguoiDung WHERE TenDangNhap = ? AND MatKhau = ? and trangThai = ?";

			// Chuẩn bị câu lệnh SQL
			ps = conn.prepareStatement(query);
			ps.setString(1, tenTaiKhoan);
			ps.setString(2, tenMatKhau);
			ps.setString(3, "True");
			// Thực thi câu lệnh SQL
			rs = ps.executeQuery();

			// Xử lý kết quả trả về
			while (rs.next()) {
				User us = new User();
				us.setTenTaiKhoan(rs.getString("TenDangNhap"));
				us.setMatKhau(rs.getString("MatKhau"));
				us.setHoTen(rs.getString("HoTen"));
				us.setEmail(rs.getString("Email"));
				us.setSoDienThoai(rs.getString("SoDienThoai"));
				us.setDiaChi(rs.getString("DiaChi"));
				us.setMaQuyen(rs.getInt("MaQuyen"));
				us.setTrangThai(rs.getString("trangThai"));
				list.add(us);
			}
		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public List<Quyen> Laythongtin() {
		List<Quyen> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "SELECT * FROM quyen";

			// Chuẩn bị câu lệnh SQL
			ps = conn.prepareStatement(query);

			// Thực thi câu lệnh SQL
			rs = ps.executeQuery();

			// Xử lý kết quả trả về
			while (rs.next()) {
				Quyen q = new Quyen();
				q.setMaQuyen(rs.getInt("MaQuyen"));
				q.setTenQuyen(rs.getString("TenQuyen"));
				q.setMoTa(rs.getString("moTa"));
				list.add(q);
			}
		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public List<User> Laythongtinnguoidung() {
		List<User> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "SELECT * FROM nguoidung";

			// Chuẩn bị câu lệnh SQL
			ps = conn.prepareStatement(query);

			// Thực thi câu lệnh SQL
			rs = ps.executeQuery();

			// Xử lý kết quả trả về
			while (rs.next()) {
				String tenTaiKhoan = rs.getString("TenDangNhap");
				String matKhau = rs.getString("MatKhau");
				String hoTen = rs.getString("HoTen");
				String email = rs.getString("Email");
				String soDienThoai = rs.getString("SoDienThoai");
				int maQuyen = rs.getInt("MaQuyen");
				String diaChi = rs.getString("DiaChi");
				int maTaiKhoan = rs.getInt("MaNguoiDung");
				String trangThai = rs.getString("trangThai");
				// Tạo đối tượng User và truyền giá trị vào constructor
				User user = new User(tenTaiKhoan, matKhau, hoTen, email, soDienThoai, diaChi, trangThai, maQuyen,
						maTaiKhoan);

				// Thêm đối tượng User vào danh sách
				list.add(user);
			}
		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public boolean Dangki(String tenTaiKhoan, String matKhau, String Email, String hoTen, String soDienThoai,
			String diaChi) {
		boolean ktra = false;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		System.out.println(tenTaiKhoan);
		System.out.println(Email);
		System.out.println(matKhau);
		System.out.println(hoTen);
		System.out.println(soDienThoai);
		System.out.println(diaChi);
		try {
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection();
			String them = "INSERT INTO NguoiDung (TenDangNhap, MatKhau, HoTen, Email, SoDienThoai, MaQuyen, DiaChi,trangThai) VALUES (?,?,?,?,?,?,?,?)";
			ps = conn.prepareStatement(them);
			ps = conn.prepareStatement(them);
			ps.setString(1, tenTaiKhoan);
			ps.setString(2, matKhau);
			ps.setString(3, hoTen);
			ps.setString(4, Email);
			ps.setString(5, soDienThoai);
			ps.setInt(6, 3);
			ps.setString(7, diaChi);
			ps.setString(8, "True");
			int row = ps.executeUpdate();
			if (row > 0) {
				ktra = true;
				conn.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return ktra;
	}

	@Override
	public int Delete(int id) {
		int bs = 0;
		Connection conn = null;
		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool
			int xoaNguoiDung = DeteBangUser(id);
			if (xoaNguoiDung > 0) {

				String query = "delete from quyen where MaQuyen=?";

				ps = conn.prepareStatement(query);

				ps.setInt(1, id);

				bs = ps.executeUpdate();
			}

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần xóa phân quyền  LoginReponsitory");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
	}

	@Override
	public int DeteBangUser(int maQuyen) {
		int bs = 0;
		Connection conn = null;
		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "delete from nguoidung where MaQuyen=?";

			// Chuẩn bị câu lệnh SQL

			ps = conn.prepareStatement(query);

			ps.setInt(1, maQuyen);

			// Thực thi câu lệnh SQL

			bs = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần xóa phân quyền  LoginReponsitory");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
	}

	@Override
	public boolean Update(int idNguoiDung, int idQuyen, String idTrangThaiMuonSua) {
		boolean bs = false;
		Connection conn = null;
		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "update nguoidung set MaQuyen=? ,trangThai=? where MaNguoiDung=? ";

			// Chuẩn bị câu lệnh SQL

			ps = conn.prepareStatement(query);

			ps.setInt(1, idQuyen);
			ps.setString(2, idTrangThaiMuonSua);
			ps.setInt(3, idNguoiDung);
			// Thực thi câu lệnh SQL

			if (ps.executeUpdate() > 0) {
				bs = true;
			}

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần xóa phân quyền  LoginReponsitory");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
	}

	@Override
	public boolean DeleteUser(int id) {
		boolean bs = false;
		Connection conn = null;
		PreparedStatement ps = null;

		ResultSet rs = null;

		try {

			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "delete from nguoidung where MaNguoiDung=?";

			// Chuẩn bị câu lệnh SQL

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);
			// Thực thi câu lệnh SQL

			if (ps.executeUpdate() > 0) {
				bs = true;
			}

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần xóa phân quyền  LoginReponsitory");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
	}

	@Override
	public List<SanPham> Laythongtinsanpham() {
		List<SanPham> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "SELECT * FROM sanpham ";

			// Chuẩn bị câu lệnh SQL
			ps = conn.prepareStatement(query);

			// Thực thi câu lệnh SQL
			rs = ps.executeQuery();

			// Xử lý kết quả trả về
			while (rs.next()) {
				int masp = rs.getInt("MaSanPham");
				System.out.println("ma sản phảm là" + rs.getInt("MaSanPham"));
//                int sl = rs.getInt("SoLuong");
				int madanhmuc = rs.getInt("MaDanhMuc");
				String tenSp = rs.getString("TenSanPham");
				String mota = rs.getString("MoTa");
				String duongdananh = rs.getString("DuongDanAnh");
				float g = rs.getFloat("Gia");
				SanPham us = new SanPham(masp, madanhmuc, tenSp, mota, duongdananh, g);
				list.add(us);
			}
		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory lấy thông tin sản phẩm");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public List<DanhMuc> Laythongtidanhmuc() {
		List<DanhMuc> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "SELECT * FROM danhmucsanpham";

			// Chuẩn bị câu lệnh SQL
			ps = conn.prepareStatement(query);

			// Thực thi câu lệnh SQL
			rs = ps.executeQuery();

			// Xử lý kết quả trả về
			while (rs.next()) {
				DanhMuc q = new DanhMuc();
				q.setMaDanhmuc(rs.getInt("MaDanhMuc"));
				q.setTenDanhMuc(rs.getString("TenDanhMuc"));
				list.add(q);
			}
		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory phần danh muc sản phẩm");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public List<ChiTietSanPham> Laythongtinchitietsanpham() {
		List<ChiTietSanPham> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "SELECT * FROM chitietsanpham";

			// Chuẩn bị câu lệnh SQL
			ps = conn.prepareStatement(query);

			// Thực thi câu lệnh SQL
			rs = ps.executeQuery();

			// Xử lý kết quả trả về
			while (rs.next()) {
				ChiTietSanPham chitiet = new ChiTietSanPham(rs.getInt("id"), rs.getInt("MaSanPham"),
						rs.getInt("soLuong"), rs.getString("mauSac"), rs.getString("kichCo"));
				list.add(chitiet);
			
			}
		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory phần chi tiết sản phẩm");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public boolean xoaChiTietProductQuanTri(int id) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean bs = false;
		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "DELETE FROM chitietsanpham WHERE id = ?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);
			// Thực thi câu lệnh SQL

			if (ps.executeUpdate() > 0) {
				bs = true;
			}

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory xóa phần chi tiết sản phẩm");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
	}

	@Override
	public boolean suaChiTietProductQuanTri(int id, int soLuong) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean bs = false;
		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "update chitietsanpham set  soLuong=? WHERE id = ?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, soLuong);
			ps.setInt(2, id);
			// Thực thi câu lệnh SQL

			if (ps.executeUpdate() > 0) {
				bs = true;
			}

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory cập nhật thông tin chi tiết");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
		
	}

	@Override
	public int xoaHetChiTietSanPham(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int bs = 0;
		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "delete from chitietsanpham where MaSanPham = ?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);
			// Thực thi câu lệnh SQL
			bs = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory xóa hết thông tin chi tiết sản phẩm");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
	}

	@Override
	public int xoaSanPhamID(int id) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int bs = 0;
		try {
			// Tạo đối tượng ConnectionSql để lấy kết nối
			ConnectionSql connectionSql = new ConnectionSql();
			conn = connectionSql.getConnection(); // Lấy kết nối từ pool

			// Câu truy vấn SQL
			String query = "delete from sanpham where MaSanPham = ?";

			ps = conn.prepareStatement(query);

			ps.setInt(1, id);
			// Thực thi câu lệnh SQL

			bs = ps.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Lỗi trong phần LoginReponsitory xóa hết thông tin chi tiết sản phẩm");
			e.printStackTrace();
		} finally {
			// Đảm bảo tài nguyên được đóng đúng cách và trả kết nối vào pool
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				// Trả kết nối lại vào pool
				if (conn != null) {
					ConnectionSql connectionSql = new ConnectionSql();
					connectionSql.releaseConnection(conn); // Trả kết nối về pool
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return bs;
	}
}