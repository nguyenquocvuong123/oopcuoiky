/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

import java.util.Scanner;

/**
 *
 * @author chi
 */
public class Main {
     public static void main(String[] args) {
    QuanLyCuaHang quanLy = new QuanLyCuaHang();
        Scanner scanner = new Scanner(System.in);
        
        

    while (true) {
        System.out.println("===== CHƯƠNG TRÌNH QUẢN LÝ CỬA HÀNG ĐIỆN THOẠI DI ĐỘNG =====");
        System.out.println("1. Đăng ký tài khoản");
        System.out.println("2. Đăng nhập tài khoản");
        System.out.println("3. Thêm sản phẩm điện thoại");
        System.out.println("4. Xóa sản phẩm điện thoại");
        System.out.println("5. Hiển thị danh sách sản phẩm điện thoại");
        System.out.println("6. Thêm đơn hàng");
        System.out.println("7. Hiển thị danh sách đơn hàng");
        System.out.println("8. Thêm khách hàng");
        System.out.println("9. Hiển thị danh sách khách hàng");
        System.out.println("10. Thêm lịch sử mua hàng");
        System.out.println("11. Hiển thị lịch sử mua hàng");
        System.out.println("0. Thoát chương trình");
        System.out.print("Nhập lựa chọn của bạn: ");
        int choice = scanner.nextInt();

        switch (choice) {
                
            case 0:
                System.out.println("Đã thoát chương trình.");
                return;
            case 1:
                    SignUp sigup = new SignUp();
                    sigup.start();
                    break;
                case 2:
                    LoginSystem login = new LoginSystem();
                    login.start();
                    break;
            case 3:
                System.out.println("== Thêm sản phẩm điện thoại ==");
                System.out.print("Nhập mã sản phẩm: ");
                String maSP = scanner.next();
                System.out.print("Nhập tên sản phẩm: ");
                String tenSP = scanner.next();
                System.out.print("Nhập giá tiền: ");
                double giaTien = scanner.nextDouble(); 
                System.out.print("Nhập hệ điều hành: ");
                String heDieuHanh = scanner.next();

                DienThoaiDiDong dienThoai = new DienThoaiDiDong(maSP, tenSP, giaTien, heDieuHanh);
                quanLy.themSanPham(dienThoai);
                System.out.println("Thêm sản phẩm thành công.");
                break;
            case 4:
                System.out.println("== Xóa sản phẩm điện thoại ==");
                System.out.print("Nhập mã sản phẩm cần xóa: ");
                String maSPXoa = scanner.next();
                quanLy.xoaSanPham(maSPXoa);
                System.out.println("Xóa sản phẩm thành công.");
                break;
            case 5:
                System.out.println("== Danh sách sản phẩm điện thoại ==");
                quanLy.hienThiDanhSachSanPham();
                break;
            case 6:
                System.out.println("== Thêm đơn hàng ==");
                System.out.print("Nhập mã đơn hàng: ");
                String maDonHang = scanner.next();
                System.out.print("Nhập mã sản phẩm: ");
                String maSPDonHang = scanner.next();
                System.out.print("Nhập số lượng: ");
                int soLuong = scanner.nextInt();
                DonHang donHang = new DonHang(maDonHang, maSPDonHang, soLuong);
                quanLy.themDonHang(donHang);
                System.out.println("Thêm đơn hàng thành công.");
                break;
            case 7:
                System.out.println("== Danh sách đơn hàng ==");
                quanLy.hienThiDanhSachDonHang();
                break;
            case 8:
                System.out.println("== Thêm khách hàng ==");
                System.out.print("Nhập tên khách hàng: ");
                String tenKhachHang = scanner.next();
                System.out.print("Nhập địa chỉ: ");
                String diaChi = scanner.next();
                System.out.print("Nhập số điện thoại: ");
                String soDienThoai = scanner.next();

                KhachHang khachHang = new KhachHang(tenKhachHang, diaChi, soDienThoai);
                quanLy.themKhachHang(khachHang);
                System.out.println("Thêm khách hàng thành công.");
                break;
            case 9:
                System.out.println("== Danh sách khách hàng ==");
                quanLy.hienThiDanhSachKhachHang();
                break;
            case 10:
                System.out.println("== Thêm lịch sử mua hàng ==");
                System.out.print("Nhập mã đơn hàng: ");
                String maDonHangLS = scanner.next();
                System.out.print("Nhập mã sản phẩm: ");
                String maSPLS = scanner.next();
                System.out.print("Nhập tên khách hàng: ");
                String tenKhachHangLS = scanner.next();
                System.out.print("Nhập ngày mua: ");
                String ngayMua = scanner.next();

                LichSuMuaHang lichSu = new LichSuMuaHang(maDonHangLS, maSPLS, tenKhachHangLS, ngayMua);
                quanLy.themLichSuMuaHang(lichSu);
                System.out.println("Thêm lịch sử mua hàng thành công.");
                break;
            case 11:
                System.out.println("== Lịch sử mua hàng ==");
                quanLy.hienThiLichSuMuaHang();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                break;
        }
    }
    }
}
