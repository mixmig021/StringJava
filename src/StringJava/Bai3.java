package StringJava;

import java.util.Scanner;



public class Bai3 {
    public String st;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bai3 bai3 = new Bai3();
        System.out.println("Nhap xau: ");
        bai3.st = sc.nextLine();
        System.out.println("Xau sau khi chuan hoa: ");
        bai3.chuannHoaChuoi();
        System.out.println(bai3.st);
    }

    public void chuannHoaChuoi() {
        st=st.trim().toLowerCase();
        st = st.replaceAll("\\s+", " ");
        String[] temp= st.split(" ");
        st="";
        for(int i=0;i<temp.length;i++) {
            st+=String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if(i<temp.length-1)
                st+=" ";
        }
    }

}







