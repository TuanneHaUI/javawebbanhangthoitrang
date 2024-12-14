package model;

public class KhuyenMai {
private String maKhuyenMai, noiDungKhuyenMai;
private float phanTramKhuyenMai;
public KhuyenMai(String maKhuyenMai, String noiDungKhuyenMai, float phanTramKhuyenMai) {
	super();
	this.maKhuyenMai = maKhuyenMai;
	this.noiDungKhuyenMai = noiDungKhuyenMai;
	this.phanTramKhuyenMai = phanTramKhuyenMai;
}
public KhuyenMai() {
	super();
}
public String getMaKhuyenMai() {
	return maKhuyenMai;
}
public void setMaKhuyenMai(String maKhuyenMai) {
	this.maKhuyenMai = maKhuyenMai;
}
public String getNoiDungKhuyenMai() {
	return noiDungKhuyenMai;
}
public void setNoiDungKhuyenMai(String noiDungKhuyenMai) {
	this.noiDungKhuyenMai = noiDungKhuyenMai;
}
public float getPhanTramKhuyenMai() {
	return phanTramKhuyenMai;
}
public void setPhanTramKhuyenMai(float phanTramKhuyenMai) {
	this.phanTramKhuyenMai = phanTramKhuyenMai;
}

}
