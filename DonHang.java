/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

/**
 *
 * @author chi
 */
public class DonHang {
    private String maDonHang;
    private String maSP;
    private int soLuong;

    public DonHang(String maDonHang, String maSP, int soLuong) {
        this.maDonHang = maDonHang;
        this.maSP = maSP;
        this.soLuong = soLuong;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public String getMaSP() {
        return maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("Mã đơn hàng: " + maDonHang);
        System.out.println("Mã sản phẩm: " + maSP);
        System.out.println("Số lượng: " + soLuong);
    }
}
