package StringJava;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập xâu bất kỳ");
        System.out.println(change(sc.next()));
    }

    static String change(String st){
        System.out.println("xâu sau khi chuyển đổi là : ");
        StringBuilder s = new StringBuilder();
        for(int i=0;i<st.length();i++) {
            if (i%2==0){
                s.append((st.charAt(i) + "").toUpperCase());
            }
            else {
                s.append((st.charAt(i) + "").toLowerCase());
            }
        }
        return s.toString();
    }
}