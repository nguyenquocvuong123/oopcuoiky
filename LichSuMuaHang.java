/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

/**
 *
 * @author chi
 */
public class LichSuMuaHang {
    private String maDonHang;
    private String maSP;
    private String tenKhachHang;
    private String ngayMua;
    public LichSuMuaHang(String maDonHang, String maSP, String tenKhachHang, String ngayMua) {
    this.maDonHang = maDonHang;
    this.maSP = maSP;
    this.tenKhachHang = tenKhachHang;
    this.ngayMua = ngayMua;
}

public String getMaDonHang() {
    return maDonHang;
}

public String getMaSP() {
    return maSP;
}

public String getTenKhachHang() {
    return tenKhachHang;
}

public String getNgayMua() {
    return ngayMua;
}

public void hienThiThongTin() {
    System.out.println("Mã đơn hàng: " + maDonHang);
    System.out.println("Mã sản phẩm: " + maSP);
    System.out.println("Tên khách hàng: " + tenKhachHang);
    System.out.println("Ngày mua: " + ngayMua);
}
}
