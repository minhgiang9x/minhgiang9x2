package menhde;
import java.util.Scanner;
public class vd9 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập vào số thứ nhất");

        Double a = scanner.nextDouble();
        System.out.println("nhập vào số thứ 2");
        double b = scanner.nextDouble();
        System.out.println("chọn phép tính:+,-,*,/,%");
        char pheptoan= scanner.next().charAt(0);
        double ketqua = 0;
        switch (pheptoan) {
            case '+': ketqua=a+b; break;
            case '-': ketqua=a-b; break;
            case '*' : ketqua=a*b; break;
            case '/' :
            if (b==0) {
                System.out.println("lỗi không chia hết cho 0");  return ;
            }
            else ketqua=a/b;
            break;
            case '%': if (b==0) {
                System.out.println("không hợp lệ"); return;

            }
              else   ketqua=a%b; break;
        }
          System.out.println(ketqua);
        scanner.close();
    }
}

/*
Bài tập 2: Máy tính đơn giản
📌 Đề bài: Viết chương trình nhập vào hai số và một phép toán (+, -, *, /) rồi tính toán kết quả.

🔹 Ví dụ:

Nhập 5, 3, + → Kết quả: 8
Nhập 7, 2, * → Kết quả: 14
Nhập 6, 0, / → Kết quả: "Không thể chia cho 0"
💡 Gợi ý:

Dùng switch-case với từng phép toán +, -, *, /.
Kiểm tra nếu phép chia / mà mẫu số là 0 thì in thông báo lỗi.
 */