package StringJava;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap một xâu kí tự: ");
        str = sc.nextLine();
        findLongest(str);
    }

    private static void findLongest(String s) {
        int[] xau;
        String[] str = s.split(" ");
        xau = new int[str.length];
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            xau[i] = str[i].length();
            if (str[i].length() > max) {
                max = str[i].length();
            }
        }
        int count = 0;
        for (int j = 0; j < str.length; j++) {
            if (xau[j] == max) {
                System.out.println("xâu : "+str[j]);
                System.out.println("vị trí : " + count);
            }
            count += xau[j]+1;
        }
    }
}