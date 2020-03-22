/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0070;

import java.util.Random;
/**
 *
 * @author Duong
 */
public class accountDriverVi {

    public static final String words = "abcdefghijklmnopqstuvwxyz";
    public static final String digits = "0123456789"; //tu 0 den 9
    public static final String UpperWord = words.toUpperCase();
    public static final String all = digits + UpperWord;
    public static Random r1 = new Random();
    private static final String account_default = "1234567890";
    private static final String password_default = "12345678a";


    public static String Captcha() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            int number = randomNumber(0, all.length() - 1);
            char ch = all.charAt(number);
            sb.append(ch);
        }
        System.out.println("Captcha: " + sb.toString());
        System.out.print("Enter captcha: ");
        while (true) {
            String capcha = Validation.checkInputString();
            if (capcha.equalsIgnoreCase(sb.toString())) {
                System.out.println("Đúng");
                return capcha;
            } else {
                System.out.println("Sai");
            }
        }
    }

    public static int randomNumber(int min, int max) {
        return r1.nextInt((max - min) + 1) + min;
    }

    public static String checkCaptcha() {
        while (true) {
            String capcha = Validation.checkInputString();
            if (capcha.equalsIgnoreCase(Captcha())) {
                System.out.println("Đúng");
                return capcha;
            } else {
                System.out.println("Sai");
            }
        }
    }

    public static void checking() {
        System.out.print("Acount number: ");
        String account = checkInputAccount();
        System.out.print("Password: ");
        String password = checkInputPassword();
        Captcha();
    }
      public static String checkInputAccount() {
        String result;
        while (true) {
            result = Validation.checkInputString();
            String patten = "d{10}";
            if (result.equals(account_default) || result.matches(patten)) {
                System.out.println("Đúng");
                return result;
            } else {
                System.out.println("Số tài khoản phải là một số và phải có 10 chữ số(VD:1234567890)");
            }
        }
    }

    public static String checkInputPassword() {
        String result;
        while (true) {
            result = Validation.checkInputString();
            String patten1 = "^\\d+";
            String patten2 = "^\\w+";
            if (result.length() < 8 && result.length() > 31 && !result.matches(patten1) && !result.matches(patten2) || result.equals(password_default)) {
                System.out.println("Đúng");
                return result;
            } else {
                System.out.println("Mật khẩu phải trong khoảng 8-31 ký tự vào phải và phải chứa ký tự và số (VD: 12345678a) ");
            }
        }
    }
}

