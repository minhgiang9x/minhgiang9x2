package menhde;
import java.util.Scanner; // ✅ Import trước khi sử dụng

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Xin chào " + name);
        sc.close();
    }
}
