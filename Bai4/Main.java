package JavaCore.Bai4;

import java.util.Scanner;

/**
 * Created by PhuongThuan on 8/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Nhập vào 3 cạnh của tam giác: ");
            double side1 = input.nextDouble();
            double side2 = input.nextDouble();
            double side3 = input.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("3 Cạnh trên tạo thành tam giác");
        }catch (NhapSaiException e){
            System.out.println(e.getMessage());
        }
    }
}
