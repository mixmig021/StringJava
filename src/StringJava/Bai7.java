package StringJava;

import java.util.Scanner;

public class Bai7 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập chuỗi s1: ");
            String s1 = sc.nextLine();
            System.out.println("Nhập chuỗi s2: ");
            String s2 = sc.nextLine();
            System.out.println("Chuỗi s1 sau khi loại bỏ s2: " +delete(s1,s2));
    }
    public static String delete(String s1,String s2){
        String temp="";
        for(int i=0;i<s1.length();i++) {
            if (s1.contains(s2) && s1.length()>=s2.length()){
                temp = s1.substring(0,s1.indexOf(s2)) + s1.substring(s1.indexOf(s2)+s2.length(),s1.length() - 1);
                s1=temp;
            } else temp=s1;
        }
        if(temp==s2){
            return "";
        }else return temp;
    }
}