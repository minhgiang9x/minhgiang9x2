package menhde;
import java.util.Scanner;
public class vd7 {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("vui lòng nhập vào nhiệt độ của nước: ");
        int t=scanner.nextInt();
        String ketqua;
        switch (t){
            case 100: ketqua="nước sôi"; break;
            default: ketqua= "chưa sôi"; break;}
            System.out.print(ketqua);
            scanner.close();

    }
}
