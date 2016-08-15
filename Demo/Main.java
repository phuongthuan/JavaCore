package JavaCore.Demo;

import java.io.*;
import java.util.Scanner;

/**
 * Created by PhuongThuan on 8/15/2016.
 */
public class Main {
    public static void main(String[] args) {
        String str = "Hello   World";
        String res[] = str.split("\\s+");
        System.out.println(res[0]);
    }
}
