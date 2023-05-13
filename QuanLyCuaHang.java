/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chi
 */
public class QuanLyCuaHang {
    private List<DienThoai> danhSachSanPham;
    private List<DonHang> danhSachDonHang;
    private List<KhachHang> danhSachKhachHang;
    private List<LichSuMuaHang> lichSuMuaHang;
    public QuanLyCuaHang() {
    danhSachSanPham = new ArrayList<>();
    danhSachDonHang = new ArrayList<>();
    danhSachKhachHang = new ArrayList<>();
    lichSuMuaHang = new ArrayList<>();
}
   
    
    public void themSanPham(DienThoai sanPham) {
    danhSachSanPham.add(sanPham);
}

public void xoaSanPham(String maSP) {
    for (DienThoai sanPham : danhSachSanPham) {
        if (sanPham.getMaSP().equals(maSP)) {
            danhSachSanPham.remove(sanPham);
            break;
        }
    }
}

public void hienThiDanhSachSanPham() {
    for (DienThoai sanPham : danhSachSanPham) {
        sanPham.hienThiThongTin();
        System.out.println("----------------------");
    }
}
  public void themDonHang(DonHang donHang) {
      danhSachDonHang.add(donHang);
}
  public void hienThiDanhSachDonHang() {
    for (DonHang donHang : danhSachDonHang) {
        donHang.hienThiThongTin();
        System.out.println("----------------------");
    }
}

public void themKhachHang(KhachHang khachHang) {
    danhSachKhachHang.add(khachHang);
}

public void hienThiDanhSachKhachHang() {
    for (KhachHang khachHang : danhSachKhachHang) {
        khachHang.hienThiThongTin();
        System.out.println("----------------------");
    }
}

public void themLichSuMuaHang(LichSuMuaHang lichSu) {
    lichSuMuaHang.add(lichSu);
}

public void hienThiLichSuMuaHang() {
    for (LichSuMuaHang lichSu : lichSuMuaHang) {
        lichSu.hienThiThongTin();
        System.out.println("----------------------");
    }
}
    
  
}
