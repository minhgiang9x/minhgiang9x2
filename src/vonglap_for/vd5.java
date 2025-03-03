package vonglap_for; 
import java.util.*;

public class vd5 {
    public static void main(String[] args){
        // Tạo đối tượng Scanner để đọc dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // In ra thông báo yêu cầu nhập số n
        System.out.print("nhập vào n ");
        
        // Đọc số nguyên n mà người dùng nhập vào
        int n = scanner.nextInt();
        
        // Vòng lặp ngoài: từ i = 1 đến i = n (mỗi i tương ứng với một dòng)
        for (int i = 1; i <= n; i++) { 
            // Vòng lặp trong: từ j = 1 đến j = i, mỗi vòng lặp in ra một dấu "*"
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Sau khi in xong từng dòng (từng hàng sao), in xuống dòng mới

            System.out.println();
        }
        
        // Đóng Scanner để giải phóng tài nguyên
        scanner.close();
    }
}
/*
 * Giải thích chi tiết:
Package và Import:

package vonglap_for; xác định rằng lớp vd5 thuộc package vonglap_for.
import java.util.*; giúp import tất cả các lớp trong gói java.util, trong đó có Scanner dùng để đọc dữ liệu từ bàn phím.
Lớp và Phương thức main:

public class vd5 định nghĩa một lớp công khai có tên vd5.
Phương thức main là điểm bắt đầu thực thi của chương trình Java.
Đọc Dữ liệu từ Bàn phím:

Scanner scanner = new Scanner(System.in); tạo đối tượng Scanner để đọc dữ liệu từ đầu vào chuẩn (bàn phím).
System.out.print("nhập vào n "); in ra thông báo yêu cầu người dùng nhập số.
int n = scanner.nextInt(); đọc một số nguyên từ bàn phím và lưu vào biến n.
Vòng lặp In Hình Tam Giác Sao:

Vòng lặp ngoài (for):
for (int i = 1; i <= n; i++)
Duyệt từ 1 đến n, mỗi lần lặp tương ứng với một dòng (hàng) sẽ được in ra.
Vòng lặp trong (for):
for (int j = 1; j <= i; j++)
Với mỗi giá trị của i, vòng lặp trong chạy từ 1 đến i, in ra i dấu sao.
System.out.print("*"); in dấu sao mà không xuống dòng.
Sau khi vòng lặp trong kết thúc, System.out.println(); in một dòng trống để chuyển sang dòng mới cho lần lặp tiếp theo.
Đóng Scanner:

scanner.close(); đóng đối tượng Scanner sau khi sử dụng để giải phóng tài nguyên.
Kết quả:
Nếu người dùng nhập vào n = 5, chương trình sẽ in ra:

*
**
***
****
*****
 */
