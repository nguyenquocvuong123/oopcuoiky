/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author QuangMinh
 */
public class SignUp {
    private static final String filepath = "src/Baithi40pt/login.txt";

    public static void main(String[] args) {
        SignUp dangKy = new SignUp();
        dangKy.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên người dùng: ");
        String username = scanner.nextLine();

        System.out.print("Mật khẩu: ");
        String password = scanner.nextLine();

        if (dangKy(username, password)) {
            System.out.println("Đăng ký thành công!");
        } else {
            System.out.println("Đăng ký không thành công!");
        }
    }

    private boolean dangKy(String username, String password) {
        try (FileWriter writer = new FileWriter(filepath, true)) {
            String credentials = username + "," + password + "\n";
            writer.write(credentials);
            return true;
        } catch (IOException e) {
            System.err.println("Lỗi ghi tệp chứng thực: " + e.getMessage());
        }
        return false;
    }   
}
