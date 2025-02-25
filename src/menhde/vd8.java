package menhde;
import java.util.Scanner;
public class vd8 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("vui lòng nhập số tuổi: ");
        int tuoi= scanner.nextInt();
        String ketqua;
        switch (tuoi) {
            case 6: ketqua="học lớp 1"; break;
            default: ketqua= "chưa đủ tuổi đi học"; break;
        }
        System.out.println(ketqua);
        scanner.close();
    }
}
