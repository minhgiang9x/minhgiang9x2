package vonglap_for;
import java.util.Scanner;

public class vd6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương n: ");
        int n = scanner.nextInt();
        scanner.close(); // Đóng Scanner sau khi dùng xong
        
        // Kiểm tra đầu vào hợp lệ
        if(n <= 0) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên lớn hơn 0!");
            return; // Thoát chương trình nếu đầu vào không hợp lệ
        }
        
        // Vòng lặp chính để tạo hình
        for(int i = 1; i <= n; i++) {
            
            // Vòng lặp in khoảng trắng (căn lề phải)
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Vòng lặp in sao
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Xuống dòng sau mỗi hàng
        }
    }
}
/*
 * Giải thích các cải tiến quan trọng:

Kiểm tra đầu vào

Thêm điều kiện if(n <= 0) để xử lý trường hợp nhập số không dương
Sử dụng return để kết thúc chương trình khi phát hiện lỗi
Quản lý tài nguyên

Thêm scanner.close() để tránh rò rỉ bộ nhớ
Cấu trúc code rõ ràng

Thụt lề 4 space theo chuẩn Java
Thêm comments giải thích từng khối code
Tách biệt các vòng lặp in khoảng trắng và in sao
Tính năng mở rộng

Dễ dàng sửa đổi để tạo các hình dạng khác bằng cách thay đổi điều kiện vòng lặp
Ví dụ: Thêm vòng lặp sau để tạo hình kim tự tháp
Sao chép
for(int j = 1; j < i; j++) {
    System.out.print("*");
}
Kết quả khi nhập n=5:

Sao chép
    *
   **
  ***
 ****
*****
 */