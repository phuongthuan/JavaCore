package JavaCore;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by PhuongThuan on 8/13/2016.
 */
public class Bai3 {
    public static double action(String str) {

        String sp[] = str.split("\\s+");

        int a = Integer.parseInt(sp[0]);
        int b = Integer.parseInt(sp[2]);
        if (sp[1].equals("+")) {
            return a + b;
        } else if (sp[1].equals("-")) {
            return a - b;
        } else if (sp[1].equals("*")) {
            return a * b;
        } else {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                System.out.printf(e.toString());
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Nhập vào phép toán theo cấu trúc: 111 + 222");
                String str = input.nextLine();
                System.out.println(action(str));
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Bạn đã nhập sai cấu trúc !!");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
        }

    }
}
