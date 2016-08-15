package JavaCore;

import java.util.Scanner;

/**
 * Created by PhuongThuan on 8/13/2016.
 */
public class Bai2 {
    public static void main(String[] args) {
        int[] array = new int[10];

        Scanner input = new Scanner(System.in);
        while (true){
            for (int i = 0; i < array.length; i++) {
                try{
                    System.out.println("Nhập vị trí của mảng: ");
                    i = input.nextInt();
                    System.out.println("Nhập giá trị của phần tử: ");
                    int value = input.nextInt();
                    array[i] = value;
                    System.out.println("Bạn vừa nhập giá trị: " + value + " Vào vị trí: " + i + " của mảng !!");
                    break;
                }catch (ArrayIndexOutOfBoundsException e){
                    input.nextLine();
                    System.out.println("Vượt quá độ dài của mảng !");
                    System.out.println("==========================");
                }
            }
        }
    }
}
