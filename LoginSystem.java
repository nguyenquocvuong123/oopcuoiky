/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baithi40pt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author chi
 */
public class LoginSystem {
     private static final String filepath = "src/Baithi40pt/login.txt";

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tên người dùng: ");
        String username = scanner.nextLine();

        System.out.print("Mật khẩu: ");
        String password = scanner.nextLine();

        if (xacThuc(username, password)) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Tên người dùng hoặc mật khẩu không hợp lệ!");
        }
    }

    private boolean xacThuc(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] credentials = line.split(",");
                if (credentials.length >= 2) {
                    String storedUsername = credentials[0];
                    String storedPassword = credentials[1];

                    if (storedUsername.equals(username) && storedPassword.equals(password)) {
                        return true;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading credentials file: " + e.getMessage());
        }

        return false;
    }
}
