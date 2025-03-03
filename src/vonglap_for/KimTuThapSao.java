package vonglap_for;
public class KimTuThapSao {
    public static void main(String[] args) {
        // Số hàng của kim tự tháp (số cấp)
        int n = 5;
        
        // Vòng lặp ngoài: duyệt từng hàng từ 1 đến n
        for (int i = 1; i <= n; i++) {
            // In ra khoảng trắng ở đầu mỗi hàng
            // Số khoảng trắng = n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // In ra các dấu sao cho hàng thứ i
            // Số sao = 2 * i - 1
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng sau khi in xong từng hàng
            System.out.println();
        }
    }
}
/*
 * Giải thích chi tiết:
Khởi tạo số hàng của kim tự tháp:

int n = 5;
Đây là số cấp (số hàng) của kim tự tháp. Bạn có thể thay đổi giá trị này để in kim tự tháp có số hàng khác.
Vòng lặp ngoài (for):

for (int i = 1; i <= n; i++) { ... }
Vòng lặp này chạy từ 1 đến n (ở đây là 5). Mỗi lần lặp tương ứng với một hàng của kim tự tháp.
Biến i đại diện cho hàng hiện tại, từ 1 (hàng trên cùng) đến n (hàng dưới cùng).
Vòng lặp đầu tiên bên trong (in khoảng trắng):

for (int j = 1; j <= n - i; j++) { System.out.print(" "); }
Mục đích: Để căn giữa kim tự tháp, bạn cần in ra các khoảng trắng trước dấu sao.
Số khoảng trắng cần in ở hàng thứ i là n - i.
Ví dụ, với n = 5 và i = 1 → in 4 khoảng trắng; với i = 3 → in 2 khoảng trắng.
Vòng lặp thứ hai bên trong (in dấu sao):

for (int k = 1; k <= 2 * i - 1; k++) { System.out.print("*"); }
Mục đích: In ra các dấu sao tạo thành hình kim tự tháp.
Số sao cần in ở hàng thứ i là 2 * i - 1.
Ví dụ, ở hàng 1: 2 * 1 - 1 = 1 sao; ở hàng 2: 2 * 2 - 1 = 3 sao; ở hàng 3: 2 * 3 - 1 = 5 sao, và như vậy.
Xuống dòng:

System.out.println();
Sau khi in xong các khoảng trắng và dấu sao của một hàng, lệnh này xuống dòng để bắt đầu in hàng tiếp theo.
Kết quả khi chạy chương trình (với n = 5):
markdown
Sao chép
Chỉnh sửa
    *
   ***
  *****
 *******
*********
Hàng đầu tiên có 4 khoảng trắng và 1 dấu sao.
Hàng thứ hai có 3 khoảng trắng và 3 dấu sao.
Hàng thứ ba có 2 khoảng trắng và 5 dấu sao.
Hàng thứ tư có 1 khoảng trắng và 7 dấu sao.
Hàng thứ năm không có khoảng trắng và 9 dấu sao.
Tóm tắt:
Vòng lặp ngoài: Xác định số hàng của kim tự tháp.
Vòng lặp in khoảng trắng: Giúp căn giữa các dấu sao theo từng hàng.
Vòng lặp in dấu sao: In số lượng dấu sao tăng dần theo công thức 2 * i - 1.
System.out.println(): Dùng để xuống dòng sau mỗi hàng.
 */