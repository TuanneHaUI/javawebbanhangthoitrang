package Reponsitory;

import java.util.List;

import model.ChiTietSanPham;
import model.DanhMuc;
import model.Quyen;
import model.SanPham;
import model.User;

public interface Thaotac {
//	public List<Object> Getuser(Object tenTaiKhoan, Object matKhau);
//	public List<Object> Getinfomation();
//	public boolean Dangki(Object tenTaiKhoan, Object matKhau, Object Email, Object hoTen, Object soDienThoai,
//			Object diaChi);
//	public List<Object> Laythongtinnguoidung();
//	public int Detelte(Object id);

	public List<User> getUser(String tenTaiKhoan, String tenMatKhau);

	public List<Quyen> Laythongtin();

	public List<User> Laythongtinnguoidung();

	public boolean Dangki(String tenTaiKhoan, String matKhau, String Email, String hoTen, String soDienThoai,
			String diaChi);

	public int Delete(int id);

	public int DeteBangUser(int maQuyen);

	public boolean Update(int idNguoiDung, int idQuyen, String idTrangThaiMuonSua);

	public boolean DeleteUser(int id);

	public List<SanPham> Laythongtinsanpham();
	public List<DanhMuc> Laythongtidanhmuc();
	public List<ChiTietSanPham> Laythongtinchitietsanpham();
	public boolean xoaChiTietProductQuanTri(int id);
	public boolean suaChiTietProductQuanTri(int id, int soLuong);
	public int xoaHetChiTietSanPham(int id);
	public int xoaSanPhamID(int id);
}
