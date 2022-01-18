package StringJava;

import java.util.Scanner;

public class Bai1{
    public static void main(String[] args) {
        int count=0;
        for (int i=100000;i<=999999;i++){
            if(check(i)==true){
//                System.out.println("các số thuận nghịch");
//                System.out.println(i);
                count++;

            }
        }
        System.out.println("tổng số thuận ngịch :"+count);
    }

    static boolean check(int number){
        String s= String.valueOf(number);
        int size = s.length();
        for (int i = 0; i < (size/2); i++) {
            if (s.charAt(i) != s.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

}