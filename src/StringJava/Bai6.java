package StringJava;

import java.util.Scanner;

public class Bai6 {
    public String st;
    public static void main(String[] args) {
        Bai6 bai6 = new Bai6();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi ký tự:");
        bai6.st = sc.nextLine();
        System.out.println("Chuỗi sau khi xử lý:");
        bai6.getSort();
        System.out.println(bai6.st);
    }

    public  void getSort() {
        String[] temp = st.split(" ");
        String t = "";
        st="";
        for (int i = 0; i < temp.length - 1; i++) {
            if(temp[i].length()>10||temp.length>20){
                System.out.println("chuỗi phải không quá 20 từ, mỗi từ không quá 10 kí tự");
            }else {
                for (int j = i + 1; j < temp.length; j++) {
                    if (temp[i].compareTo(temp[j]) > 0) {
                        t = temp[i];
                        temp[i] = temp[j];
                        temp[j] = t;
                    }
                }
            }
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }

    }
}