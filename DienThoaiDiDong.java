/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

/**
 *
 * @author chi
 */
public class DienThoaiDiDong extends DienThoai {
    private String heDieuHanh;

    public DienThoaiDiDong(String maSP, String tenSP, double giaTien, String heDieuHanh) {
        super(maSP, tenSP, giaTien);
        this.heDieuHanh = heDieuHanh;
    }

    public String getHeDieuHanh() {
        return heDieuHanh;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Hệ điều hành: " + heDieuHanh);
    }
}
