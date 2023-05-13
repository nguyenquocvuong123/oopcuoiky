/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

/**
 *
 * @author chi
 */
public class KhachHang {
    private String tenKhachHang;
    private String diaChi;
    private String soDienThoai;
    public KhachHang(String tenKhachHang, String diaChi, String soDienThoai) {
    this.tenKhachHang = tenKhachHang;
    this.diaChi = diaChi;
    this.soDienThoai = soDienThoai;
}

public String getTenKhachHang() {
    return tenKhachHang;
}

public String getDiaChi() {
    return diaChi;
}

public String getSoDienThoai() {
    return soDienThoai;
}

public void hienThiThongTin() {
    System.out.println("Tên khách hàng: " + tenKhachHang);
    System.out.println("Địa chỉ: " + diaChi);
    System.out.println("Số điện thoại: " + soDienThoai);
}

}
