package StringJava;

import java.util.Scanner;

public class Bai5 {
    public String st;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai5 bai5 = new Bai5();
        System.out.println("Nhap xau: ");
        bai5.st = sc.nextLine();
        System.out.println("Xau sau khi chuan hoa: ");
        bai5.chuannHoaChuoi();
        System.out.println(bai5.st);
    }

    public void chuannHoaChuoi() {
        st=st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] t= st.split(" ");
        int a = t.length;
        st = String.valueOf(t[a-1].charAt(0)).toUpperCase() + t[a-1].substring(1)+" ";
        for(int i=0;i<a-1;i++) {
                st += String.valueOf(t[i].charAt(0)).toUpperCase() + t[i].substring(1);
            if(i<a-1);
            st+=" ";
        }
    }

}
