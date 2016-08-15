package JavaCore;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by PhuongThuan on 8/10/2016.
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Nhap mot so nguyen bat ky: ");
                int i = input.nextInt();
                System.out.println(i);
                break;
            }catch (InputMismatchException e){
                input.nextLine();
                System.out.println("Chương trình yêu cầu nhập số nguyên =))");
            }
        }
    }
}
