package menhde;
import java.util.Scanner;

public class if_else  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Chẵn");
        } else {
            System.out.println("Lẻ");
        }
        sc.close();
    }
}
/*
Kiểm tra số chẵn/lẻ

Nhập số nguyên, in ra "Chẵn" nếu chia hết cho 2, ngược lại in "Lẻ".

Ví dụ: Input 5 → Output "Lẻ"
 */