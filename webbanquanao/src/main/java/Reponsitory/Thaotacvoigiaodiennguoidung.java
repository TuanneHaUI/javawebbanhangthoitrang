package Reponsitory;

import java.util.List;

import controller.Donhang;
import model.DonHang;
import model.GioHang;
import model.KhuyenMai;
import model.SanPham;

public interface Thaotacvoigiaodiennguoidung {
public boolean CheckSanPhamTonTai(int idSanPham, String mauSac, String kichThuoc);
public boolean Laythongtinsanpham(int id, String maKhuyemMai);
public List<KhuyenMai> LayThongTinKhuyenMai(String maKhuyenMai);
public int LayChiTietSanPham(int maSanPham, String mauSac, String kichCo);
public boolean CapNhatDonHangNguoiDung(int MaNguoiDung, int id, String tenKhachHang, int soDienThoai, String diaChiGiaoHang, String trangThai, int soLuong, float gia, String time);
public boolean UpdateBangChiTiet(int idChiTiet, int soLuong);
public int LaySoLuongChiTiet(int idChiTiet);
public int CheckDonHangTonTaiChua(int MaNguoiDung, int id, String tenKhachHang, int soDienThoai, String diaChiGiaoHang, String trangThai, float gia);
public boolean updateDonHang(int id,int soLuong);
public int LayidDonHang(int MaNguoiDung, int id, String tenKhachHang, int soDienThoai, String diaChiGiaoHang, String trangThai, float gia);
public boolean ThemSanPhamVaoGioHang(int maNguoiDung, int maChiTietSanPham, String mauSac, String kichThuoc, String trangThai,
		float gia, int soLuong, String duongDanAnh, String tenSanpham);
public List<GioHang> LayHetThongTinGioHang();
public boolean updateSoLuongGioHang(int maGioHang, int soLuong, float gia);
public List<DonHang> LayThongTinDonHang();
public boolean DeleteDonHang(int idDonHang);
public boolean updateDonHang(int idDonHang, String trangThai);
}
