/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

/**
 *
 * @author chi
 */
public class DienThoai {
    protected String maSP;
    protected String tenSP;
    protected double giaTien;

    public DienThoai(String maSP, String tenSP, double giaTien) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaTien = giaTien;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void hienThiThongTin() {
        System.out.println("Mã SP: " + maSP);
        System.out.println("Tên SP: " + tenSP);
        System.out.println("Giá tiền: " + giaTien);
    }
}
